package EstruturaDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// Segunda -> 2
		// Terça -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// Sábado -> 7

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");

//		String[] validos = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

		String dia = entrada.next();

//		if (dia.equals(validos)) {
//			System.out.println("Entrada Invalida!!!");
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Primeiro dia da semana.");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Segundo dia da semana.");
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println("Terceiro dia da semana.");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Quarto dia da semana.");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Quinto dia da semana.");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Sextooou!!!");
		} else {
			System.out.println("Dia Invalido!");
		}

		entrada.close();

	}
}
