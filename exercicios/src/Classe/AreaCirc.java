package Classe;

public class AreaCirc {

	double raio;
	static final double pi = 3.14;

	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi; // ou pi * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
