package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList <Cliente> cadastro = new ArrayList();
		
		String nome;
		Cliente x;
		Endereco y;
		int sair = 1;
		
		while(sair != 0) {
			//entrada Cliente
			System.out.println("Cadastro Cliente\n");
			System.out.println("Digite o nome do Cliente: ");
			nome = ler.nextLine();
			x = new Cliente(nome);
			System.out.println("Digite o CPF:  ");
			x.setCpf(ler.nextLine());
			
			//entrada endereco
			System.out.println("Digite o nome da Rua: ");
			nome = ler.nextLine();
			y = new Endereco(nome);
			System.out.println("Digite o Numero : ");
			y.setNumero(ler.nextInt());
			ler.nextLine();
			System.out.println("Digite o complemento : ");
			y.setComplemento(ler.nextLine());
			System.out.println("Digite o CEP : ");
			y.setCep(ler.nextLine());
			System.out.println("Digite o Bairro : ");
			y.setBairro(ler.nextLine());
			System.out.println("Digite a Cidade : ");
			y.setCidade(ler.nextLine());
			System.out.println("Digite o Estad : ");
			y.setEstado(ler.nextLine());
			
			x.addEndereco(y);
			//guardando no vetor
			cadastro.add(x);
			System.out.println("Digite 0 para sair ou 1 para Continuar: ");
			sair = ler.nextInt();
			ler.nextLine();
		}
		//saida
		for(int i = 0; i<cadastro.size(); i++) {
			x = cadastro.get(i);
			x.imprimirCliente();
		}
		

	}

}