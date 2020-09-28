package br.com.estudos20_cast2;

public class Teste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria", "47856987-1");
		
		if(p instanceof Cliente) {
			System.out.println("Instanciando cliente...");
			Cliente c = (Cliente)p;
			System.out.println(c.getNome());
		} else if (p instanceof Funcionario) {
			System.out.println("Instanciando funcionário");
			Funcionario f = (Funcionario)p;
			System.out.println("Salario: " + f.getNome());
		} else {
			System.out.println("Não é cliente nem funcionario");
		}
	}

}
