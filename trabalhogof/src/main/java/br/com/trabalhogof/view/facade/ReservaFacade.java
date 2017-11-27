package br.com.trabalhogof.view.facade;

import java.util.List;

import br.com.trabalhogof.application.LivroServices;
import br.com.trabalhogof.domain.entity.Reserva;
import br.com.trabalhogof.domain.to.LivroTO;
import br.com.trabalhogof.domain.to.UsuarioTO;

/**
 * Classe de fachada para os servicos de reserva
 */
public class ReservaFacade {

	private ReservaFacade() {}

	/**
	 * Acao responsavel por realizar a reserva
	 * 
	 * @param idLivro Identificador do licro a ser reservado
	 * @param usuarioTO Usuario solicitante
	 */
	public static void reservarLivro(Long idLivro, UsuarioTO usuarioTO) {
		LivroTO livroTO = LivroServices.localizarLivro(idLivro);
		LivroServices.realizarReserva(livroTO, usuarioTO);
	}
	
	/**
	 * Acao responsavel por listar as reservas
	 * 
	 * @param usuarioTO Usuario solicitante
	 * @return
	 */
	public static List<Reserva> listarReservas(UsuarioTO usuarioTO) {
		return LivroServices.listarReservas(usuarioTO);
	}
	
	/**
	 * Acao responsavel por cancelar reserva
	 * 
	 * @param idLivro Identificador do livro que esta reservado
	 * @param usuarioTO Usuario solicitante
	 */
	public static void cancelarReserva(Long idLivro, UsuarioTO usuarioTO) {
		LivroTO livroTO = LivroServices.localizarLivro(idLivro);
		LivroServices.cancelarReserva(livroTO, usuarioTO);
	}
	
}