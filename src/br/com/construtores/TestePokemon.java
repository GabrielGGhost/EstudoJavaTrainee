package br.com.construtores;

public class TestePokemon {

	public static void main(String[] args) {
		
		Pokemon[] pokemons = new Pokemon[4];
		
		pokemons[0] = new Pokemon();
		pokemons[1] = new Pokemon("Charmander", "Fogo");
		pokemons[2] = new Pokemon("Squirtle ", "água");		
		pokemons[3] = new Pokemon("Weedle", "Inseto", "Venenoso");
		
		pokemons[0].setNome("Bulbassauro");
		pokemons[0].setTipo1("Planta");
		pokemons[0].setTipo2("Venenoso");
	
		for (int i = 0; i < pokemons.length; i++) {
			System.out.println("POKEMON: " + pokemons[i].getNome());
			System.out.println("TIPO PRIMÁRIO: " + pokemons[i].getTipo1());
				
			if(pokemons[i].getTipo2() != null) {
				System.out.println("TIPO SECUNDÁRIO: " + pokemons[i].getTipo2());
			}
			System.out.println();
		}
	}

}
