package com.carledwinj.spring.dependency.model;

public class ContaCorrente {

	private Integer agencia;
	private Integer numero;
	private int digito;

	public ContaCorrente() {
	}
	
	public ContaCorrente(Integer agencia, Integer numero, int i) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.digito = i;
	}

	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
}
