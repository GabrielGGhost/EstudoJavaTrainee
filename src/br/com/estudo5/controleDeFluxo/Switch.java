package br.com.estudo5.controleDeFluxo;

public class Switch {
	
	public static void main(String[] args) {
		
		String pokemon = "Charmander";
		
		switch(pokemon) {
			
			case "Bulbassauro":
				System.out.println("O pokemon � do tipo planta!");
				break;
				
			case "Charmander":
				System.out.println("O pokemon � do tipo fogo!");
				break;
				
			case "Squirtle":
				System.out.println("O pokemon � do tipo �gua!");
				break;
				
			default:
				System.out.println("Pokemon inv�lido!");
				break;
		}
	}
}
