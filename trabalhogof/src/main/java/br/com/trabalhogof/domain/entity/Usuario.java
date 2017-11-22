package br.com.trabalhogof.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
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