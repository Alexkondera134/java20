package Core;

public class BombaDeCombustivel {
	private String nome;
	private double preco;
	private double qtde;
	private double total;
	public BombaDeCombustivel(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
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
	
	public void abastecerPorLitro (double qtde) {
		this.qtde = qtde;
		total = qtde * preco;
	}
	
	public void abastecerPorValor (double valor) {
		this.total = valor;
		this.qtde = total / preco;
	}
	
	public String exibir() {
		String recibo = " **************************\n" + " Nome da empresa\n"  +
	                    " **************************\n" + 
	                    " Combustível : " + nome +"\n" +
	                    " Preço: " + String.format("%.2f\n", preco) + " Total: " + String.format("%.2f\n", total);
		return recibo;            
	}

}
