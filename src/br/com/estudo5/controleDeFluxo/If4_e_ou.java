package br.com.estudo5.controleDeFluxo;

public class If4_e_ou {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.nome = "Pedro";
		a1.idade = 12;
		
		if(a1.nome == "João" && a1.idade >= 18) {
			System.out.println("O nome é joão e é maior de idade!");
		} else if(a1.nome == "João" && a1.idade <= 18) {
			System.out.println("O nome é João e é menor de idade!");
		} else if(a1.nome != "João" && a1.idade >= 18) {
			System.out.println("O nome não é joão mas é maior de idade!");
		} else {
			System.out.println("O nome não é joão e nem é maior de idade");
		}

	}
}
