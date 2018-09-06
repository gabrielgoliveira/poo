package Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList <Funcionario> cadastro = new ArrayList();
		
		String nome;
		Funcionario x;
		Empresa z;
		Endereco y;
		int sair = 1;
		
		while(sair != 0) {
			//entrada Cliente
			System.out.println("Cadastro de Funcionairo\n");
			System.out.println("Digite o nome do Funcionario: ");
			nome = ler.nextLine();
			x = new Funcionario(nome);
			System.out.println("Digite a Matricula:  ");
			x.setMatricula(ler.nextLong());
			ler.nextLine();
			
			//empresa
			System.out.println("Digite o nome da Empresa: ");
			nome = ler.nextLine();
			z = new Empresa(nome);
			System.out.println("Digite o CPNJ : ");
			z.setCnpj(ler.nextLine());
			
			//entrada endereco
			System.out.println("Endereco da Empresa");
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
	
			//apontando os enderecos de memoria
			z.addEndereco(y);
			x.addEmpresa(z);
			
			//guardando no vetor
			cadastro.add(x);
			System.out.println("Digite 0 para sair ou 1 para Continuar: ");
			sair = ler.nextInt();
			ler.nextLine();
		}
		//saida
		for(int i = 0; i<cadastro.size(); i++) {
			x = cadastro.get(i);
			x.imprimirFuncionario();
			System.out.printf("\n");
		}
		

	}

}
