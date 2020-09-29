package br.com.estudos23_tratamentoDeErros_2.util;

import java.io.IOException;

public class TesteCriadorArquivos {

	public static void main(String[] args) {
		try {
			CriarArquivo c = new CriarArquivo();
			c.criarArquivo("Aquivo novo");
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Concluído!");
		}

	}

}
