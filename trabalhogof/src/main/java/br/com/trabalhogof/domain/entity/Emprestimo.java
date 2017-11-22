package br.com.trabalhogof.domain.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Emprestimo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Livro livro;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataEmprestimo;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataDevolucao;
	
	@Enumerated(value = EnumType.STRING)
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
