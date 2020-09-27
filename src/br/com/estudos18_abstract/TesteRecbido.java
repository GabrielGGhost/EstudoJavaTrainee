package br.com.estudos18_abstract;

public class TesteRecbido {

	public static void main(String[] args) {
		
		//Erro de compilação
		//FormatadorRecibo fr = new FormatadorRecibo();
		
		FormatadorModeloB fb = new FormatadorModeloB();
		
		System.out.println(fb.gerarRecibo("João", 500, "20/01/2000", "Aluguel"));

	}

}
