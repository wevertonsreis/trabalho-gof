package br.com.trabalhogof.domain;

public abstract class CalculadorDeMulta {

	/**
	 * Responsavel por realizar o calculo da multa
	 * 
	 * @return
	 */
	public final float calcularMulta() {
		return quantidadeDiasAtrazo() * valorMultaAtrazo();
	}
	
	public abstract float valorMultaAtrazo();
	
	public abstract int quantidadeDiasAtrazo();
}
