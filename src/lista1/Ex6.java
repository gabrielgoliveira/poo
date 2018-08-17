package lista1;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		int vet[];
		int troca;
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tamanho do Vetor: "));
		vet = new int[tam];
		
		for(int i = 0; i<tam;i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor "+(i+1)+" : "));
		}
		for(int i = 0; i<tam; i++) {
			for(int j = 0; j<tam-1; j++) {
				if(vet[j] > vet[j+1]) {
					troca = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = troca;
				}
			}
		}
		System.out.printf("Ordem Crescente: \n");
		for(int i = 0; i<tam; i++) {
			System.out.printf("%d ", vet[i]);
		}
		System.out.printf("\n");
		for(int i = 0; i<tam; i++) {
			for(int j = 0; j<tam-1; j++) {
				if(vet[j] < vet[j+1]) {
					troca = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = troca;
				}
			}
		}
		System.out.printf("Ordem Decrescente: \n");
		for(int i = 0; i<tam; i++) {
			System.out.printf("%d ", vet[i]);
		}
		System.out.printf("\n");
	}

}
