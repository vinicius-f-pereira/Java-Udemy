package ArraysECollections;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas notas você deseja informar? ");

		int qtdeNotas = scanner.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota: " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		}
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		
		System.out.println("A média é " + media);
		scanner.close();
		
	}
}
