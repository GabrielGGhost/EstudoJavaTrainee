package br.com.estudos20_cast;

public class Teste {

	public static void main(String[] args) {
		Cliente c = new Cliente("20/01/2012", "José", "445878965-2");
		Pessoa p = c;
		Object o = c;
		Pessoa p2 = new Cliente("11/08/2011", "Maria", "477858784-9");
		Cliente c2 = (Cliente)p2;
		
		Pessoa p3 = new Pessoa("Alberto", "aa524852");
		//Erro
		//Cliente c3 = (Clientew)p3;
		
		c.imprimir();
		System.out.println();
		p.imprimir();
		System.out.println();
		p2.imprimir();
		System.out.println();
		c2.imprimir();
	}

}
