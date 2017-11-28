package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.EstrategiaEmprestimo;
import br.com.trabalhogof.domain.EstrategiaReserva;

public enum Perfil implements EstrategiaReserva, EstrategiaEmprestimo {
	USUARIO(2) {
		
		@Override
		public boolean podeReservar(List<Reserva> reservas) {
			if(reservas == null)
				return true;
			
			int reservasAtiva = 0;
			for (Reserva reserva : reservas) {
				if (reserva.isAtiva())
					reservasAtiva++;
			}
			
			return reservasAtiva < getQuantidadeMaximaReserva();	
		}
		
		@Override
		public boolean podeTomarEmprestimo() {
			return false;
		}
		
	},
	BIBLIOTECARIA(10) {
		
		@Override
		public boolean podeReservar(List<Reserva> reservas) {
			if(reservas == null)
				return true;
			
			int reservasAtiva = 0;
			for (Reserva reserva : reservas) {
				if (reserva.isAtiva())
					reservasAtiva++;
			}
			
			return reservasAtiva < getQuantidadeMaximaReserva();	
		}
		
		@Override
		public boolean podeTomarEmprestimo() {
			return false;
		}
		
	};
	
	private int quantidadeMaximaReserva;

	/**
	 * 
	 * @param quantidadeMaximaReserva
	 */
	private Perfil(int quantidadeMaximaReserva) {
		this.quantidadeMaximaReserva = quantidadeMaximaReserva;
	}

	public int getQuantidadeMaximaReserva() {
		return quantidadeMaximaReserva;
	}
	
}