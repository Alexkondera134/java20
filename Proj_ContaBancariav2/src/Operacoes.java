import java.util.Scanner;

public class Operacoes {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao;
		double valor;

		ContaCorrente cli1, cli2, cli3;

		cli1 = new ContaCorrente();

		cli1.setNumeroConta(123456);
		cli1.setCpf("333123554");
		cli1.setNomeTitular("Alex");
		cli1.setDigitoVer(3);
		cli1.setSaldo(2000.00);

		do {
			System.out.println("Bem vindo");
			System.out.println("digite 1-Info / 2-Deposito / 3-Saque / 0-Encerrar");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(cli1.ExibirInfo());
				break;

			case 2:
				System.out.println("[DEPOSITO] Digite o valor : ");
				valor = entrada.nextDouble();
				cli1.depositar(valor);
				break;

			case 3:
				System.out.println("[SAQUE   ] Digite o valor : ");
				valor = entrada.nextDouble();
				if (cli1.sacar(valor)) {
					System.out.println("      Saque Autorizado: ");

				} else {
					System.out.println("    Saldo Insuficiente:");
				}

			}
		} while (opcao != 0);

	}

}
