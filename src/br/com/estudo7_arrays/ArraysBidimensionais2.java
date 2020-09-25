package br.com.estudo7_arrays;

public class ArraysBidimensionais2 {
	
	public static void main(String[] args) {
		
		String[][] nomes = new String[3][];
		
		nomes[0] = new String[3];
		nomes[0][0] = "Gabriel";
		nomes[0][1] = "Santos";
		nomes[0][2] = "Artioli";
		
		nomes[1] = new String[4];
		nomes[1][0] = "Gabriel";
		nomes[1][1] = "Aparecido";
		nomes[1][2] = "Israel";
		nomes[1][3] = "Tudela";
		
		
		
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				System.out.println(nomes[i][j]);
			}
			
			System.out.println("");
		}
	}
}
