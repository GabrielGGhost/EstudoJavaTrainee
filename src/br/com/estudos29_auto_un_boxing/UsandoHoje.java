package br.com.estudos29_auto_un_boxing;

public class UsandoHoje {
	
	public static void main(String[] args) {
		int i = 10;
		Integer obj = i;
		
		if(obj == 10) {
			obj++;
		}
		
		Boolean b = true;
		
		if(b) {
			System.out.println("Verdadeiro");
		}
		
		Character c = 'a';
		
		if(c == 'b') {
			System.out.println("Letra = b");
		}
		
		Double d = 15.6;
	}
}
