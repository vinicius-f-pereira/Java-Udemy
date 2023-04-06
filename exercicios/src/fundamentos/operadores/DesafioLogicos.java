package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {

		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		//Operador unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"?\n" + comprouTv50);
		System.out.println("Comprou TV 32\"?\n" + comprouTv32);
		System.out.println("Comprou Sorvete?\n" + comprouSorvete);
		System.out.println("Mais saudável?\n" + maisSaudavel);
	}
}
