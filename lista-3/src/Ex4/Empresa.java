package Ex4;

public class Empresa {
	String nome;
	String cnpj;
	Endereco atual;
	Empresa(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getAtual() {
		return atual;
	}
	public void setAtual(Endereco atual) {
		this.atual = atual;
	}
	//Funcoes
	void addEndereco(Endereco atual) {
		this.atual = atual ;
	}
	void imprimirEmpresa() {
		System.out.println("Dados da Empresa: ");
		System.out.println("Nome: "+ this.nome);
		System.out.println("CNPJ : " + this.cnpj);
		atual.imprimirEndereco();
	}
	
}
