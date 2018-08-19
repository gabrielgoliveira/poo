import javax.swing.JOptionPane;
public class Ex8 {
	public static void main(String[] args) {
		int quant;
		String nomes[];
		double salarios[], menor, maior, media = 0;
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Funcionarios: "));
		
		//alocando a memoria
		nomes = new String[quant];
		salarios = new double[quant];
		
		for(int i = 0; i < quant; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o Nome: ");
			salarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o Salario: "));
		}
		maior = menor = salarios[0];
		for(int i = 0; i < quant; i++) {
			media += salarios[i];
			if(salarios[i] > maior) {
				maior = salarios[i];
			}
			if (salarios[i] < menor) {
				menor = salarios[i];
			}
			//JOptionPane.showMessageDialog(null, "Nome: "+nomes[i]+"\nSalario: "+salarios[i]);
		}
		media = media/quant;
		JOptionPane.showMessageDialog(null, "Maior Salario : R$ "+maior+"\nMenor Salario: R$ "+menor+"\nMedia dos Salarios: R$ "+media);
	}
}
