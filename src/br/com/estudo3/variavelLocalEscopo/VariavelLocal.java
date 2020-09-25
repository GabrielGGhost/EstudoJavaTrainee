package br.com.estudo3.variavelLocalEscopo;

public class VariavelLocal {

	public static void main(String[] args) {
		a();
		b();
		//System.out.println(x); //Erro
	}
	
	static void a() {
		int x = 10;
		System.out.println(x);
		
	}
	
	static void b() {
		int z = 20;
		System.out.println(z);
	}
}
