package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public void frear() {
		if (velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		} else {
			velocidadeAtual = 0;
		}
	}

	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + " Km/h.";
	}

	public void ligarTurbo() {

	}

	public void desligarTurbo() {

	}

	public void ligarAr() {

	}

	public void desligarAr() {

	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

}
