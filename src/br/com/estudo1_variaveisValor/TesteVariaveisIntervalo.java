package br.com.estudo1_variaveisValor;

public class TesteVariaveisIntervalo {

	public static void main(String[] args) {
		
		int i = 32768;
		byte b = 127;
		byte b2 = (byte)128; //Como uma roleta, ele segue para o próximo, não volta ao início.
		short s = b;
		short s2 = (short)i;
		long l = 100;
		long l2 = 3000000000000000000L;
		
		System.out.println(i);
		System.out.println(b);
		System.out.println(b2);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(l);
	}

}
