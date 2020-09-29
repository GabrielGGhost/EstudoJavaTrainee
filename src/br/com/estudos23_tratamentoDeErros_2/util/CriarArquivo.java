package br.com.estudos23_tratamentoDeErros_2.util;

import java.io.File;
import java.io.IOException;

public class CriarArquivo {

	public void criarArquivo(String name) throws IOException {
		File f = new File(name);
		f.createNewFile();
	}
	
}
