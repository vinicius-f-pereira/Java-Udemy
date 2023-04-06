package EstruturaDeControle.exercicios;

import java.util.Scanner;

public class Positivos7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int somaDeNum = 0;
		int num = 0;
		
		while(num >= 0 ) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			num = scanner.nextInt();
			if(num >= 0) {
				somaDeNum += num; //isso é igual somaDeNum + num;
				System.out.printf("\nSoma até o momento: %d\n", somaDeNum);
			}
		}
		
		
		scanner.close();
		
		
	}
}
