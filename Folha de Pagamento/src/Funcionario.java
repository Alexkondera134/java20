
public class Funcionario {

	private int funcional;
	private String nome, email;
	private double salario;

	public String exibirInfo() {
		return "N�mero da funcional: " + funcional + "\n" + "Nome do funcion�rio: " + nome + "\n" + "Email: " + email + "\n"
				+ "Sal�rio " + salario + "\n";
	}

	public void reajustarSalario(double porcentagem) {
		salario = salario + salario * porcentagem / 100;
		System.out.println("Novo Sal�rio: "+salario);
	}

	public double calcularImposto(){
		if (salario <= 2000.00) {
			return 0.0;
		}
		if (salario > 2000 && salario <= 3000) {
		salario *= 0.15;
		} else if (salario > 3000 && salario <= 4500) {
			return salario * 0.25;
		} else if (salario > 4500) {
			return salario * 0.15;
		}
		return salario;

	}

	public int getFuncional() {
		return funcional;
	}

	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
