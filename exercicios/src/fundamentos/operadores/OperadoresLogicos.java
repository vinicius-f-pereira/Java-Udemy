package fundamentos.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {

		
//		Operador Lógigo "E"(or) é representado por &&
//		Operador Lógigo "Ou"(and) é representado por || "pipe"
//		Operador Lógigo "Ou exclusivo"(xor) é representado por "^" - Apenas quando um é falso e outro é verdadeiro o XOR "funciona".
//		Operador Lógigo "Negação"(not) é representado por "!"
			
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
	
		System.out.println("\nTabela Verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);

		
		System.out.println("\nTabela Verdade OU");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("\nTabela Verdade Negação");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
		
		
	}

}
