package br.com.trabalhogof.domain.entity;

import java.util.Date;

public class Reserva {

	private Long id;
	private Livro livro;
	private Usuario usuario;
	private Date dataRetirada;
	private Status status;
	
	/**
	 * Retorna verdadeiro se a reserva esta ativa
	 * 
	 * @return
	 */
	public boolean isAtiva() {
		return StatusReserva.ATIVA.equals(status);
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}