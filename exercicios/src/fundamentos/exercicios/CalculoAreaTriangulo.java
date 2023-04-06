package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoAreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite a base do triangulo: ");
		double base = entrada.nextDouble();
		
		double area = altura * base / 2;
		
		System.out.println("A área do triangulo é: " + area);
		
		entrada.close();
		
		
		
		
	}
}
