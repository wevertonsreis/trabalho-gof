package br.com.trabalhogof.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class SubSessao extends Sessao {

	private List<Sessao> sessoes = new ArrayList<>();
	
	public SubSessao(String titulo) {
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
