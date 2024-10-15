package Unidade02;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilhas {

	public static void main(String[] args) {
		// Criar uma pilha
		// LIFO , "Last in , first out", o último adicionado sai primeiro.
		Deque<Integer> pilha = new ArrayDeque<>();
		
		
		pilha.push(10); // .push, adicionar itens novos na pilha.
		pilha.push(15);
		pilha.push(20);
		pilha.push(30);
		pilha.push(56);
		
		System.out.println(pilha); // imprime a ordem contrária 56,30,20,15,10
		
		System.out.println(pilha.peek()); // .peek() visualiza a primeira posição da pilha
		
		pilha.pop(); //.pop() remove o último item adicionado.
		System.out.println(pilha);
		
		// desempilhando toda a pilha item a item
		while(!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}
		
	}

}
