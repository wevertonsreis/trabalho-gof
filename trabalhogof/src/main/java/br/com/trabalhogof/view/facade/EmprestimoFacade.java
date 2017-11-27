package br.com.trabalhogof.view.facade;

import br.com.trabalhogof.application.LivroServices;
import br.com.trabalhogof.domain.to.EmprestimoTO;
import br.com.trabalhogof.domain.to.UsuarioTO;

/**
 * Classe de fachada para os servicos de emprestimos
 */
public class EmprestimoFacade {

	private EmprestimoFacade() {}
	
	public static void realizarEmprestimo(Long idExemplar, UsuarioTO usuarioTO) {
		
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
