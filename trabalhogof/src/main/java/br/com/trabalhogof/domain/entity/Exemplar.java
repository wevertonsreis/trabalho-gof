package br.com.trabalhogof.domain.entity;

import java.util.List;

public class Exemplar {
	
	private Long id;
	private Livro livro;
	private List<Emprestimo> emprestimos;
	
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
	
	public void emprestar(Usuario usuario) {
		//TODO IMPLEMENTAR
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
