package EstruturaDeControle.exercicios;

import java.util.Scanner;

public class zeroADezPar1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número de 0 a 10 para saber se é par ou impar: ");
		int num = entrada.nextInt();
		
		if(num <0 || num > 10) {
			System.out.println("Número invalido!!!");
		} else if(num % 2 == 0) {
			System.out.println("O número " + num + " é par e está entre 0 e 10!");
		} else
			System.out.println("O número " + num + " não é par mas está entre 0 e 10!");
		
		
		
		entrada.close();
	}
}
