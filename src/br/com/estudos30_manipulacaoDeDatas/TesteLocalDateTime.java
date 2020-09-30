package br.com.estudos30_manipulacaoDeDatas;

import java.time.LocalDateTime;

public class TesteLocalDateTime {

	public static void main(String[] args) {
		//Data atual
		LocalDateTime data = LocalDateTime.now();
		
		int minutos = data.getMinute();
		int mes = data.getMonthValue();
		int ano = data.getYear();
		
		System.out.println(data);
		System.out.println(minutos);
		System.out.println(mes);
		System.out.println(ano);
		System.out.println(data.minusYears(5).plusMonths(2).plusDays(4));
		System.out.println(data.plusHours(5));
	}

}
