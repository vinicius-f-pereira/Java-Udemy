package ArraysECollections.Colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
//		Offer e add -> adicionam elementos na fila
//		Diferença é o comportamento quando a fila está cheia.
		
		fila.add("Ana"); // add retorna false quando a fila está cheia
		fila.offer("Bia"); // offer lança exceção quando a fila está cheia
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
//		peek e elemente -> obter o próximo elemento da fila (sem remover)
//		diferença de comportamento ocorre quando a fila está vazia!
		
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // lança uma exceção
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains();		
		// poll e remove -> obtem o próximo elemento da fila e remove.
		
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
