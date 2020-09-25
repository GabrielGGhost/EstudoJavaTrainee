package br.com.estudo5.controleDeFluxo;

public class If2_exemploerrado {

	public static void main(String[] args) {
		
		int idade = 15;
		
		if(idade < 35) { // Errado
			System.out.println("Adulto");
		} else if (idade < 20) {
			System.out.println("Adolescente");
		} else if (idade < 13) {
			System.out.println("Criança");
		} else {
			System.out.println("Bebe");
		}

	}

}
