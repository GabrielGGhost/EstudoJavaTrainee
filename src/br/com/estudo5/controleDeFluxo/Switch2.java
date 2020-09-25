package br.com.estudo5.controleDeFluxo;

public class Switch2 {

	public static void main(String[] args) {
		
		String pokemon = "Skarmory";
		
		switch(pokemon) {
			case "Geodude":
				System.out.println("O pokemon é do tipo pedra!");
				break;
			case "Skarmory":
				System.out.println("O pokemon é do tipo voador!");
			default:
				System.out.println("E do tipo metálico!");
				break;
				

		}
	}
}
