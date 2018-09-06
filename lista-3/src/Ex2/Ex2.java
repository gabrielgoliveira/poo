package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList <Aluno> cadastro = new ArrayList();
		String nome;
		Curso grad;
		Departamento y;
		int sair = 1;
		Aluno x;
		
		while(sair != 0) {
			//entrada aluno
			System.out.println("Cadastro Aluno\n");
			System.out.println("Digite o nome do Aluno: ");
			nome = ler.nextLine();
			x = new Aluno(nome);
			System.out.println("Digite a Matricula do Aluno: ");
			x.setMatricula(ler.nextLong());
			ler.nextLine();
			System.out.println("Digite o ano de entrada do Aluno: ");
			x.setAno(ler.nextInt());
			ler.nextLine();
			
			//entrada curso
			System.out.println("Digite o nome do Curso: ");
			nome = ler.nextLine();
			grad = new Curso(nome);
			System.out.println("Digite a Sigla do Curso : ");
			grad.setSigla(ler.nextLine());
			
			//entrada departamento
			System.out.println("Digite o nome do Departamento: ");
			nome = ler.nextLine();
			y = new Departamento(nome);
			System.out.println("Digite a Sigla do Departamento : ");
			y.setSigla(ler.nextLine());
			
			grad.addDepartamento(y);
			x.addCurso(grad);
			//guardando no vetor
			cadastro.add(x);
			System.out.println("Digite 0 para sair ou 1 para Continuar: ");
			sair = ler.nextInt();
			ler.nextLine();
		}
		//saida
		for(int i = 0; i<cadastro.size(); i++) {
			x = cadastro.get(i);
			x.imprimirAluno();
		}
		
		
	}

}
