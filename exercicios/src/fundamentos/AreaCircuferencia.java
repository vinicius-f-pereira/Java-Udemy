package fundamentos;

public class AreaCircuferencia {
	
	public static void main(String[] args) {
//		int raio = 3; // numeros inteiros
		double raio = 3.4; //***numeros com ponto
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + " m2.");
	}

}
