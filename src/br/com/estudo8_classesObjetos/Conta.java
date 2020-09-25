package br.com.estudo8_classesObjetos;

public class Conta {
	
	double saldo;
	
	void deposito(double valor) {
		
		valor += valor * 0.01; 
		
		System.out.println("O valor a ser depositado será " + valor);
		
		saldo += valor;
	}

}
