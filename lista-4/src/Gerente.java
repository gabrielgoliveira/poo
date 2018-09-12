//ok
public class Gerente extends Funcionario{
	private int bonificacao; // fixa && verificar se é porcentagem ou fixo em x reais
	private String tipo; // PF || PJ
	Gerente(String matricula, String nome){
		super(matricula, nome);
	}
	//getters e setters
	
	public int getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(int bonificacao) {
		this.bonificacao = bonificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//metodos
	
	@Override
	public double getTotalSalarioAnual(){
		return super.getTotalSalarioAnual() + (bonificacao*12);
	}
}
