
public class Empregado {
	String nome, cargo;
	double salario;

	void imprimir() {

		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("S�lario " + salario);
	}

	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
		System.out.println("Novo sal�rio: " + salario);
		System.out.println("");
	}

}
