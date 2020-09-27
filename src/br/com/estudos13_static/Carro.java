package br.com.estudos13_static;

public class Carro {

	private String fabricante;
	private String placa;
	private int velocidade;
	private static int velocidadeMaximaPermitida = 60;
	
	public static int getVelocidadeMaximaPermitida() {
		return velocidadeMaximaPermitida;
	}

	public static void setVelocidadeMaximaPermitida(int velocidadeMaximaPermitida) {
		Carro.velocidadeMaximaPermitida = velocidadeMaximaPermitida;
	}

	Carro(){}
	
	Carro(String fabricante, String placa, int velocidade){
		
		this.setFabricante(fabricante);
		this.setPlaca(placa);
		this.setVelocidade(velocidade);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void acelerar(int deltaV) {
		
		velocidade += deltaV;
	}
	
	public boolean ultrapassouLimite() {
		
		return velocidade > velocidadeMaximaPermitida;
	}
	
	public void verificarLimite() {
		
		if(this.ultrapassouLimite()) {
			System.out.println("O carro de placa " + this.getPlaca() + " ultrapassou o limite!");
		} else {
			System.out.println("O carro de placa" + this.getPlaca() + " está na velocidade certa!");
		}
	}
}
