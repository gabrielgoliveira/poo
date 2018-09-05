/*
 * Aluno : Gabriel Gonçalves de Oliveira
 * Matricula: 201611025
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int flag = 1, numero, tamanho;
		String rua, nome, cpf;
		long matricula;
		Funcionario funcionario;
		Funcionario temp;
		Endereco endereco;
		ArrayList<Funcionario> cadastro = new ArrayList();
		Scanner ler = new Scanner(System.in);
		
		//cadastro
		System.out.println("Matricula: ");
		matricula = ler.nextLong();
		ler.nextLine(); //limpa buffer
		
		while(matricula != 0){
		

		//funcionario
			System.out.println("Digite o Nome: ");
			nome = ler.nextLine();
			
			System.out.println("Cpf: ");
			cpf = ler.nextLine();
			
			//instaciando objeto funcionario
			funcionario = new Funcionario(nome, cpf, matricula);
			
			System.out.println("Cargo: ");
			funcionario.setCargo(ler.nextLine());
			
			System.out.println("Departamento: ");
			funcionario.setDepartamento(ler.nextLine());
			
			System.out.println("Salario: ");
			funcionario.setSalario(ler.nextDouble());
			ler.nextLine(); //limpa buffer
			System.out.printf("\n");
			
			System.out.println("Endereco de " + funcionario.getNome());
		
		//endereço
			System.out.println("Rua: ");
			rua = ler.nextLine();
			
			System.out.println("Numero: ");
			numero = ler.nextInt();
			ler.nextLine(); //limpa buffer
		
			//instaciando objeto endereço
			endereco = new Endereco(rua, numero);
			
			System.out.println("Quadra: ");
			endereco.setQuadra(ler.nextInt());
			ler.nextLine(); //limpa buffer
			
			System.out.println("Lote: ");
			endereco.setLote(ler.nextInt());
			ler.nextLine(); //limpa buffer
			
			System.out.println("Complemento: ");
			endereco.setComplemento(ler.nextLine());
			
			System.out.println("Bairo: ");
			endereco.setBairro(ler.nextLine());
			
			System.out.println("Cidade: ");
			endereco.setCidade(ler.nextLine());
			
			System.out.println("Estado: ");
			endereco.setEstado(ler.nextLine());
			
			//adicionando endereço ao objeto funcionario
			funcionario.addEndereco(endereco);
			//salvando funcionario
			cadastro.add(funcionario);
			
			System.out.println("Matricula: ");
			matricula = ler.nextLong();
			ler.nextLine(); //limpa buffer
				
		}
		
		tamanho = cadastro.size();
		for(int i = 0; i<tamanho; i++){
			temp = cadastro.get(i);
			temp.imprimirFuncionario();
			temp.aumentaSalario(30.0);
		}
		System.out.println("Salarios Reajustados em 30%");
		for(int i = 0; i<tamanho; i++){
			temp = cadastro.get(i);
			temp.imprimirFuncionario();
		}
	}

}
