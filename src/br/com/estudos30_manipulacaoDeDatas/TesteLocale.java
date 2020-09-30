package br.com.estudos30_manipulacaoDeDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TesteLocale {

	public static void main(String[] args) {
		Locale en = Locale.ENGLISH;
		Locale br = new Locale("pt", "BR");
		
		DateTimeFormatter formatadorIngles = DateTimeFormatter.ofPattern("EEE MMM dd", en);
		String s = LocalDate.now().format(formatadorIngles);
	}

}
