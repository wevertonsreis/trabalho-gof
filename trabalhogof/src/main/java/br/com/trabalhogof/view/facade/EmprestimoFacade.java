package br.com.trabalhogof.view.facade;

import br.com.trabalhogof.application.LivroServices;
import br.com.trabalhogof.domain.to.EmprestimoTO;
import br.com.trabalhogof.domain.to.ExemplarTO;
import br.com.trabalhogof.domain.to.UsuarioTO;

/**
 * Classe de fachada para os servicos de emprestimos
 */
public class EmprestimoFacade {

	private EmprestimoFacade() {}
	
	/**
	 * Responsavel por localizar o exemplar
	 * 
	 * @param idExemplar Identificador do exemplar
	 * @return
	 */
	public static ExemplarTO localizarExemplar(Long idExemplar) {
		return LivroServices.localizarExemplar(idExemplar);
	}
	
	/**
	 * Responsavel por localizar o usuario
	 * 
	 * @param idUsuario
	 * @return
	 */
	public static UsuarioTO localizarUsuario(Long idUsuario) {
		return LivroServices.localizarUsuario(idUsuario);
	}
	
	/**
	 * Responsavel por realizar o emprestimo
	 * 
	 * @param exemplarTO
	 * @param usuarioTO
	 */
	public static void realizarEmprestimo(ExemplarTO exemplarTO, UsuarioTO usuarioTO) {
		LivroServices.realizarEmprestimo(exemplarTO, usuarioTO);
	}
	
	/**
	 * Responsavel por buscar o emprestimo referente ao exemplar
	 * 
	 * @param idExemplar Exemplar a ser utilizada para o localizacao
	 * @return
	 */
	public static EmprestimoTO mostrarEmprestimo(Long idExemplar) {
		return LivroServices.localizarEmprestimo(idExemplar);
	}
	
	/**
	 * Responsavel por realizar a devolucao do exemplar
	 * 
	 * @param idExemplar Exemplar a ser devolvido
	 * @return Valor da multa
	 */
	public static float realizarDevolucao(Long idExemplar) {
		return LivroServices.realizarDevolucao(idExemplar);
	}
	
	/**
	 * Responsavel por registrar o pagamento da multa
	 * 
	 * @param idExemplar Exemplar emprestado que a multa sera registrada como quitada
	 */
	public static void registrarPagamentoMulta(Long idExemplar) {
		LivroServices.registrarPagamentoMulta(idExemplar);
	}

}
