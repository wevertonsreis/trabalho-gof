package br.com.trabalhogof.domain.emprestimo.entity;

import java.util.Date;

import br.com.trabalhogof.domain.entity.Exemplar;
import br.com.trabalhogof.domain.entity.Usuario;

public class Emprestimo {
	
	private Usuario usuario;
	private Exemplar exemplar;
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
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
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
