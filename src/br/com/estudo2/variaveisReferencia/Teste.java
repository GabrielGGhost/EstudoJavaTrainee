package br.com.estudo2.variaveisReferencia;

public class Teste {

	public static void main(String[] args) {
		
		String s = new String("Gabriel Artioli");
		String s2 = "Gabriel Artioli mais fácil";
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.nome = "pedro";
		aluno1.idade = 15;
		aluno1.ra = 45215;
		
		aluno2.nome = "Maria";
		
		System.out.println("O nome do aluno 1 é " + aluno1.nome);
		System.out.println("Sua idade é " + aluno1.idade);
		System.out.println("E seu RA é " + aluno1.ra);

		System.out.println();
		
		System.out.println("O nome do aluno 2 é " + aluno2.nome);

	}

}
