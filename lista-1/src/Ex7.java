import javax.swing.JOptionPane;
public class Ex7 {
	public static void main(String[] args) {
		String nome;
		String telefone;
		char temp;
		int i;
		nome = JOptionPane.showInputDialog("Digite o Nome: ");
		telefone = JOptionPane.showInputDialog("Digite o Telefone: ");
		for(i = 0; i < nome.length(); i++) {
				temp = nome.charAt(i);
				if(Character.isDigit(temp)) {
						System.out.println("Nome Invalido");
						break;
				}
		}
		for(i = 0; i < telefone.length(); i++) {
			if(!Character.isDigit(telefone.charAt(i))) {
						System.out.println("Telefone Invalido");
						break;
			}
		}
	}
}
