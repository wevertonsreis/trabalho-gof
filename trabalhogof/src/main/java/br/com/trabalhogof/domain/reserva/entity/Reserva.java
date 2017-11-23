package br.com.trabalhogof.domain.reserva.entity;

import java.util.Date;

public class Reserva {

	private Date dataRetirada;
	private Status status;

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}