package br.com.trabalhogof.domain.entity;

import javax.persistence.Entity;

@Entity
public class Exemplar {
	
	private String codigo;
	
	public boolean disponivel() {
		//TODO IMPLEMENTAR
		return false;
	}
	
	public void emprestar(Usuario usuario) {
		//TODO IMPLEMENTAR
	}
}
