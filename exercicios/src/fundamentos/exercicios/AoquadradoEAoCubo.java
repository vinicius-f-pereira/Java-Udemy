package fundamentos.exercicios;

import java.util.Scanner;

public class AoquadradoEAoCubo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digita um numéro:");
		double num = entrada.nextDouble();

		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);

		System.out.printf("Elevado ao quadrado é: %.2f.\nAo cubo é: %.2f", quadrado, cubo);

		entrada.close();
	}

}
