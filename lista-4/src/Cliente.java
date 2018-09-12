//ok
public class Cliente extends Pessoa{

	private int idade;
	private String cpf;
	private char status; // A  = ATIVO || I = INATIVO
	
	//construtor
	
	Cliente(String nome, String telefone, int idade, String cpf){
		super.setNome(nome);
		super.setTelefone(telefone);
		this.idade = idade;
		this.cpf = cpf;
		this.status = 'A';	
	}
	
	//getters e setters

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	//metodos
	public void desativar(){
		this.status = 'I';
	}
	
	public String statusCliente() {
		if(this.status == 'A') {
			return "Ativo";
		} else {
			return "Inativo";
		}
	}
	
	@Override
	public String toString(){
		return super.toString() + " - idade: " + idade + " - cpf: " + cpf + " - " + this.statusCliente();
	}
}
