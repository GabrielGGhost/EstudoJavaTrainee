package br.com.estudo10_modificadoresDeAcesso;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Gabriel Artioli");
		
		System.out.println(p.getNome());
	}

}
