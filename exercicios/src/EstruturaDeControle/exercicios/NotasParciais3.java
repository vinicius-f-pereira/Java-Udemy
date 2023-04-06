package EstruturaDeControle.exercicios;

import java.util.Scanner;

public class NotasParciais3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = entrada.nextDouble();

		double media = (n1 + n2) / 2;	
		

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media < 7.0 && media >= 4.0) {
			System.out.println("Recuperação.");
		} else
			System.out.println("Reprovado");
		
		entrada.close();
	}
}
