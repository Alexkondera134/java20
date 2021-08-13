package core;

public class Comissionado extends Funcionario{
	
	private double salarioBase;
	private double comissao;
	
	public Comissionado(int numRegistro, String nome) {
		super(numRegistro, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
