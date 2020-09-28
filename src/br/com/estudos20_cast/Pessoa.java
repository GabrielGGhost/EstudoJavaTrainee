package br.com.estudos20_cast;

public class Pessoa {
	
	private String nome;
	private String rg;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, String rg){
		this.setNome(nome);
		this.setRg(rg);
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
	
	void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
	}
}
