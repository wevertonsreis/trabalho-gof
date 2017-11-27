package br.com.trabalhogof.domain.entity;

import java.util.List;

import br.com.trabalhogof.domain.EstrategiaEmprestimo;
import br.com.trabalhogof.domain.EstrategiaReserva;

public enum Perfil implements EstrategiaReserva, EstrategiaEmprestimo {
	USUARIO {
		
		@Override
		public boolean podeReservar(List<Reserva> reservas) {
			if(reservas == null)
				return true;
			
			int reservasAtiva = 0;
			for (Reserva reserva : reservas) {
				if (reserva.isAtiva())
					reservasAtiva++;
			}
			
			return reservasAtiva < 2;	
		}
		
		@Override
		public boolean podeTomarEmprestimo() {
			return false;
		}
		
	},
	BIBLIOTECARIA {
		
		@Override
		public boolean podeReservar(List<Reserva> reservas) {
			if(reservas == null)
				return true;
			
			int reservasAtiva = 0;
			for (Reserva reserva : reservas) {
				if (reserva.isAtiva())
					reservasAtiva++;
			}
			
			return reservasAtiva < 10;	
		}
		
		@Override
		public boolean podeTomarEmprestimo() {
			return false;
		}
		
	};
}