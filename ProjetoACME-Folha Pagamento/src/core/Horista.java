package core;

public class Horista extends Funcionario{
		
	private double valorHora;
	private int numeroHora;
	
	public Horista(int numRegistro, String nome, double valorHora, int numeroHora) {
		super(numRegistro, nome);
		this.valorHora = valorHora;
		this.numeroHora = numeroHora;
	}

	@Override
	public double calcularSalario(double salario) {
		salario = valorHora * numeroHora;
		return salario;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHora() {
		return numeroHora;
	}

	public void setNumeroHora(int numeroHora) {
		this.numeroHora = numeroHora;
	}
	
	
	

}
