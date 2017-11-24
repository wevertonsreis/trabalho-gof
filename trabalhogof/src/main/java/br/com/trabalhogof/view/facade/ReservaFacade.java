package br.com.trabalhogof.view.facade;

import java.util.List;

import br.com.trabalhogof.application.LivroServices;
import br.com.trabalhogof.domain.entity.Reserva;
import br.com.trabalhogof.domain.to.LivroTO;
import br.com.trabalhogof.domain.to.UsuarioTO;

public class ReservaFacade {

	public static void reservarLivro(Long idLivro, UsuarioTO usuarioTO) {
		LivroTO livroTO = LivroServices.localizarLivro(idLivro);
		LivroServices.realizarReserva(livroTO, usuarioTO);
	}
	
	public static List<Reserva> listarReservas(UsuarioTO usuarioTO) {
		return LivroServices.listarReservas(usuarioTO);
	}
	
	public static void cancelarReserva(Long idLivro, UsuarioTO usuarioTO) {
		LivroTO livroTO = LivroServices.localizarLivro(idLivro);
		LivroServices.cancelarReserva(livroTO, usuarioTO);
	}
	
}