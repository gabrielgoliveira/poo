package Ex2;

public class Curso {
	String nome;
	String sigla;
	Departamento dep;
	Curso(String nome){
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

	void addDepartamento(Departamento dep) {
		this.dep = dep;
	}
	void imprimirCurso(){
		System.out.println("----------- Curso ---------- ");
		System.out.println("Nome do Curso: " + this.nome);
		System.out.println("Sigla do Curso: " + this.sigla + "\n");
		this.dep.imprimirDep();
	}
}
