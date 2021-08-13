package proj_Bomba_de_Combustivel;

public class Posto {
	
	private String nome;
	double preco, qtde, total;
	
	public void abastecer (String nome, double preco, double qtde) {
		this.nome = nome;
		this.preco = preco;
	}
		
		public void abastecerPorQtde (double litros) {
			total = litros * preco;
		}
		
		public void abastecerPorValor (double valor) {
			total = valor / preco; 
		}
		
		public Exibir() {
			System.out.println("Pagamento: " + total);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public double getQtde() {
			return qtde;
		}

		public void setQtde(double qtde) {
			this.qtde = qtde;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}
		
		
}


		



