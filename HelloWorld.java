import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Hello World");
		int a;
		System.out.println("digite o valor de a");
		a = entrada.nextInt();
		System.out.println("Voc� digitou "+ a);
		entrada.close();
	}

}
