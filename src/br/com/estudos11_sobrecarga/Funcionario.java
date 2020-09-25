package br.com.estudos11_sobrecarga;

public class Funcionario {
	
	private double valorHora = 2;
	
	public double calclSalario(int horasTrab) {
		
		return horasTrab * valorHora;
	}
	
	public double calclSalario(int horasTrab, double p) {
		
		double v = calclSalario(horasTrab);
		
		return v + v * p;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
}
