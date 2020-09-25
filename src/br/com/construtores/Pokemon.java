package br.com.construtores;

public class Pokemon {

	String nome,
			tipo1,
			tipo2;

	
	Pokemon(String nome, String tipo1, String tipo2){
		
		this.setNome(nome);
		this.setTipo1(tipo1);
		this.setTipo2(tipo2);
	}
	
	Pokemon() {
	
	}
	
	Pokemon(String nome, String tipo1){
		
		this.setNome(nome);
		this.setTipo1(tipo1);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	
	
}
