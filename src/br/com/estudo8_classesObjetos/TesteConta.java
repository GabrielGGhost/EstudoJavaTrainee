package br.com.estudo8_classesObjetos;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta nubank = new Conta();
		
		double valor = 100;
		//nubank.deposito(300);
		//nubank.deposito(150);
		//nubank.deposito(500);
		
		nubank.deposito(valor);
		
		System.out.println("Sua conta tem R$" + nubank.saldo);
		
		System.out.println("Você depositou R$" + valor);
	}

}
