package Ex2;

public class Departamento {
	String nome;
	String sigla;
	Departamento(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	void imprimirDep() {
		System.out.println("----------- Departamento ---------- ");
		System.out.println("Nome do Departamento: " + this.nome);
		System.out.println("Sigla do Departamento: " + this.sigla);
	}
}
