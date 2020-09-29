package br.com.estudos23_tratamentoDeErros_1.util;

import java.io.File;
import java.io.IOException;

public class LancandoException {

	public void criarArquivo(String name) throws IOException {
		File f = new File(name);
		f.createNewFile();
		System.out.println("Arquivo criado!");
	}
	
}
