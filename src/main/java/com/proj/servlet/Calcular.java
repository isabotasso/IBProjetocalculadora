package com.proj.servlet;

public class Calcular {
	private int valor1;
	private int valor2;
	
	Calcular(int v1, int v2){
		this.valor1 = v1;
		this.valor2 = v2;
	}

	public int somar() {
		return this.valor1 + this.valor2;
	}
	
	public int subtrair() {
		return this.valor1 - this.valor2;
	}
	
	public int multiplicar() {
		return this.valor1 * this.valor2;
	}	
	
	public int dividir() {
		return this.valor1 / this.valor2;
	}	
	
}
