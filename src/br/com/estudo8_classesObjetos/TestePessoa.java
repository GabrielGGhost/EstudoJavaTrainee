package br.com.estudo8_classesObjetos;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.nome = "Gabriel";
		
		alterarPessoa(p);
		
		System.out.println(p.nome);
	}
	
	
	static void alterarPessoa(Pessoa p) {
		
		p.nome = "Jonas";
		
		p = new Pessoa();
		
		p.nome = "Zuleide";
	}

}
