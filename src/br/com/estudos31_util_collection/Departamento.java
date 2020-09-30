package br.com.estudos31_util_collection;

import java.util.*;

public class Departamento {
	
	private String nome;
	private Collection pessoas;
	
	public Departamento(String n) {
		this.setNome(n);
		this.setPessoas(new ArrayList(100));
	}
	
	public void addPessoa(Pessoa p) {
		this.pessoas.add(p);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection getPessoas() {
		return pessoas;
	}

	public void setPessoas(Collection pessoas) {
		this.pessoas = pessoas;
	}
}
