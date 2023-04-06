package EstruturaDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		// if (expressao True or False) sentença; ou {} (bloco de codigo)
		// while(...) sentença; ou {}
		// for(...; ...; ...) sentença; ou {}

		// do {} while(...);

		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras mágicas... ");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();

		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");

		entrada.close();

	}
}
