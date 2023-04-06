package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a,  3);
//		double c = Math.pow(a,  3);
//		
//		System.out.println(b);
//		System.out.println(c);
		

		/*
		 * meu código
		 * 
		 * double num1 = 3 + 2; double num2 = 6 * num1; double conj1 =
		 * Math.pow(num2, 2); double den1 = 3 * 2; double reso1 = conj1 / den1;
		 * 
		 * // System.out.println(reso1);
		 * 
		 * double num3 = 1 - 5; double num4 = 2 - 7; double conj2 = num3 * num4; double
		 * den2 = 2; double reso2 = conj2 / den2; double reso3 = Math.pow(reso2, 2);
		 * 
		 * 
		 * // System.out.println(reso3);
		 * 
		 * double numer1 = reso1 - reso3; double numer2 = Math.pow(numer1, 3); double
		 * pot1 = Math.pow(10, 3); double solution = numer2 / pot1;
		 * 
		 * System.out.println("O resultado é: " + solution);
		 */
		
		// Código da aula
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
	
		
		System.out.println("O resultado é: " + resultado);
		
		
		
		
		
		
	}
	
}
