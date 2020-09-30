package br.com.estudos27_manipulandoString;

public class Teste2 {

	public static void main(String[] args) {
		
		String x = "Maria", y = "Maria";
		
		String z = new String("Maria");
		String a = new String("Maria");
		
		System.out.println(x == y);
		System.out.println(a == z);
		System.out.println(x.equals(z));
		System.out.println(x.equalsIgnoreCase(z));
		int b = x.compareTo(z);
		System.out.println(b);
	}

}
