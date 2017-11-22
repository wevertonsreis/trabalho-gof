package br.com.trabalhogof.domain.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Reserva {
	
	private Usuario usuario;
	private Livro livro;
	private Date dataRetirada;
	private StatusReserva status;
	
}
