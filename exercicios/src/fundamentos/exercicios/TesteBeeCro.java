package fundamentos.exercicios;

import java.util.Scanner;

public class TesteBeeCro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int A = input.nextInt();
		
		System.out.println("Digite um número: ");
		int B = input.nextInt();
		
		int sum = A+B;
		
		System.out.println("X = " + sum);
		
		
		System.out.println("Digite um número: ");
		int C = input.nextInt();
		
		System.out.println("Digite um número: ");
		int D = input.nextInt();
		
		int sum2 = C+D;
		
		System.out.println("X = " + sum2);

		
		System.out.println("Digite um número: ");
		int E = input.nextInt();
		
		System.out.println("Digite um número: ");
		int F = input.nextInt();
		
		int sum3 = E+F;
		
		System.out.println("X = " + sum3);
		
		
		input.close();
	}
}
