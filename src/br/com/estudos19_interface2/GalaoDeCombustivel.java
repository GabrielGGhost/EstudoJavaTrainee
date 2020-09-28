package br.com.estudos19_interface2;

public class GalaoDeCombustivel implements Inflamavel{
	
	private double peso;
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVolume() {
		return 0;
	}
	
	public int getEmpilhamentoMaximo() {
		return 2;
	}
	
	public double getTemperaturaMaxima() {
		return 0;
	}
}
