package br.com.trabalhogof.domain.to;

import java.util.Date;

public class EmprestimoTO {

	private Long idUsuario;
	private Long idExemplar;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private String status;
	private Boolean multaQuitada;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdExemplar() {
		return idExemplar;
	}

	public void setIdExemplar(Long idExemplar) {
		this.idExemplar = idExemplar;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getMultaQuitada() {
		return multaQuitada;
	}

	public void setMultaQuitada(Boolean multaQuitada) {
		this.multaQuitada = multaQuitada;
	}

}
