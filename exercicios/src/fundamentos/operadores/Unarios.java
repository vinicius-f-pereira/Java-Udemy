package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
	
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // nesse caso ele faz o operador pre fixado primeiro, posteriormente compara "a e b" e depois o operador pós fixado
		System.out.println(a == b);
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
}
