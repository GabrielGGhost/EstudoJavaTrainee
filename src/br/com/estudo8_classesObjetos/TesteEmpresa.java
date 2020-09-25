package br.com.estudo8_classesObjetos;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		Data[] inicioAtividade = new Data[2];
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		Empresa e = new Empresa();	
		Empresa e2 = new Empresa();
		
		c1.nome = "Carlos";
		c1.empresa = e;
		
		c2.nome = "Antônio";
		c2.empresa = e2;
		
		e.nome = "Empresinha Top";
		e.inicioAtividade = inicioAtividade[0] = new Data(22,02,2005);
		
		e2.nome = "Empresinha mais que top";
		e2.inicioAtividade = inicioAtividade[1] = new Data(12,06,1995);
		
		e.cliente = new Cliente[] {c1, c2};

		System.out.println("Os clientes da empresa " + e.nome + " são:");
		
		for (int i = 0; i < e.cliente.length; i++) {
			System.out.println("Nome: " + e.cliente[i].nome);
			System.out.println("Empresa: " + e.cliente[i].empresa.nome);
			System.out.println("Empresa iniciou em " + e.cliente[i].empresa.inicioAtividade.dataFormatada);
			System.out.println();
		}
	
	}

}
