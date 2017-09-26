package br.com.db1.controller;

import java.text.DecimalFormat;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormataValor {
	private String valor1;
	private String valor2;
	
	public String getValor1() {
		return valor1;
	}



	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}



	public String getValor2() {
		return valor2;
	}



	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}



	public String retornaValor() {
		Double tmp = Double.parseDouble(valor1);
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		valor2 = formatter.format(tmp);
		valor2 = "R$" + valor2;
		return valor2;
	}

}
