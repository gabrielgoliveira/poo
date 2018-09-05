package Ex1;

public class Compositor {
	private String nomeAutor;
	private String nacionalidade;
	Compositor(String nomeAutor){
		this.nomeAutor = nomeAutor;
	}
	public String getNomeAutor() {
		return this.nomeAutor;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	void imprimirAutor() {
		System.out.println("Nome : " + this.nomeAutor);
		System.out.println("Nacionalidade: " + this.nacionalidade);
	}
}
