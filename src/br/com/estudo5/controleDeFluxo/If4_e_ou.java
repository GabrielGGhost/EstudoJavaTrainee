package br.com.estudo5.controleDeFluxo;

public class If4_e_ou {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.nome = "Pedro";
		a1.idade = 12;
		
		if(a1.nome == "Jo�o" && a1.idade >= 18) {
			System.out.println("O nome � jo�o e � maior de idade!");
		} else if(a1.nome == "Jo�o" && a1.idade <= 18) {
			System.out.println("O nome � Jo�o e � menor de idade!");
		} else if(a1.nome != "Jo�o" && a1.idade >= 18) {
			System.out.println("O nome n�o � jo�o mas � maior de idade!");
		} else {
			System.out.println("O nome n�o � jo�o e nem � maior de idade");
		}

	}
}
