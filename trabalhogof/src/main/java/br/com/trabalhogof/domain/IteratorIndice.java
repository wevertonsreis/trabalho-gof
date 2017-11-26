package br.com.trabalhogof.domain;

import java.util.Iterator;

/**
 * Classe que representa o modo de interacao de {@link Indice}
 */
public class IteratorIndice implements Iterator<Indice> {

	private ListaIndice listaIndice;
	private int index;
	
	public IteratorIndice(ListaIndice listaIndice) {
		super();
		this.listaIndice = listaIndice;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index >= 0 && index < listaIndice.size();
	}

	@Override
	public Indice next() {
		return listaIndice.get(index++);
	}

}