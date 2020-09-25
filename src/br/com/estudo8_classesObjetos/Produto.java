package br.com.estudo8_classesObjetos;

public class Produto {

	int codigo;
	String nome;
	double preco;
	String fabricante;
	double ultimoPreco;
	
	void aumentarPreco() {
		ultimoPreco = preco;
		preco += preco * 0.05;
	}
	
	void diminuirPreco(double p) {
		
		if(p <= 0) return;
		
		ultimoPreco = preco;
		preco -= p;
	}
	
	double obeterPrecoSemImposto() {
		
		return (double)preco - preco * 0.04;
	}
}
