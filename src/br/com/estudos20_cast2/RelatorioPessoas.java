package br.com.estudos20_cast2;

public class RelatorioPessoas {

	 public void imprime(Pessoa p) {
	 System.out.println("Nome: " + p.getNome());
	 }

	 public int imprimeArray(Pessoa[] pessoas) {
		 int quantidadeImpressa = 0;
		 for (int i = 0; i < pessoas.length; i++) {
			 if (pessoas[i] == null)
				continue;
			 	imprime(pessoas[i]);
			 	quantidadeImpressa++;
		 }
		 return quantidadeImpressa;
	}
}