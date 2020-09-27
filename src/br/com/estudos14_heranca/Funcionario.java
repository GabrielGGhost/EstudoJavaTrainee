package br.com.estudos14_heranca;

public class Funcionario extends Pessoa{
	
	private long carteiraProfissional;
	private double salario;
	private String dataAdmissao;
	
	public Funcionario(String nome, String rg, long carteira, double salario, String data, Endereco end) {
		super(nome, rg, end);
		this.setCarteiraProfissional(carteira);
		this.setSalario(salario);
		this.setDataAdmissao(data);
	}
	
	public long getCarteiraProfissional() {
		return carteiraProfissional;
	}
	public void setCarteiraProfissional(long carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	void imprimir() {
		System.out.println('\n' + "--------------------------");
		System.out.println("Nome: " + super.getNome());
		System.out.println("RG: " + super.getRg());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Carteira: " + this.getCarteiraProfissional());
		System.out.println("Admissão: " + this.getDataAdmissao());
		System.out.println("Moradia: " + super.getEndereco().getRua() + "  " + super.getEndereco().getNumero());
		System.out.println("---------------------------");
	}
}
