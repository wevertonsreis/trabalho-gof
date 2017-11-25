package br.com.trabalhogof.domain;

import java.util.List;

public abstract class Sessao {
	
	protected String titulo;
	
	public Sessao(String titulo) {
		super();
		this.titulo = titulo;
	}

	public abstract void add(Sessao s);

	public abstract void remove(Sessao s);
	
	public abstract List<Sessao> getSessoes();

	public String getTitulo() {
		return titulo;
	}
	
}