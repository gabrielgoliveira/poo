import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		String nome, mat;
		String aluno[];
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
		aluno = new String[x];
		for(int i = 0; i<x; i++){
			nome = JOptionPane.showInputDialog("Digite o Nome do Aluno "+(i+1)+" : ");
			mat = JOptionPane.showInputDialog("Digite a Matricula do Aluno "+(i+1)+" : ");
			aluno[i] = mat + " - " + nome;
		}
		
		System.out.printf("Lista de Alunos:\n");
		for(int i = 0; i<x; i++){
			System.out.printf("%s\n", aluno[i]);
		}
		
	}

}
