package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.to.LivroTO;

public abstract class Livro {
	
	private Long id;
	private String titulo;
	private TipoLivro tipo;
	private List<Exemplar> exemplares;
	
	/**
	 * Construtor padrao
	 */
	public Livro() {
		super();
	}
	
	/**
	 * 
	 * @param livroTO
	 */
	public Livro(LivroTO livroTO) {
		this.id = livroTO.getId();
		this.titulo = livroTO.getTitulo();
	}
	
	/**
	 * Retorna verdadeiro se o livro tem exemplares disponiveis
	 * 
	 * @return
	 */
	public boolean disponivel() {
		for (Exemplar exemplar : exemplares) {
			if (exemplar.disponivel())
				return true;
		}
		return false;
	}
	
	/**
	 * Realiza a reserva do livro para o usuario
	 * 
	 * @param usuario
	 * @return
	 */
	public Reserva reservar(Usuario usuario) {
		Reserva reserva = new Reserva();
		reserva.setLivro(this);
		reserva.setUsuario(usuario);
		reserva.setStatus(StatusReserva.ATIVA);
		return reserva;
	}
	
	public void baixarReserva(Usuario usuario) {
		
	}
	
	/**
	 * Verifica se o livro ja foi reservado pelo usuario
	 * 
	 * @param usuario
	 * @return
	 */
	public boolean possuiReserva(Usuario usuario) {
		List<Reserva> reservas = usuario.getReservas();
		
		if (reservas == null)
			return false;
		
		for (Reserva reserva : reservas) {
			if(reserva.getStatus().possuiReserva())
				return true;
		}
		
		return false;
	}
	
	public void cancelarReserva(Usuario usuario) {
		
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public TipoLivro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLivro tipo) {
		this.tipo = tipo;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	
}