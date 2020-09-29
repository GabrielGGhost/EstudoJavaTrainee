package br.com.estudos23_tratamentoDeErros_1.util;

import java.io.IOException;

public class Teste {

	public static void main(String[] args) throws IOException {
		LancandoException l = new LancandoException();
		
		l.criarArquivo("TestandoArquivo");

	}

}
