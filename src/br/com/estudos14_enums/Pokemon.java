package br.com.estudos14_enums;

public class Pokemon {
	
	String nome,
		   tipo1,
		   tipo2;


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
	
	Pokemon(String nome, String tipo1, String tipo2){
		this(nome, tipo1);
		this.setTipo2(tipo2);

	}
	
	Pokemon(String nome, String tipo1){
		this.setNome(nome);
		this.setTipo1(tipo1);
	}
	
	public void imprimir() {
		
		System.out.print("O pokemon é do tipo: ");
		
		for (TiposPokemon tipo : TiposPokemon.values()) {
			if(tipo.name() == this.getTipo1()) {
				System.out.println(tipo.name());
			}
			
			if (this.getTipo1() != null) {
				if(tipo.name() == this.getTipo2()) {
					System.out.print("O segundo tipo do pokemon é: ");
					System.out.println(tipo.name());
				}
			}

		}
		
	}
}
