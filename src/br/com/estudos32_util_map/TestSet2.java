package br.com.estudos32_util_map;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap.KeySetView;


public class TestSet2 {

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
		
		for (Object o : m.keySet()) {
			chave = (String) o;
			p = (Pessoa) m.get(chave);
			System.out.println(p);
		}

	}
}
