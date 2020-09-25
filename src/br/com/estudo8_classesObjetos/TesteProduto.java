package br.com.estudo8_classesObjetos;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto[] produtos = new Produto[2];
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i] = new Produto();
		}
		
		produtos[0].codigo = 1;
		produtos[0].nome = "TV";
		produtos[0].preco = 1300;
		produtos[0].fabricante = "LG";
		
		produtos[1].codigo = 2;
		produtos[1].nome = "PSY";
		produtos[1].preco = 5000;
		produtos[1].fabricante = "Playstation";
		
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Código: " + produtos[i].codigo);
			System.out.println("Nome: " + produtos[i].nome);
			System.out.println("Preço: " + produtos[i].preco);
			System.out.println("Fabricante: " + produtos[i].fabricante);
			System.out.println();
		}
		
		produtos[0].aumentarPreco();
		
		System.out.println("O preço do produto " + produtos[0].nome + " aumentou de " + produtos[0].ultimoPreco + " para " + produtos[0].preco);
		
		produtos[0].diminuirPreco(200);
		
		System.out.println("O preço do produto " + produtos[0].nome + " baixou de " + + produtos[0].ultimoPreco + " para " + produtos[0].preco);
	
		System.out.println(produtos[1].preco);
		
		double semImposto = produtos[0].obeterPrecoSemImposto();
		
		System.out.println("O preço do produto " + produtos[0].nome + " sem imposto é de " + semImposto);

		
	}

}
