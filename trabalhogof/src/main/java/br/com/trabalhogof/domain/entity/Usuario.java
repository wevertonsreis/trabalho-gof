package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.reserva.entity.Reserva;

public class Usuario {
	
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private Perfil perfil;
	private List<Reserva> reservas;
	
	public boolean podeReservar() {
		//TODO IMPLEMENTAR
		return false;
	}
	
	public boolean podeTomarEmprestimo() {
		//TODO IMPLEMENTAR
		return false;
	}
}