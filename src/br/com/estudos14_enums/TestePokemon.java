package br.com.estudos14_enums;

public class TestePokemon {

	public static void main(String[] args) {
		
		Pokemon poke = new Pokemon("Beedrill", "INSETO", "VENENOSO");
		Pokemon poke2 = new Pokemon("Charmander", "FOGO");
		
		poke.imprimir();
		System.out.println();
		poke2.imprimir();
	}

}
