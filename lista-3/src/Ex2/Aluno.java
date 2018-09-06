package Ex2;
public class Aluno {
	String nome;
	long matricula;
	int ano;
	Curso grad;
	Aluno(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}


	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	//funcoes
	void addCurso(Curso grad) {
		this.grad = grad;
	}
	void imprimirAluno() {
		System.out.println("----------- Aluno ---------- ");
		System.out.println("Nome do Aluno: " + this.nome);
		System.out.println("Matricula : " + this.matricula);
		System.out.println("Ano : " + this.ano + "\n");
		this.grad.imprimirCurso();
	}
}
