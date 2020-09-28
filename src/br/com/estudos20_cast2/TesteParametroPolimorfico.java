package br.com.estudos20_cast2;

public class TesteParametroPolimorfico {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		 p.setNome("Gabriel Aparecido Israel Tudela");
		
		 Cliente c = new Cliente();
		 c.setNome("Gabriel Santos Artioli");
		
		 Funcionario f = new Funcionario();
		 f.setNome("Fabio Roberto Evangelista");
		
		 RelatorioPessoas relatorio = new RelatorioPessoas();
		 relatorio.imprime(p); // Pessoa
		 relatorio.imprime(c); // Cliente
		 relatorio.imprime(f); // Funcionario
		 System.out.println();
		 
		 Pessoa[] pessoas = new Pessoa[]{f, p, c};
		 RelatorioPessoas relatorio2 = new RelatorioPessoas();
		 relatorio2.imprimeArray(pessoas);
	 }
}