package br.com.estudo5.controleDeFluxo;

public class Switch2 {

	public static void main(String[] args) {
		
		String pokemon = "Skarmory";
		
		switch(pokemon) {
			case "Geodude":
				System.out.println("O pokemon � do tipo pedra!");
				break;
			case "Skarmory":
				System.out.println("O pokemon � do tipo voador!");
			default:
				System.out.println("E do tipo met�lico!");
				break;
				

		}
	}
}
