package core;

public class Chefe extends Funcionario{
	
	private double salarioBase;
	private double adicinalFuncao;
	private double beneficioTerno;
	
	public Chefe(int numRegistro, String nome, double adicionalFuncao, double beneficioTerno) {
		super(numRegistro, nome);
		this.adicinalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
		
	}

	@Override
	public double calcularSalario(double salario) {
		this.salarioBase = salario + salario * adicinalFuncao/100 + beneficioTerno;		
		
		return salario;
	}
	
	public void exibir() {
		System.out.println("Você é chefe e seu salario é: " + this.salarioBase);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicinalFuncao() {
		return adicinalFuncao;
	}

	public void setAdicinalFuncao(double adicinalFuncao) {
		this.adicinalFuncao = adicinalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	

}
