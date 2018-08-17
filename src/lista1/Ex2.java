package lista1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String args[]){
		double valor;
		double valor1;
		DecimalFormat arredonda = new DecimalFormat("#.000");
		valor  = Double.parseDouble(JOptionPane.showInputDialog("Digite um Valor em Decimal: "));
		valor1 = valor;
		BigDecimal arredondaBig = new BigDecimal(valor1).setScale(3, RoundingMode.HALF_EVEN);
		JOptionPane.showMessageDialog(null, "Primeiro Metodo: \nValor arredondado é : " + arredonda.format(valor));
		JOptionPane.showMessageDialog(null, "Segundo Metodo: \nValor arredondado é : " + arredondaBig.doubleValue());
		JOptionPane.showMessageDialog(null, "Terceiro Metodo: \nValor: "+Math.round(valor));
	}
}
