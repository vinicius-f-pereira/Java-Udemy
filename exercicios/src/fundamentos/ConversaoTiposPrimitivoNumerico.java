package fundamentos;

public class ConversaoTiposPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //conversao implicita
		System.out.println(a);
		
		float b = (float) 1.12456; //conversao explicita (CAST)
		System.out.println(b);
		
		int c = 130; //conversao implicita
		System.out.println(c);
		
		byte d = (byte) c; //conversao explicita (CAST)
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;
		System.out.println(f);
	}

}
