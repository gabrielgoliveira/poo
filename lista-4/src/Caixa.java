//ok
public class Caixa extends Funcionario{
	private int horario;
	Caixa(String matricula, String nome){
		super(matricula, nome);
	}
	//getters e setters
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	//metodos
	@Override
	public String toString(){
		return super.toString() + " - Horario : " + this.horario;
	}
}
