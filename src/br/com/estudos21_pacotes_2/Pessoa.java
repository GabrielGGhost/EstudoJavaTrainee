package br.com.estudos21_pacotes_2;

import br.com.estudos21_pacotes_2.util.Endereco;

public class Pessoa {
	
	Endereco endereco = new Endereco();
	private String nome;
	private String rg;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
