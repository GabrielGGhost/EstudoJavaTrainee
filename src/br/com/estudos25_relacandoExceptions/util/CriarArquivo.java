package br.com.estudos25_relacandoExceptions.util;

import java.io.File;
import java.io.IOException;

public class CriarArquivo {

	public void criarArquivo(String name) throws GlobalException, IOException {
		try {
			File f = new File(name);
			f.createNewFile();
		} catch (IOException ioe) {
			String msg = "Erro ao criar arquivo";
			throw new GlobalException(msg, ioe);
		}

	}
	
}
