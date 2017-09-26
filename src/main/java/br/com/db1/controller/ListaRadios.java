package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ListaRadios {
	private String radio;

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public String radioSelecionada() {
		return radio;
	}
}
