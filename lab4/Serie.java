package lab4;

public class Serie extends ProgramaTV {
	int numTemp;
	int numEp;
	Serie(String nome, String tipo, int numTemp, int numEp){
		super(nome, tipo);
		this.numTemp = numTemp;
		this.numEp = numEp;
	}
	public String toString() {
		return super.toString() + numTemp +" - " + numEp;
	}
}
