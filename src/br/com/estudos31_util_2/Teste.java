package br.com.estudos31_util_2;

public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Mario", 42);
		Pessoa p2 = new Pessoa("Tudela", 19);
		
		Departamento d = new Departamento("Dep1");
		d.addPessoa(p1);
		d.addPessoa(p2);
		
		System.out.println(d.getPessoas());
	}

}
