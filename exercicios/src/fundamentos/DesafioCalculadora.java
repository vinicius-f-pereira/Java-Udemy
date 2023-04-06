package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		// Ler num1
		// Ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();

		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String op = entrada.next();
		
//		Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
	
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
//				
//		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
//		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
//		String operador = JOptionPane.showInputDialog("Digite o operador: +, -, *, ou / ?");
//		
//		String resultado = valor1 + operador + valor2;
//		
//		System.out.println(resultado);
//		
	entrada.close();
		
	}

}
