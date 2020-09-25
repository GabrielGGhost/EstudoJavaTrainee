package br.com.estudo4.operadores;

public class Unario_conversao {

	public static void main(String[] args) {
		
		int i = 1000;
		//short s = i;//Intervalo de I é maior do que short
		
		short s2 = (short)i;
		byte b = (byte)i;
	}
}
