package br.com.estudo5.controleDeFluxo;

public class If_simples {

	public static void main(String[] args) {
		
		boolean b = true;
		
		if(b) {
			System.out.println("Verdadeiro");
		} else { // opcional
			System.out.println("Falso");
		}
		
		System.out.println();
		
		int x = -10;
		
		if(x > 10) {
			System.out.println("X � maior que 10");
		} else if(x == 10){
			System.out.println("X � igual � 10");
		} else if (x < 0) {
			System.out.println("X � menor que 0");
		}else {

			System.out.println("X � menor que 10");
		}

	}

}
