package br.com.db1.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ListaDados {
	private List<String> itens;

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

	public List<String> itensSelecionados(){
		return itens;
	}
}
