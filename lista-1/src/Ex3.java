import javax.swing.JOptionPane;
public class Ex3 {

	public static void main(String[] args) {
		int num, num1;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero: "));
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero: "));
		if(num > num1) {
			JOptionPane.showMessageDialog(null, "O "+num+" é maior que "+num1);
		} else {
			JOptionPane.showMessageDialog(null, "O "+num1+" é maior que "+num);
		}
	}

}
