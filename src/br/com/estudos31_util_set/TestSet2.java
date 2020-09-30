package br.com.estudos31_util_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet2 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria", 20);
		Pessoa p2 = new Pessoa("Crlos", 19);
		Pessoa p3 = new Pessoa("Antônio", 35);
		
		Set s = new HashSet();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		Pessoa p ;
		
		for (Object o : s) {
			p = (Pessoa) o;
			System.out.println(p);
		}

	}
}
