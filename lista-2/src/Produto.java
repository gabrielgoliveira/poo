import javax.swing.JOptionPane;

public class Produto {
	int id;
	String nome;
	int quantidade;
	String tipo;
	double valor;


	Produto(int id){
		//construtor completo
		this.id = id;
		System.out.println("Objeto Instanciado\n");
	}

	Produto(int id, String nome){
		//construtor completo
		this.id = id;
		this.nome = nome;
		System.out.println("Objeto Instanciado\n");
	}

	
	Produto(int id, String nome, int quantidade){
		//construtor completo
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		System.out.println("Objeto Instanciado\n");
	}
	
	Produto(int id, String nome, int quantidade, String tipo, double valor){
		//construtor completo
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.valor = valor;
		System.out.println("Objeto Instanciado\n");
	}
	
	
	boolean vender(int quantidade){
		if(this.quantidade >= quantidade){
			this.quantidade -= quantidade;
			JOptionPane.showMessageDialog(null, "Venda Realizada\nValor da venda: R$ " + (this.valor*quantidade));
			return true;
		} else {
			return false;
		}
	}
	
	void comprar(double novoValor, int quantidade){
		this.quantidade += quantidade;
		this.valor = novoValor;
	}
	void comprar(int quantidade){
		this.quantidade += quantidade;
	}
	void consultar(){
		JOptionPane.showMessageDialog(null, "Id : " + this.id + "\nNome Produto : " + nome + "\nQuantidade : " + this.quantidade + "\nTipo do Produto : " + this.tipo + "\nValor : " + this.valor);
	
	}
	void inserir(String nome, int quantidade, double valor){
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	void inserir(int quantidade, double valor){
		this.quantidade = quantidade;
		this.valor = valor;
	}
	void inserir(double valor){
		this.valor = valor;
	}
	boolean igual(Produto compara){
		
		if(this.nome == compara.nome  && this.tipo == compara.tipo) {
			return true;
		} else {
			return false;
		}
		
	}

}
