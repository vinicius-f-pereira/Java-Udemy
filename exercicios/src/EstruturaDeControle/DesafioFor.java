package EstruturaDeControle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for(; !valor.equals("######");) {
			System.out.printf(valor);
			valor += "#";	
		}
		// Não pode utilizar de forma alguma valor numerico pra controlar o laço!
	}
}
