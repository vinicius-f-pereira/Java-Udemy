package Classe;

public class Produto {
	
	String nome;
	double preço;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preço = precoInicial;
		
	}
	
	double precoComDesconto() {
		return preço * (1 - desconto);
		
	}
	double precoComDesconto(double descontoDoGerente) {
		
		return preço * (1 - desconto + descontoDoGerente);
	}
}
