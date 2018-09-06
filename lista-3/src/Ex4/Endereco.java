package Ex4;

public class Endereco {
	String rua;
	int numero;
	String complemento;
	String cep;
	String bairro;
	String cidade;
	String estado;
	
	//construtor
	Endereco(String rua){
		this.rua = rua;
	}
	//getters e setters
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//funcoes
	void imprimirEndereco() {
		System.out.println("\n--------- Endereco ------------");
		System.out.println("Rua : " + this.rua + " Numero : " + this.numero);
		System.out.println("Complemento : " + this.complemento);
		System.out.println("Cep : " + this.cep);
		System.out.println("Bairro : " + this.bairro + " Cidade : " + this.cidade);
		System.out.println("Estado : " + this.estado);
	}
}

