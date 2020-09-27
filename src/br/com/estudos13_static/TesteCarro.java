package br.com.estudos13_static;

public class TesteCarro {

	public static void main(String[] args) {
		
		System.out.println(Carro.getVelocidadeMaximaPermitida());
		
		Carro c1 = new Carro("GM", "IBM", 50),
			  c2 = new Carro("Volks", "SUN3344", 42);
	
		c1.verificarLimite();
		c2.verificarLimite();
		System.out.println();
		
		c1.acelerar(16);
		c2.acelerar(11);
		
		c1.verificarLimite();
		c2.verificarLimite();
		System.out.println();
		
		Carro.setVelocidadeMaximaPermitida(40);
		
		c1.verificarLimite();
		c2.verificarLimite();
	}

}
