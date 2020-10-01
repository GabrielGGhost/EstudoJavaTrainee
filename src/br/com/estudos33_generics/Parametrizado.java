package br.com.estudos33_generics;

import java.util.ArrayList;

public class Parametrizado {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Antônio", 20);
		Pessoa p2 = new Pessoa("Francine", 20);
		Pessoa p3 = new Pessoa("Amanda", 20);
		Pessoa p4 = new Pessoa("Renata", 20);
		Pessoa p5 = new Pessoa("Paulo", 20);
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);

		//pessoas.add("teste");
		//pessoas.add(15);
		//pessoas.add(true);
		
		Pessoa p = pessoas.get(0);
		//Pessoa p2 = (Pessoa)pessoas.get(1);
		
		
		for (Pessoa pe : pessoas) {
			System.out.println(pe);
		}
	}

}
