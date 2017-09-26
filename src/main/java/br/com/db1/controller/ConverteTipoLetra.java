package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConverteTipoLetra {
	private String palavra1;
	private String palavra2;
	
	public String getPalavra1() {
		return palavra1;
	}
	public void setPalavra1(String palavra1) {
		this.palavra1 = palavra1;
	}
	public String getPalavra2() {
		return palavra2;
	}
	public void setPalavra2(String palavra2) {
		this.palavra2 = palavra2;
	}
	
	public void maiuscula() {
		this.palavra2 = this.palavra1.toUpperCase();
	}
	
	public void minuscula() {
		this.palavra2 = this.palavra1.toLowerCase();
	}

}
