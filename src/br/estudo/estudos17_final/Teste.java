package br.estudo.estudos17_final;

public class Teste {

	public static void main(String[] args) {
		
		final int x = 0;
		final char[] c = {'a', 'b', 'c'};
		final Endereco e = new Endereco("Rua um", 2);
		
		//Erros de compilação
		//x = 50;
		//c = new char[] {'a', 'c', 'e'};
		//e = new Endereco("AA", 45);
		
		//Sintaxes válidas
		c[0] = 'e';
		e.setNumero(45);
		System.out.println(c[0]);
		System.out.println(e.getNumero());
		
		
	}

}
