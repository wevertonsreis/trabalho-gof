package br.com.trabalhogof.application;

import java.util.List;

import br.com.trabalhogof.domain.entity.Emprestimo;
import br.com.trabalhogof.domain.entity.Exemplar;
import br.com.trabalhogof.domain.entity.Livro;
import br.com.trabalhogof.domain.entity.Reserva;
import br.com.trabalhogof.domain.entity.Usuario;
import br.com.trabalhogof.domain.factory.LivroFactory;
import br.com.trabalhogof.domain.repository.ExemplarRepository;
import br.com.trabalhogof.domain.repository.LivroRepository;
import br.com.trabalhogof.domain.repository.ReservaRepository;
import br.com.trabalhogof.domain.repository.UsuarioRepository;
import br.com.trabalhogof.domain.to.EmprestimoTO;
import br.com.trabalhogof.domain.to.ExemplarTO;
import br.com.trabalhogof.domain.to.LivroTO;
import br.com.trabalhogof.domain.to.UsuarioTO;

public class LivroServices {
	
	private LivroServices() {}
	
	public static LivroTO localizarLivro(Long id) {
		Livro livro = LivroRepository.find(id);
		return new LivroTO(livro.getId(), livro.getTitulo(), livro.getTipo().name());
	}
	
	public static void realizarReserva(LivroTO livroTO, UsuarioTO usuarioTO) {
		Livro livro = LivroFactory.createLivro(livroTO);
		Usuario usuario = Usuario.newUsuario(usuarioTO);
		if (livro.disponivel() && usuario.podeReservar()) {
			Reserva reserva = livro.reservar(usuario);
			ReservaRepository.add(reserva);
		}
	}
	
	public static List<Reserva> listarReservas(UsuarioTO usuarioTO) {
		Usuario usuario = Usuario.newUsuario(usuarioTO);
		return ReservaRepository.list(usuario);
	}

	public static void cancelarReserva(LivroTO livroTO, UsuarioTO usuarioTO) {
		Livro livro = LivroFactory.createLivro(livroTO);
		Usuario usuario = Usuario.newUsuario(usuarioTO);
		livro.cancelarReserva(usuario);
	}

	public static EmprestimoTO localizarEmprestimo(Long idExemplar) {
		Exemplar exemplar = ExemplarRepository.find(idExemplar);
		Emprestimo emprestimoVigente = exemplar.getEmprestimoVigente();
		
		EmprestimoTO emprestimoTO = new EmprestimoTO();
		emprestimoTO.setDataDevolucao(emprestimoVigente.getDataDevolucao());
		emprestimoTO.setDataEmprestimo(emprestimoVigente.getDataEmprestimo());
		emprestimoTO.setIdExemplar(idExemplar);
		emprestimoTO.setIdUsuario(emprestimoVigente.getUsuario().getId());
		emprestimoTO.setMultaQuitada(emprestimoVigente.getMultaQuitada());
		emprestimoTO.setStatus(emprestimoVigente.getStatus().name());
		
		return emprestimoTO;
	}
	
	public static ExemplarTO localizarExemplar(Long idExemplar) {
		Exemplar exemplar = ExemplarRepository.find(idExemplar);
		return new ExemplarTO(exemplar.getId(), exemplar.getLivro().getId());
	}
	
	public static float realizarDevolucao(Long idExemplar) {
		Exemplar exemplar = ExemplarRepository.find(idExemplar);
		exemplar.devolver();
		Emprestimo emprestimoVigente = exemplar.getEmprestimoVigente();
		return emprestimoVigente.calcularMulta();
	}
	
	public static void registrarPagamentoMulta(Long idExemplar) {
		Exemplar exemplar = ExemplarRepository.find(idExemplar);
		Emprestimo emprestimoVigente = exemplar.getEmprestimoVigente();
		emprestimoVigente.setMultaQuitada(true);
	}

	public static UsuarioTO localizarUsuario(Long idUsuario) {
		return UsuarioRepository.find(idUsuario);
	}

	public static void realizarEmprestimo(ExemplarTO exemplarTO, UsuarioTO usuarioTO) {
		Exemplar exemplar = Exemplar.newExemplar(exemplarTO);
		Usuario usuario = Usuario.newUsuario(usuarioTO);
		
		if (exemplar.disponivel() && usuario.podeTomarEmprestimo()) {
			exemplar.emprestar(usuario);
		}
		
	}
	
}
