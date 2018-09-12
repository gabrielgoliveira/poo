//ok
public class Pessoa {

	private String nome;
	private String telefone;
	
	//setters e getters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	//metodos
	@Override
	public String toString() {
		return this.nome + " - " + "Tel : " + this.telefone;
	}
}
