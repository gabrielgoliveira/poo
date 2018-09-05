package Ex1;

public class Musica {
	String nomeMusica;
	int ano;
	String tipo;
	Compositor autor;
	Compositor coAutor;
	Musica(String nomeMusica){
		this.nomeMusica = nomeMusica;
	}
	void setAutor(Compositor comp) {
		this.autor = comp;
	}
	void setCoAutor(Compositor comp) {
		this.coAutor = comp;
	}
	void imprimirMusica() {
		System.out.println("Nome Musica: " + this.nomeMusica);
		System.out.println("Ano de composicao: " + this.ano);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("--------- Dados Autor ----------- ");
		this.autor.imprimirAutor();
		System.out.println("--------- Dados CoAutor ----------- ");
		this.coAutor.imprimirAutor();
	}
}
