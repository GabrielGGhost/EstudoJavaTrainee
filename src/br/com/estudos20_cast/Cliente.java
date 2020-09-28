package br.com.estudos20_cast;

public class Cliente extends Pessoa{
	
	private String dataCadastro;
	
	Cliente(String dtAdmi, String nome, String rg){
		
		super(nome, rg);
		this.setDataCadastro(dtAdmi);
	}
	
	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.println("Data de cadastro: " + this.getDataCadastro());
	}
}
