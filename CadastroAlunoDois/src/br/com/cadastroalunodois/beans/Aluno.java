package br.com.cadastroalunodois.beans;

public class Aluno extends Pessoa {
	
	private int rm;
	private double peso;
	
	/*
	double pesoRafael = 79.320;
	//abaixo está errado, pois defini como int e atribui como double
	int pesoRonqui = 79.320;
	
	 */
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Abaixo o metodo que retorna a soma do tipo double
	public double pesoTotal(double recebePesoSapato) {
		double soma = recebePesoSapato + getPeso();
		return soma;
		     //soma =          2       +     71;
		       //soma = 73
	}
	
	

	

}
