
public class Operacoes {
	public static void main(String[] args) {
		
		ContaCorrente cli1, cli2, cli3;
		
		cli1 = new ContaCorrente();
		cli2 = new ContaCorrente();
		cli3 = new ContaCorrente();
		
		cli2.nomeTitular = "Samuel";
		cli2.cpf="123.124.125.90";
		cli2.numeroConta = 4969;
		cli2.digitoVer = 9;
		cli2.saldo = 4;
		
		cli3.nomeTitular = "Manuela";
		cli3.cpf="134.177.155.60";
		cli3.numeroConta = 4969;
		cli3.digitoVer = 9;
		cli3.saldo = 4;
		
		cli1.nomeTitular = "Romario";
		cli1.cpf="113.121.115.99";
		cli1.numeroConta = 4969;
		cli1.digitoVer = 9;
		cli1.saldo = 4;
		
		
		cli3.Depositar(20);
		
		
		
		
	}

}
