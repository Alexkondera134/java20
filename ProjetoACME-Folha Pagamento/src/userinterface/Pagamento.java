package userinterface;

import core.Chefe;
import core.Funcionario;
import core.Horista;

public class Pagamento {
	public static void main(String[] args) {
		
		Funcionario c1;
		c1 = new Chefe(01,"Alex",30,50);
		
		c1.calcularSalario(500);
		((Chefe) c1).exibir();
		
		Funcionario h1 = new Horista (10,"Roberval", 180, 80);
		
		System.out.println("Salario horista: " + h1.calcularSalario(0));
		
	}

}