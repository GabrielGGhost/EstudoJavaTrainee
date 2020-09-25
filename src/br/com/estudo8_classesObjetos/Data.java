package br.com.estudo8_classesObjetos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	String dataFormatada;
	
	public Data() {
		
	}
	
	public Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
		
		formatarData();
	}
	
	void formatarData() {
		
		dataFormatada = Integer.toString(dia) + '\\' + Integer.toString(mes) + '\\' + Integer.toString(ano);
	}
}
