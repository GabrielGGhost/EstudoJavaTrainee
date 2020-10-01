package br.com.estudos33_generics;

import java.util.ArrayList;

public class NaoParametrizado {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Antônio", 20);
		ArrayList pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add("teste");
		pessoas.add(15);
		pessoas.add(true);
		
		Pessoa p = (Pessoa)pessoas.get(0);
		Pessoa p2 = (Pessoa)pessoas.get(1);
		
		System.out.println(p.getNome());
		System.out.println(p2.getNome());
	}

}
