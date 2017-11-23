package br.com.trabalhogof.domain.entity;

import java.util.Date;

public class Emprestimo {
	
	private Long id;
	private Livro livro;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private StatusEmprestimo status;
	
	private Boolean multaQuitada;
	
	/**
	 * Responsavel por realizar o calculo da multa
	 * 
	 * @return
	 */
	public float calcularMulta() {
		//TODO IMPLEMENTAR
		return 0.0f;
	}

	/*
	 * Getters e Setters
	 */
	
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

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public StatusEmprestimo getStatus() {
		return status;
	}

	public void setStatus(StatusEmprestimo status) {
		this.status = status;
	}

	public Boolean getMultaQuitada() {
		return multaQuitada;
	}

	public void setMultaQuitada(Boolean multaQuitada) {
		this.multaQuitada = multaQuitada;
	}
	
}
