package EstruturaDeControle;

public class For3 {
	public static void main(String[] args) {

////		int i = 0; //aqui a variavel funciona para todo o código
//		for(int i = 0; i < 10; i++) { //aqui a variável está restrita ao laço for
//			System.out.println(i);
//		}
//		int i = 0; //ela também pode ser repetida fora do laço em casos de estar restrita apenas ao laço como o exemplo acima.
//		System.out.println(i);
//	

		// laço dentro do outro

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
				System.out.println();
			
		}

	}
}
