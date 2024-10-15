package Unidade02;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//FIFO , First , first out - primeiro a entrar primeiro a sair;
		
		Queue<String> fila = new LinkedList<>();
		
		// Adicionar itens a fila .offer()
		fila.offer("1º Fila");
		fila.offer("2º Fila");
		fila.offer("3º Fila");
		
		
		System.out.println(fila.peek());// mostra o primeiro da fila .peek()
		
		System.out.println(fila.poll()); //remove o primeiro item da fila . poll()
		
		while(!fila.isEmpty()) {
			System.out.println(fila.poll());
		}
		
		System.out.println(fila);

	}

}
