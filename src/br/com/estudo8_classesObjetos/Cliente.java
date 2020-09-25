package br.com.estudo8_classesObjetos;

public class Cliente {
	
	String nome;
	Data dataCadastro;
	Empresa empresa;
	
	void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de cadastro: " + dataCadastro.dataFormatada);
	}
}
