package lista1;
import java.util.Random;

import javax.swing.JOptionPane;
public class Ex4 {

	public static void main(String[] args) {
		Random gerador = new Random();
		JOptionPane.showMessageDialog(null, "Numero Aleatorio: "+gerador.nextInt(101));

	}

}
