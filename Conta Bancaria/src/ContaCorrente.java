
public class ContaCorrente {
	
	int numeroConta, digitoVer;
	String nomeTitular, cpf;
	double saldo;
	
	void ExibirInfo(){
		System.out.println("Nome do Titular: "+ nomeTitular);
		System.out.println("N�mero da Conta: "+ numeroConta + " dv: "+ digitoVer);		
		System.out.println("Saldo Atual    : R$"+ saldo);
		
	}
	
	void Depositar (double deposito){
		double saldoAnterior= saldo;
		saldo += deposito;
		ExibirInfo();
		System.out.println("Saldo anterior : R$" + saldoAnterior);
		
	}
	
	void Sacar (double saque) {
		if(saque > saldo){
			System.out.println("Saldo Insuficiente. O Valor maximo de saque �: R$" + saldo );
					}
		else {
			saldo -= saque;
			System.out.println("%.2f Saldo ap�s saque: R$" + saldo);
		}
	}

}
