package Ex3;

public class Cliente {
	String nome;
	String cpf;	
	Endereco endereco;
	Cliente(String nome){
		this.nome = nome;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	String getCpf(){
		return this.cpf;
	}
	void addEndereco(Endereco endereco){
		this.endereco = endereco;
	}
	void imprimirCliente() {
		System.out.println("--------- Cliente ------------");
		System.out.println("Nome : " + this.nome);
		System.out.println("Cpf : " + this.cpf);
		this.endereco.imprimirEndereco();
	}
}
