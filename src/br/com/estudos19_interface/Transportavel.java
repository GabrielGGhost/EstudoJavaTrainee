package br.com.estudos19_interface;

public interface Transportavel {
	
	public static final String UNIDADE_VOLUME = "cm3";
	public String UNIDADE_PESO = "kg";
	
	public double getVolume();
	public double getPeso();
	public int getEmpilhamentoMaximo();
	public static String getUnidadesPadrao() {
		return "Volume em " + UNIDADE_VOLUME + ", peso em " + UNIDADE_PESO;
	}
	
	public default double getCustoFrete() { return 0.0; }
}
