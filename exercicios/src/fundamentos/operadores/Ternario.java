package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
//		expressão. valor se verdadeiro, valor se falso. Ex:    media >= 5.0 ? "Aprovado" : "Reprovado"
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
 		
		System.out.println("Tem desconto? " + resultado); 
		
	}

}
