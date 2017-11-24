package br.com.trabalhogof.domain.entity;

public enum StatusReserva implements Status {

	ATIVA {
		
		public boolean possuiReserva() {
			return true;
		}

	},
	BAIXADA {

		public boolean possuiReserva() {
			return false;
		}

	},
	CANCELADA {

		public boolean possuiReserva() {
			return false;
		}

	};

}
