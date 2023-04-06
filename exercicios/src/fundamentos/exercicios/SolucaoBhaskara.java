package fundamentos.exercicios;

public class SolucaoBhaskara {

	public static void main(String[] args) {

//		(ax2 + bx + c = 0)
		
		double a = 1;
		double b = 12;
		double c = -13;
		
		double formula = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("O delta é: " + formula);
		
	}
}
