package br.com.db1.controller;

public class FuncaoBotao {
	private String surpresa;
	
	public String getSurpresa() {
		return surpresa;
	}
	public void setSurpresa(String surpresa) {
		this.surpresa = surpresa;
	}
	
	private void seiLa() {
		surpresa = "funfo";
	}

}
