package br.com.estudo8_classesObjetos;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Data d = new Data(24, 5, 2020);

		c.nome = "Gabriel";
		c.dataCadastro = d;
		c.imprimir();
	}

}
