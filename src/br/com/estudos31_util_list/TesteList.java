package br.com.estudos31_util_list;

import java.util.*;


public class TesteList {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria", 20);
		Pessoa p2 = new Pessoa("Crlos", 19);
		Pessoa p3 = new Pessoa("Antônio", 35);
		
		List l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		Pessoa p ;
		
		for (int i = 0; i < l.size(); i++) {
			p = (Pessoa) l.get(i);
			System.out.println(p);
		}
	}

}
