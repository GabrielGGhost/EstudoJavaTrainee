package br.com.estudo5.controleDeFluxo;

public class Switch {
	
	public static void main(String[] args) {
		
		String pokemon = "Charmander";
		
		switch(pokemon) {
			
			case "Bulbassauro":
				System.out.println("O pokemon é do tipo planta!");
				break;
				
			case "Charmander":
				System.out.println("O pokemon é do tipo fogo!");
				break;
				
			case "Squirtle":
				System.out.println("O pokemon é do tipo água!");
				break;
				
			default:
				System.out.println("Pokemon inválido!");
				break;
		}
	}
}
