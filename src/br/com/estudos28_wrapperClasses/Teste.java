package br.com.estudos28_wrapperClasses;

public class Teste {
	public static void main(String[] args) {
		
		String x = new String();
		Integer i = new Integer("10");
		int i2 = 10;
		
		if(i == i2) {
			System.out.println("i: " + i);
			System.out.println("i2: " + i2);
			System.out.println("Iguais");
		}
		
		Character c = new Character('d');
		Boolean b = new Boolean(true);
		
		System.out.println(b);
		System.out.println(Boolean.valueOf(b));
		System.out.println(Integer.parseInt("55"));
	}
}
