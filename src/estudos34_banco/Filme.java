package estudos34_banco;

public class Filme {
	
	private int id;
	private String arquivo;
	private String descricao;
	private int ano;
	private String sinopse;
	private String genero;
	
	Filme(){}
	
	Filme(int id, String arquivo, String descricao, int ano, String sinopse, String genero){
		
		this(arquivo, descricao, ano, sinopse, genero);
		this.setId(id);
	}
	Filme(String arquivo, String descricao, int ano, String sinopse, String genero){
		
		this.setArquivo(arquivo);
		this.setDescricao(descricao);
		this.setAno(ano);
		this.setSinopse(sinopse);
		this.setGenero(genero);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
