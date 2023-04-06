package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorCtoF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor em Celsius para converter: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = celsius * 1.8 + 32;
		
		System.out.println(celsius + "° Celsius é igual a " + fahrenheit + "° Fahrenheit.");
		
		
		entrada.close();
		
	
		
	}
}
