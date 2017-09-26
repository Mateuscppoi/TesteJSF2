package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Operacoes {
	
	private Integer numero1;
	private Integer numero2;
	private Integer resultado;
	public Integer getNumero1() {
		return numero1;
	}
	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}
	public Integer getNumero2() {
		return numero2;
	}
	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}
	
	public Integer getResultado() {
		return resultado;
	}
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	public void soma() {
		resultado = numero1 + numero2;
	}
	
	public void subtracao() {
		resultado = numero1 - numero2;
	}
	
	public void multiplicacao() {
		resultado = numero1 * numero2;
	}
	
	public void divisao() {
		resultado = numero1 / numero2;
	}

}
