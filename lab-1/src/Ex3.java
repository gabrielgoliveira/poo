import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = new int[3];
		int troca;
		for(int i = 0; i<3; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento "+(i+1)+" : "));
		}
		
		//bubble sort
		for(int i = 0; i<3; i++){
			for(int j = 0; j<2; j++){
				if(vetor[j] > vetor[j+1]){
					troca = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = troca;
				}
			}
		}
		//saida
		for(int i = 0; i<3; i++){
			System.out.printf("Elemento: %d\n", vetor[i]);
		}
	}
}
