package br.com.estudos32_util_map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class TestSet {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria", 20);
		Pessoa p2 = new Pessoa("Crlos", 19);
		Pessoa p3 = new Pessoa("Antônio", 35);
		
		Map m = new HashMap();
		m.put("p1", p1);
		m.put("p2",p2);
		m.put("p3",p3);
		Pessoa p ;
		
		String chave;
		Iterator i = m.keySet().iterator();
		
		while (i.hasNext()) {
			chave = (String) i.next();
			p = (Pessoa) m.get(chave);
			System.out.println(p);
		}
	}
}
