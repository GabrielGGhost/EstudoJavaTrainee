package br.com.estudo3.variavelLocalEscopo;

public class ErroDeEscopo {

	public static void main(String[] args) {
		
		int x = 28;
		int y = 5;//É preciso inicializar
		int k = 0;//Precisa estar no escopo mais acima
		
		if (x > 10){
			k = 15;
		}
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(k);
	}
}
