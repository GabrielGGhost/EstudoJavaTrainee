package br.com.estudos11_sobrecarga;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
				
		System.out.println(f.calclSalario(20));
		
		System.out.println(f.calclSalario(20, 1));

	}

}
