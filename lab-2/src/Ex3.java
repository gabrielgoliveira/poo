import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quant;
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Vetor: "));
		Universidade cursos[] = new Universidade[quant];
		for(int i = 0; i < quant; i++){
			cursos[i] = new Universidade();
			cursos[i].curso = JOptionPane.showInputDialog("Digite o nome do Curso : ");
			cursos[i].numPeriodos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Periodos: "));
			cursos[i].horasAtividadeComplementar = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Horas Complementar: "));
			cursos[i].quantidadeMaterias = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidadade de Materias: "));
		}
		for(int i = 0; i < quant; i++){
			JOptionPane.showMessageDialog(null, "Nome do Curso : " + cursos[i].curso);
			JOptionPane.showMessageDialog(null, "Quantidade de Periodos: " + cursos[i].numPeriodos);
			JOptionPane.showMessageDialog(null, "Quantidade de Horas Complementar: " + cursos[i].horasAtividadeComplementar);
			JOptionPane.showMessageDialog(null, "Quantidadade de Materias: " + cursos[i].quantidadeMaterias);
		}
	}

}
