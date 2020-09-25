package br.com.estudo5.controleDeFluxo;

public class If3_string {

	public static void main(String[] args) {
		
		String s = "Joana";
		
		if(s == "Pedro") {
			System.out.println("O nome é Pedro");
		} else if(s.equals("Joana")) {
			System.out.println("O nome é " + s);
		} else {
			System.out.println("Nome não registrado!");
		}

	}

}
