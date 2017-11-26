package br.com.trabalhogof;

import br.com.trabalhogof.domain.Indice;
import br.com.trabalhogof.domain.Sessao;
import br.com.trabalhogof.domain.SubSessao;

public class ClienteIndiceComposite {

	public static void main(String[] args) {

		Sessao indice = new Indice("INDICE");

		Sessao s1 = new SubSessao("1.Introducao");

		Sessao sub11 = new SubSessao("1.1");
		Sessao sub12 = new SubSessao("1.2");
		Sessao sub13 = new SubSessao("1.3");

		s1.add(sub11);
		s1.add(sub12);
		s1.add(sub13);

		Sessao s2 = new SubSessao("2. O inicio");

		Sessao sub21 = new SubSessao("2.1");
		Sessao sub22 = new SubSessao("2.2");
		Sessao sub23 = new SubSessao("2.3");

		s2.add(sub21);
		s2.add(sub22);
		s2.add(sub23);

		indice.add(s1);
		indice.add(s2);
		
		for (Sessao sessaoIndice : indice.getSessoes()) {
			System.out.println(sessaoIndice.getTitulo());
			for (Sessao sessao1 : sessaoIndice.getSessoes()) {
				System.out.println(sessao1.getTitulo());
				
			}
			
		}

	}
}
