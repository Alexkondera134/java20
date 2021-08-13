package core;

public class Empreiteiro extends Funcionario {

	private double valorEmpreita;

	public Empreiteiro(int numRegistro, String nome, double valorEmpreiteiro) {
		super(numRegistro, nome);
		this.setValorEmpreiteiro(valorEmpreiteiro);
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}

	public double getValorEmpreiteiro() {
		return valorEmpreita;
	}

	public void setValorEmpreiteiro(double valorEmpreiteiro) {
		this.valorEmpreita = valorEmpreiteiro;
	}

}
