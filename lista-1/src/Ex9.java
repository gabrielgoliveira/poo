import javax.swing.JOptionPane;
/*
 * Para executar o programa crie outro arquivo .java para a classe Cpf
 * */

public class Cpf {
	String cpf;
	void cadastrarCpf(String temp) {
		cpf = temp;
	}
	boolean validarCpf() {
		int i;
		int mult = 10, primeiroDigito, segundoDigito;;
		double soma = 0;
		//Calculo do primeiro digito
		for(i = 0; i<cpf.length()-3; i++) {
			if(Character.isDigit(cpf.charAt(i))) {
				soma += (cpf.charAt(i)-48)*mult;
				mult--;
			}
		}
		if(soma%11 <2) {
			primeiroDigito = 0;
		} else {
			primeiroDigito = (int) 11-((int) (soma%11)); 
		}
		//Calculo do Segundo Digito
		mult = 11;
		soma = 0;
		for(i = 0; ; i++) {
			if(Character.isDigit(cpf.charAt(i))) {
				if(mult>2) {
					soma += (cpf.charAt(i)-48)*mult;
					mult--;
				} else {
					soma += ((int) primeiroDigito)*mult;
					break;
				}
				
			}
		}
		
		if(soma%11 < 2) {
			segundoDigito = 0;
		} else {
			segundoDigito = 11 - ((int) (soma%11));
		}
		
		//System.out.printf("Primeiro Digito e: %d\n", primeiroDigito);
		//System.out.printf("Primeiro Digito e: %d\n", segundoDigito);
		if(primeiroDigito == cpf.charAt(cpf.length()-2)-48 && segundoDigito == cpf.charAt(cpf.length()-1)-48) {
			JOptionPane.showMessageDialog(null, "CPF VALIDO");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "CPF INVALIDO");
			return false;
		}
	}
	void imprimirCpf() {
		System.out.printf("CPF cadastrado: %s\n", cpf);
	}
}


public class Ex9 {
	public static void main(String[] args) {
		Cpf pessoa = new Cpf();
		pessoa.cadastrarCpf(JOptionPane.showInputDialog("Digite o Cpf: "));
		pessoa.imprimirCpf();
		pessoa.validarCpf();
	}
}

