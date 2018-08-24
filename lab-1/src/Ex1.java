import javax.swing.JOptionPane;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio, fim, quantidade = 0, temp, soma = 0, contPares = 0;
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    	fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo numero: "));
		temp = inicio;
		soma = 0;
		for(int i = 0; temp<=fim; i++){
	    	quantidade++;
	    	soma +=temp;
	    	if(temp%2 == 0){
 	        	contPares++;
	    	}
	    	temp++;
		}
		System.out.printf("Quantidade de Numeros: %d\n", quantidade);
		System.out.printf("Soma do Intervalo: %d\n", soma);
		System.out.printf("Media do Intervalo: %.3f\n", ((float) (soma/quantidade)));
		System.out.printf("Quantidade de Numeros Pares: %d\n", contPares);
	}

}
