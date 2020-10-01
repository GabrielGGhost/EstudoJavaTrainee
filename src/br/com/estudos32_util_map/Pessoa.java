package br.com.estudos32_util_map;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public String toString() {
		return "Nome: " + nome + ", idade: " + idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
