package br.com.trabalhogof.application;

import java.util.List;

import br.com.trabalhogof.domain.entity.Livro;
import br.com.trabalhogof.domain.entity.Reserva;
import br.com.trabalhogof.domain.entity.Usuario;
import br.com.trabalhogof.domain.repository.LivroRepository;
import br.com.trabalhogof.domain.repository.ReservaRepository;
import br.com.trabalhogof.domain.to.LivroTO;
import br.com.trabalhogof.domain.to.UsuarioTO;

public class LivroServices {
	
	public static LivroTO localizarLivro(Long id) {
		Livro livro = LivroRepository.find(id);
		LivroTO livroTO = new LivroTO(livro.getId(), livro.getTitulo());
		return livroTO;
	}
	
	public static void realizarReserva(LivroTO livroTO, UsuarioTO usuarioTO) {
		Livro livro = Livro.newLivro(livroTO);
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
		Livro livro = Livro.newLivro(livroTO);
		Usuario usuario = Usuario.newUsuario(usuarioTO);
		livro.cancelarReserva(usuario);
	}
}
