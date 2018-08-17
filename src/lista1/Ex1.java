package lista1;
import javax.swing.JOptionPane;
public class Ex1 {
	public static void main(String args[]){
		String nome, nome1;
		nome = JOptionPane.showInputDialog("Digite o Nome 1: ");
		nome1 = JOptionPane.showInputDialog("Digite o Nome 2: ");
		JOptionPane.showMessageDialog(null, "O Primeiro Nome tem "+ nome.length()+" Letras");
		JOptionPane.showMessageDialog(null, "O segundo Nome tem "+nome1.length()+" Letras");
		
		if(nome.charAt(0) >= 65 && nome.charAt(0) <= 90) {
			JOptionPane.showMessageDialog(null, "Maisculo");
		}
		if(nome1.charAt(0) >= 65 && nome1.charAt(0) <= 90) {
			JOptionPane.showMessageDialog(null, "Maisculo");
		}
	}
}
