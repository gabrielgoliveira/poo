//ok
public class Funcionario extends Pessoa{

	private String matricula;
	private double salario;
	
	//construtor
	Funcionario(String matricula, String nome){
		//construtor
		super.setNome(nome);
		this.matricula = matricula;
	}
	//getters e setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	//metodos
	public void aumentaSalario(float percentual){
		this.salario += ((this.salario*percentual)/100);
	}
	public double getTotalSalarioAnual(){
		return (this.salario)*12;
	}
	@Override
	public String toString(){
		return super.toString() + " - Matricula : " + this.matricula  + " Salario : " + this.salario;
	}
}
