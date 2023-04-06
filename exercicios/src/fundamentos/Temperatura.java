package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//		(°F - 32) x 5/9 = °C
/* meu código
		int ajuste = 32;
		double multiplicador = 5/9.0;
		int F = 90;
		double C = (F - ajuste) * multiplicador;
		
		System.out.println("°" + F + "F são = " + "°" + C + "C.");
*/
		//codigo resposta aula
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius + "°C.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
		
		
		

	}

}
