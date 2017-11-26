package br.com.trabalhogof.domain;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe qure representa uma lista de {@link Indice}
 */
public class ListaIndice extends AbstractList<Indice> {

	private List<Indice> listaDeIndice = new ArrayList<>();
	
	@Override
	public Iterator<Indice> iterator() {
		return new IteratorIndice(this);
	}
	
	@Override
	public Indice get(int index) {
		return listaDeIndice.get(index);
	}

	@Override
	public boolean add(Indice e) {
		return listaDeIndice.add(e);
	}
	
	@Override
	public int size() {
		return listaDeIndice.size();
	}

}