package br.com.estudo7_arrays;

public class Arrays {

	public static void main(String[] args) {
		
		//int[] numeros = new int[11];
		int[] numeros = {1, 4, 9, 8, 11, 155, 20, 0, 4, 7, 14};

		//numeros[0] = 1;
		//numeros[1] = 4;
		//numeros[2] = 9;
		//numeros[3] = 8;
		//numeros[4] = 11;
		//numeros[5] = 155;
		//numeros[6] = 20;
		//numeros[7] = 0;
		//numeros[8] = 4;
		//numeros[9] = 7;
		//numeros[10] = 14;
				
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] % 2 == 0) continue;
			System.out.println(numeros[i]);
		}
	}

}

