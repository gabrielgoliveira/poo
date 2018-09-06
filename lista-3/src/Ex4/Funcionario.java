package Ex4;

public class Funcionario {
	String nome;
	long matricula;
	Empresa contratante;
	Funcionario(String nome){
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

	public Empresa getContratante() {
		return contratante;
	}

	public void setContratante(Empresa contratante) {
		this.contratante = contratante;
	}

	//Funcoes
	void addEmpresa(Empresa contratante) {
		this.contratante = contratante;
	}
	void imprimirFuncionario() {
		System.out.println("DADOS DO FUNCIONARIO: ");
		System.out.println("Nome : " + this.nome);
		System.out.println("Matricula : " + this.matricula);
		contratante.imprimirEmpresa();
	}
}
