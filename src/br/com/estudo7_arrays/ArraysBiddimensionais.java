
package br.com.estudo7_arrays;

public class ArraysBiddimensionais {

	public static void main(String[] args) {
		
		//String[][] nomes = new String[3][2];
		String[][] nomes = {{"Gabriel", "Artioli"}, {"Gabriel", "Tudela"}, {"F�bio", "Evangelista"}};
		//nomes[0][0] = "Gabriel";
		//nomes[0][1] = "Ravioli";
		
		//nomes[1][0] = "Gabriel";
		//nomes[1][1] = "Nutela";
		
		//nomes[2][0] = "F�bio";
		//nomes[2][1] = "Evnag�lico";
		
		
		
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				
				System.out.println(nomes[i][j] + " " + nomes[i][++j]);
			}
		}

	}
	
}
