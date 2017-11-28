package br.com.trabalhogof.domain.entity;

public enum StatusReserva implements Status {

	ATIVA {
		
		@Override
		public boolean possuiReserva() {
			return true;
		}

	},
	BAIXADA {

		@Override
		public boolean possuiReserva() {
			return false;
		}

	},
	CANCELADA {

		@Override
		public boolean possuiReserva() {
			return false;
		}

	};

}
