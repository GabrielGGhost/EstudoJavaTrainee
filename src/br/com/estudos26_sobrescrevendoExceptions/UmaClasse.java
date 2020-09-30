package br.com.estudos26_sobrescrevendoExceptions;

public class UmaClasse implements Teste {
	//Erro de compilação ///Apenas exceptions especificadas
	public void metodoA() /*throws java.sql.SQLException*/{
		System.out.println("MetodoA");
	}
}
