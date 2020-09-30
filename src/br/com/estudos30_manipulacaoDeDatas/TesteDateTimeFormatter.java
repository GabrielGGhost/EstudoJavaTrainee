package br.com.estudos30_manipulacaoDeDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteDateTimeFormatter {

	public static void main(String[] args) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		String s = LocalDate.now().format(formatador);
		
		LocalDate d = LocalDate.parse("11/08/2004", formatador);
		
		System.out.println(s);
		System.out.println(d);
	}

}
