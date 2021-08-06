
public class Loja {
	public static void main(String[] args) {
		Carro c1;
		Carro c2;
		
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "Wolksvagem";
		c1.modelo = "Novo fusca";
		c1.ano = 2010;
		c1.cor = "Azul";
		c1.preco = 20000.99;
		
		
		c2.marca = "Honda";
		c2.modelo = "Civic";
		c2.ano = 1999;
		c2.cor = "Preto";
		c2.preco = 130000;
				
		c1.exibirInfo();
		c2.exibirInfo();
		
		c1.aplicarDesconto(10.00);
		c2.aplicarDesconto(10.00);
		c1.exibirInfo();
		c2.exibirInfo();		
		
		double ipvaC1 = c1.calcularIpva();
		
		System.out.println("Valor do ipva do " + c1.modelo + " = " + ipvaC1);//Chamada a v�riavel
		System.out.println("Valor do ipva do " + c2.modelo + " = " + c2.calcularIpva()); // chamado diretamente o m�todo
	}

}
