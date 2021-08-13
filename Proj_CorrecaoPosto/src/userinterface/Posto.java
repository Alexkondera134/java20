package userinterface;

import Core.BombaDeCombustivel;

public class Posto {
	public static void main(String[] args) {
	
		BombaDeCombustivel b1 = new BombaDeCombustivel("Gasosa", 4.50);
		b1.abastecerPorLitro(4.5);
		System.out.println("Dados: " + b1.exibir());
		b1.abastecerPorValor(80.99);
		System.out.println(b1.exibir());
	}
	
	
	

}
