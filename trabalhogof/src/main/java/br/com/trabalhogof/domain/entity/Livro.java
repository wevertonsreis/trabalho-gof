package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.to.LivroTO;

public class Livro {
	
	private Long id;
	private String titulo;
	private List<Exemplar> exemplares;
	
	/**
	 * Fabrica um {@link Livro} a partir de um {@link LivroTO}
	 * 
	 * @param livroTO
	 * @return
	 */
	public static Livro newLivro(LivroTO livroTO) {
		Livro livro = new Livro();
		livro.setId(livroTO.getId());
		livro.setTitulo(livroTO.getTitulo());
		return livro;
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

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	
}
