package EstruturaDeControle.exercicios;

import java.util.Scanner;

public class Primos5Switch {

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o número: ");
		int num = entrada.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			System.out.println("É primo");
			break;
		default:
			System.out.println("Não é primo");
		}
		entrada.close();
	}
}
