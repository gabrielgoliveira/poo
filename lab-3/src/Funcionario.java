/*
 * Aluno : Gabriel Gonçalves de Oliveira
 * Matricula: 201611025
 */

public class Funcionario {
	
	//atributos
	private long matricula;
	private String cpf;
	private String nome;
	private String cargo;
	private String departamento;
	private Endereco endereco;
	private double salario;
	
	//construtor
	Funcionario(String nome, String cpf, long matricula){
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}
	//getters e setters
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//metodos
	void aumentaSalario(double percentual){
		salario += (salario*(percentual/100));
	}
	void imprimirFuncionario(){
		System.out.println(this.matricula+ " - " + this.nome + " - Departamento : " + this.departamento + " - Cargo : " + this.cargo);
		System.out.printf("Salario : %.2f\n", this.salario);
		imprimirEndereco();
	}
	void imprimirEndereco(){
		if(this.endereco != null){
			System.out.println("Rua : " + this.endereco.getRua() + "\nQuadra : " + this.endereco.getQuadra() + " Lote: " + this.endereco.getLote() + "\nNumero : " + this.endereco.getNumero());
			System.out.printf("Endereco de " + this.nome + "\n");
			System.out.println("Complemento : " + this.endereco.getComplemento() + "\nBairro: " + this.endereco.getBairro() + "\nCidade: " + this.endereco.getCidade() + "\nEstado: " + this.endereco.getEstado());
			
		} else {
			System.out.printf("Endereco nao cadastrado\n");
		}
	}
	void addEndereco(Endereco endereco){
		this.endereco = endereco;
	}
	
}
