package br.com.estudos24_criandoExcepctions;

public class Endereco {
	
	private String rua;
	private int numero;
	
	public Endereco(String rua, int numero) throws NumeroInvalidoException {
		this.setRua(rua);
		this.setNumero(numero);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) throws NumeroInvalidoException {
		if(numero <= 0 ) {
			throw new NumeroInvalidoException("O número " + numero + " é inválido!");
		}
		
		this.numero = numero;
	}
}
