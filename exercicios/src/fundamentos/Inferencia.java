package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		double d; //variavel foi declarada
		d = 123.65; //variavel foi inicializada
		System.out.println(d); //usada
		
		var e = 123.45; //na "var" nao é possivel iniciar a variavel posteriormente, ela precisa ser declarada e iniciada na mesma linha
		System.out.println(e);
		
		var f = 12;
//		f = 12.01; - não é possivel mudar inteiro pra double, porém double para int é possível.
		System.out.println(f);
		
	}

}
