
public class Empregado {
	String nome, cargo;
	double salario;

	void imprimir() {

		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Sálario " + salario);
	}

	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
		System.out.println("Novo salário: " + salario);
		System.out.println("");
	}

}
