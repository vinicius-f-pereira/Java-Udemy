package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorFtoCelsius {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.println("Valor em Celsius: " + celsius + "°C.");
		
		entrada.close();
	}

}
