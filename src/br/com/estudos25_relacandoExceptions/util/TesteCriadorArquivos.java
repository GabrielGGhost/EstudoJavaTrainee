package br.com.estudos25_relacandoExceptions.util;

import java.io.IOException;

public class TesteCriadorArquivos {

	public static void main(String[] args) throws GlobalException {
		try {
			CriarArquivo ca = new CriarArquivo();
			ca.criarArquivo("");
			} catch (IOException e) {
				System.out.println("Erro:" + e.getMessage());
				e.printStackTrace();
			} finally{
				System.out.println("Concluído");
		}
	}
}
