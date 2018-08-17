package lista1;

import javax.swing.JOptionPane;

public class Ex5 {
	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int quadrado[] = new int[10];
		double media = 0;
		String inversa = new String();
		String quad = new String();
		
		for(int i = 0; i<10; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+i+" Numero: "));
		}
		
		for(int i = 9; i>=0; i--){
			if(i != 0){
				inversa += Integer.toString(vetor[i])+" ";
			} else {
				inversa += vetor[i]+".";
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Ordem Inversa: \n"+inversa);
		for(int i=0; i<10; i++) {
			media +=vetor[i];
		}
		JOptionPane.showMessageDialog(null, "Soma: "+media);
		media = media/10;
		JOptionPane.showMessageDialog(null, "Media: "+media);
		for(int i = 0; i<10; i++){
			quadrado[i] = vetor[i]*vetor[i];
			if(i < 9) {
				quad+=quadrado[i]+" ";
			} else {
				quad+=quadrado[i]+".";
			}
			
		}
		JOptionPane.showMessageDialog(null, "Vetor Quadrado: \n"+quad);
	}

}
