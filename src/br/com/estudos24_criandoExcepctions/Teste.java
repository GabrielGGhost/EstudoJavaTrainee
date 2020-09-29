package br.com.estudos24_criandoExcepctions;

public class Teste {

	public static void main(String[] args) {
		try {
			Endereco e = new Endereco("Rua 5", -5);
		} catch (NumeroInvalidoException e) {
			e.printStackTrace();
		}

	}

}
