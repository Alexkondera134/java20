
public class ContaCorrente {

	private int numeroConta, digitoVer;
	private String nomeTitular, cpf;
	private double saldo = 0;

	public String ExibirInfo() {
		return "Conta " + numeroConta + "\n" + "/" + "DV" + digitoVer + "Titular: " + nomeTitular + " (" + cpf + ")"
				+ "\n" + "saldo : R$" + saldo;

	}

	public void alteraNumeroConta(int novoNumero) {
		numeroConta = novoNumero;
	}

	public int consultaNumeroConta() {
		return numeroConta;
	}

	public void depositar(double deposito) {
		double saldoAnterior = saldo;
		saldo += deposito;
	}

	public boolean sacar(double saque) {
		if (saldo >= saque) {
			saldo -= saque;
			return true;
		}
		return false;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVer() {
		return digitoVer;
	}

	public void setDigitoVer(int digitoVer) {
		this.digitoVer = digitoVer;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
