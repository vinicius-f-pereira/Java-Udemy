package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = "texto"; // ou new String("text");
		s.toUpperCase();
		
		//wrappers são a versão objeto dos tipos primitivos.
		int a = 123;
		System.out.println(a);
	}
	

}
