package br.com.estudos14_heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Rua Almeia Souza", 52);
		Funcionario f = new Funcionario("Mario Alberto", "45587459-0", 125478874589l, 2500, "25/07/1998", end);
		
		f.imprimir();
	}

}
