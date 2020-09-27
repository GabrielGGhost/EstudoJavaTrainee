package br.com.estudos14_heranca;

public class Pessoa {
	
	private Endereco endereco;
	private String nome,
					rg;
	
	Pessoa(String nome, String rg, Endereco end){
		this.setNome(nome);
		this.setEndereco(end);
		this.setRg(rg);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
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
