package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Informe sua altura:\n");
			String altura = entrada.next().replace(",", ".");

			System.out.print("Informe seu peso:\n");
			String peso = entrada.next().replace(",", ".");
			
			double alt = Double.parseDouble(altura);		
			double pes = Double.parseDouble(peso);		
			
			double imc = pes / (alt * alt);
						
			System.out.printf("O seu IMC é: %.2f ", imc);
			
			entrada.close();
		}
}
