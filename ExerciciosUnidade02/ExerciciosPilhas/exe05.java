package ExerciciosPilhas;

import java.util.ArrayList;
import java.util.Stack;

public class exe05 {
    public static void main(String[] args) {
        // Cria um ArrayList e adiciona alguns números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        numeros.add(12);
        numeros.add(15);

        // Imprime a lista original
        System.out.println("Lista de Arrays Original: " + numeros);
        // Chama o metodo para inverter a lista
        inverterArrayComPilha(numeros);
        // Imprime a lista invertida
        System.out.println("Lista de Arrays Invertida: " + numeros);
    }

    public static void inverterArrayComPilha(ArrayList<Integer> lista){
        // Cria uma nova pilha
        Stack<Integer> pilha = new Stack<>();

        // Percorre a lista e empilha cada número
        for (Integer numero : lista){
            pilha.push(numero);
        }

        // Percorre a lista novamente, substituindo cada elemento pelo topo da pilha
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, pilha.pop());
        }
    }
}