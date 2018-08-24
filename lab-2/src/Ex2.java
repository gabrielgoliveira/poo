import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		Universidade cursos[] = new Universidade[4];
		for(int i = 0; i < 4; i++){
			cursos[i] = new Universidade();
			cursos[i].curso = JOptionPane.showInputDialog("Digite o nome do Curso : ");
			cursos[i].numPeriodos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Periodos: "));
			cursos[i].horasAtividadeComplementar = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Horas Complementar: "));
			cursos[i].quantidadeMaterias = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidadade de Materias: "));
		}
		for(int i = 0; i < 4; i++){
			JOptionPane.showMessageDialog(null, "Nome do Curso : " + cursos[i].curso);
			JOptionPane.showMessageDialog(null, "Quantidade de Periodos: " + cursos[i].numPeriodos);
			JOptionPane.showMessageDialog(null, "Quantidade de Horas Complementar: " + cursos[i].horasAtividadeComplementar);
			JOptionPane.showMessageDialog(null, "Quantidadade de Materias: " + cursos[i].quantidadeMaterias);
		}
	}

}
