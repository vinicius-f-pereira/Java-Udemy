package EstruturaDeControle.exercicios;

import java.util.Scanner;

public class Primos4 {

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

		if (contadorDeDivisores == 0) {
			System.out.println("\nO número " + num + " é primo.");
		}else {
		System.out.println("\nO número " + num + " não é primo.");
		}
		entrada.close();
	}
}
