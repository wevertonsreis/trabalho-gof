package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.to.ExemplarTO;
import br.com.trabalhogof.domain.to.UsuarioTO;

public class Exemplar {
	
	private Long id;
	private Livro livro;
	private List<Emprestimo> emprestimos;
	
	/**
	 * Metodo responsavel por criar um {@link Exemplar} a partir de um {@link UsuarioTO}
	 * 
	 * @param exemplarTO
	 * @return
	 */
	public static Exemplar newExemplar(ExemplarTO exemplarTO) {
		Exemplar exemplar = new Exemplar();
		exemplar.setId(exemplarTO.getId());
		return exemplar;
	}
	
	/**
	 * Retorna verdadeiro se o exemplar esta disponivel para emprestimo
	 * 
	 * @return
	 */
	public boolean disponivel() {
		Emprestimo emprestimoVigente = getEmprestimoVigente();
		if (emprestimoVigente == null)
			return true;
		return false;
	}
	
	/**
	 * Responsavel por emprestar o exemplar ao usuario
	 * 
	 * @param usuario
	 */
	public void emprestar(Usuario usuario) {
		if (getLivro().possuiReserva(usuario)){
			getLivro().baixarReserva(usuario);
		}
	}
	
	public float devolver() {
		return 0.0f;
	}
	
	/**
	 * Retorna o {@link Emprestimo} vigente desse exemplar
	 * 
	 * @return
	 */
	public Emprestimo getEmprestimoVigente() {
		if (emprestimos != null && !emprestimos.isEmpty()) {
			for (Emprestimo emprestimo : emprestimos) {
				if (emprestimo.isEmprestimoVigente()) {
					return emprestimo;
				}
			}
		}
		return null;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
