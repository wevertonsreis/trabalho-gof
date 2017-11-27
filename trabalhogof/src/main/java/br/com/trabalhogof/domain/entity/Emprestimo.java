package br.com.trabalhogof.domain.entity;

import java.util.Date;

public class Emprestimo {
	
	private Usuario usuario;
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
		return 0.0f;
	}
	
	/**
	 * Retorna verdadeiro se o emprestimo estiver vigente
	 * @return
	 */
	public boolean isEmprestimoVigente() {
		return StatusEmprestimo.ATIVO.equals(getStatus());
	}

	/*
	 * Getters e Setters
	 */
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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