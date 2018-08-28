import javax.swing.JOptionPane;

public class Principal {
	public static int busca(int chave, int tamanho, Produto[] x) {
		//recebe uma chave e retorna uma posição do vetor e -1 se não encontrar
		int i;
		for(i = 0; i<tamanho; i++) {
			if(x[i].id == chave){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int i = 1, cont, id, tamanho = 0, op = 1;
		int posicao, chave, quantVenda, somaQuant;
		String nome, tipo;
		int quantidade;
		double valor, novoValor;
		
		Produto[] vetor = new Produto[100];
		cont = 0;
		while(i!=0) {
			System.out.println("Valor do Contador: "+ cont);
			System.out.println("Valor do indice vetor: "+ tamanho);
			if(cont == 4) {
				cont = 0;
			} 
			if(cont == 0) {
				JOptionPane.showMessageDialog(null, "Cadastrar Usando o Construtor 1\nFormato: Produto(int id)");
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Produto"));
				vetor[tamanho] = new Produto(id);
				nome = JOptionPane.showInputDialog(null, "Digite o nome do Produto de id " + id + " : ");
				//tipo = JOptionPane.showInputDialog(null, "Digite o tipo do Produto de id " + id + " : ");
				quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quantidade em Estoque do produto de id " + id + " : "));
				valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor do produto de id " + id + " : "));
				vetor[tamanho].inserir(nome, quantidade, valor);
				cont++;
			} else if (cont == 1) {
				JOptionPane.showMessageDialog(null, "Cadastrar Usando o Construtor 2\nFormato: Produto(int id, String nome)");
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Produto"));
				nome = JOptionPane.showInputDialog(null, "Digite o nome do Produto de id " + id + " : ");
				vetor[tamanho] = new Produto(id, nome);
				//tipo = JOptionPane.showInputDialog(null, "Digite o tipo do Produto de id " + id + " : ");
				quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quantidade em Estoque do produto de id " + id + " : "));
				valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor do produto de id " + id + " : "));
				vetor[tamanho].inserir(quantidade, valor);
				cont++;
			} else if (cont == 2) {
				JOptionPane.showMessageDialog(null, "Cadastrar Usando o Construtor 3\nFormato: Produto(int id, String nome, int quantidade)");
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Produto"));
				nome = JOptionPane.showInputDialog(null, "Digite o nome do Produto de id " + id + " : ");
				quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quantidade em Estoque do produto de id " + id + " : "));
				vetor[tamanho] = new Produto(id, nome, quantidade);
				valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor do produto de id " + id + " : "));
				vetor[tamanho].inserir(valor);
				cont++;
			} else if (cont == 3){
				JOptionPane.showMessageDialog(null, "Cadastrar Usando o Construtor 4\nFormato: Produto(int id, String nome, int quantidade, String tipo, double valor)");
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Produto"));
				nome = JOptionPane.showInputDialog(null, "Digite o nome do Produto de id " + id + " : ");
				quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quantidade em Estoque do produto de id " + id + " : "));
				vetor[tamanho] = new Produto(id, nome, quantidade);
				valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor do produto de id " + id + " : "));
				tipo = JOptionPane.showInputDialog(null, "Digite o tipo do Produto de id " + id + " : ");
				vetor[tamanho] = new Produto(id, nome, quantidade, tipo, valor);
				cont++;
			}
			tamanho++;
			i = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para Finalizar\n Digite Outro numero para continuar"));
		}
		
		while(op!=0) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Deseja Realizar uma Operação ?\n"
											  + "0 - Sair\n"
											  + "1 - Vender\n" 
											  + "2 - Comprar\n"
											  + "3 - Consultar\n"
											  + "4 - Comparar"));
			
			chave = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave que deseja Buscar: "));
			posicao = busca(chave, tamanho, vetor);
			
			switch(op) {
				case 0:
					return ;
				case 1:
					//vender
					if(posicao != -1) {
						quantVenda = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja vender: "));
						vetor[posicao].vender(quantVenda);
					} else {
						JOptionPane.showMessageDialog(null, "Produto não encontrado");
					}
				break;
				case 2:
					//comprar
					if(posicao != -1) {
						novoValor = Double.parseDouble(JOptionPane.showInputDialog("Reajuste do Valor do produto: "));
						somaQuant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Comprada: "));
						vetor[posicao].comprar(novoValor, somaQuant);
					}else {
						JOptionPane.showMessageDialog(null, "Produto não encontrado");
					}
				break;
				case 3:
					//consultar
					if(posicao != -1) {
						vetor[posicao].consultar();
					} else {
						JOptionPane.showMessageDialog(null, "Produto não encontrado");
					}
				break;
				case 4:
					//comparar
				break;
			}
		}
	}

}
