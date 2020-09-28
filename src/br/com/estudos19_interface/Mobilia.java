package br.com.estudos19_interface;

public class Mobilia implements Transportavel {
	
	private double alt,
					larg,
					profund,
					peso;
	
	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	public double getLarg() {
		return larg;
	}

	public void setLarg(double larg) {
		this.larg = larg;
	}

	public double getProfund() {
		return profund;
	}

	public void setProfund(double profund) {
		this.profund = profund;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVolume() {
		return this.getAlt() * this.getLarg();
	}
	
	public int getEmpilhamentoMaximo() {
		return 2;
	}
}
