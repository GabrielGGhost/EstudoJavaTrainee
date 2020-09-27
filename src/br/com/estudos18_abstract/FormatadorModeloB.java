package br.com.estudos18_abstract;

public class FormatadorModeloB extends FormatadorRecibo {

	public String gerarRecibo(String cliente, double valor, String data, String motivo) {
		
		return "Recebemos de " + cliente + " o valor de R$" + valor + " referente a " + motivo + " na data de " + data;
	}
}
