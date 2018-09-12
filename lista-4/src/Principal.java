public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String matricula, nome;
		Cliente cliente0, cliente1, cliente2;
		matricula = "1";
		nome = "Maria";
		Caixa funcionario0 = new Caixa(matricula, nome);
		matricula = "2";
		nome = "João";
		Gerente funcionario1 = new Gerente(matricula, nome);
		funcionario0.setHorario(10);
		funcionario0.setTelefone("(62) 98547-4125");
		funcionario0.setSalario(2500.5f);
		funcionario0.aumentaSalario(10);
		System.out.println(funcionario0);
		System.out.printf("Recebimento Anual: %.2f\n\n", funcionario0.getTotalSalarioAnual());
		
		//configurações gerente
		funcionario1.setTelefone("(62) 99245-8742");
		funcionario1.setSalario(7000.5f);
		funcionario1.setBonificacao(1000);
		funcionario1.setTipo("PJ");
		funcionario0.aumentaSalario(20);
		System.out.println(funcionario1);
		System.out.printf("Recebimento Anual: %.2f\n\n", funcionario1.getTotalSalarioAnual());
		
		//criacao de cliente
		cliente0 = new Cliente("Renato", "(62) 1111-1111", 20, "111.111.111-11");
		cliente1 = new Cliente("Gabriel", "(62) 2222-2222", 18, "222.222.222-22");
		cliente2 = new Cliente("Leonardo", "(62) 3333-3333", 24, "333.333.333-33");
		cliente0.desativar();
		System.out.println(cliente0);
		System.out.println(cliente1);
		System.out.println(cliente2);
	}
}
