class Pessoa {

	String nome;
	String telefone;
	
	//getters e setters
	public String getNome(){
		return this.nome;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	//metodos
}

class Funcionario extends Pessoa {

	String matricula;
	float salario;
	Funcionario(String matricula, String nome){
		//construtor
	}
	//getters e setters
	
	//metodos
	public void aumentaSalario(float percentual){
		this.salario += ((this.salario*percentual)/100);
	}
	
	//verificar se fica melhor passar essa função para o caixa
	public float getTotalSalarioAnual(){
		return (this.salario)*12;
	}
}

class Cliente extends Pessoa{

	int idade;
	String cpf;
	char status; // A  = ATIVO || I = INATIVO
	
	//construtor
	Cliente(String nome, String telefone, int idade, String cpf, char status){
			
		this.idade = idade;
		this.cpf = cpf;
		this.status = 'A';	
	}
	
	//getters e setters
	
	//metodos
	public void desativar(){
		this.status = 'I';
	}
	
	public String toString(){
		return "?";
	}
}

class Caixa extends Funcionario {

	int horario;

}

class Gerente extends Funcionario{

	int bonificacao; // fixa && verificar se é porcentagem ou fixo em x reais
	char tipo; // PF || PJ

}
