package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FuncaoBotao {
	private Boolean botao = false;
	private String surpresa;
	
	public String getSurpresa() {
		return surpresa;
	}
	public void setSurpresa(String surpresa) {
		this.surpresa = surpresa;
	}
	
	public Boolean getBotao() {
		return botao;
	}
	public void setBotao(Boolean botao) {
		this.botao = botao;
	}
	
	public void testaBotao() {
		if (botao == false) {
			this.surpresa = "vc nao marcou o box";
		}
		if (botao == true) {
			this.surpresa = "Ae carai";
		}
	}

}
