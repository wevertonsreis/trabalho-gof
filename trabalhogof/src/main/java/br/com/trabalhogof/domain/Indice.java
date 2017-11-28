package br.com.trabalhogof.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterator
 */
public class Indice extends Sessao {

	private List<Sessao> sessoes = new ArrayList<>();

	public Indice(String titulo) {
		super(titulo);
	}

	@Override
	public void add(Sessao s) {
		sessoes.add(s);
	}

	@Override
	public void remove(Sessao s) {
		sessoes.remove(s);
	}
	
	@Override
	public List<Sessao> getSessoes() {
		return sessoes;
	}
	
}