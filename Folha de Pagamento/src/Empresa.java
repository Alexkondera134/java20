
public class Empresa {
	public static void main(String[] args) {

		Funcionario f1, f2, f3;

		f1 = new Funcionario();
		f2 = new Funcionario();
		f3 = new Funcionario();

		f1.setNome("Alex");
		f1.setFuncional(999);
		f1.setEmail("alex.ezequiel");
		f1.setSalario(10000);
		System.out.println("Dados dos funcion�rios:\n" + f1.exibirInfo());

		f1.reajustarSalario(15);
		System.out.println("Reajuste Salarial: " + f1.exibirInfo());
		
		f1.calcularImposto();
		System.out.println("Imposto: " + f1.exibirInfo());
		
		

	}
}