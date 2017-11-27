package br.com.trabalhogof.domain.entity;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

import br.com.trabalhogof.domain.CalculadorDeMulta;

public class Emprestimo extends CalculadorDeMulta {
	
	private Usuario usuario;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private StatusEmprestimo status;
	private Boolean multaQuitada;
	
	/**
	 * Retorna verdadeiro se o emprestimo estiver vigente
	 * @return
	 */
	public boolean isEmprestimoVigente() {
		return StatusEmprestimo.ATIVO.equals(getStatus());
	}

	/**
	 * Definicao do valor da multa diaria
	 */
	@Override
	public float valorMultaAtrazo() {
		return 1.0f;
	}

	/**
	 * Retorna a quantidade de dias de atrazo
	 */
	@Override
	public int quantidadeDiasAtrazo() {
		DateTime dataInicio = new DateTime(dataEmprestimo);
		DateTime dataFinal = new DateTime(dataDevolucao);
		
		Days days = Days.daysBetween(dataInicio, dataFinal);
		
		int maximoDiasPermitidos = 1;
		
		return days.getDays() - maximoDiasPermitidos;
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