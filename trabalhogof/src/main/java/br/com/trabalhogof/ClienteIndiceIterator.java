package br.com.trabalhogof;

import java.util.AbstractList;
import java.util.Iterator;

import br.com.trabalhogof.domain.Indice;
import br.com.trabalhogof.domain.ListaIndice;

public class ClienteIndiceIterator {

	public static void main(String[] args) {
		
		AbstractList<Indice> listaDeIndice = new ListaIndice();
		listaDeIndice.add(new Indice("1. Introducao"));
		listaDeIndice.add(new Indice("1.1 Teste"));
		listaDeIndice.add(new Indice("1.2 Teste"));
		listaDeIndice.add(new Indice("1.3 Teste"));
		listaDeIndice.add(new Indice("2. Prologo"));
		listaDeIndice.add(new Indice("2.1 Teste"));
		listaDeIndice.add(new Indice("2.2 Teste"));
		listaDeIndice.add(new Indice("2.3 Teste"));
		
		for (Iterator<Indice> iterator = listaDeIndice.iterator(); iterator.hasNext();) {
			Indice indice = iterator.next();
			System.out.println(indice.getTitulo());
		}
		
	}

}