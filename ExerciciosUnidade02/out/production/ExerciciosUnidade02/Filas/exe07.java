package Unidade02.ExerciciosUnidade02.out.production.ExerciciosUnidade02.Filas;

import java.util.LinkedList;
import java.util.Queue;

public class exe07 {
    public static void main(String[] args) {
        // Cria uma fila (Queue) de inteiros usando LinkedList
        Queue<Integer> fila = new LinkedList<>();

        // Adiciona elementos à fila
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        // Imprime a ordem de chegada dos elementos na fila
        System.out.println("Ordem de chegada dos elementos na fila: " + fila);

        // Imprime a ordem de saída dos elementos da fila
        System.out.print("Ordem de saída dos elementos na fila: ");

        // Loop que continua enquanto a fila não estiver vazia
        while (!fila.isEmpty()) {
            // Remove e imprime cada elemento da fila
            System.out.print(fila.poll() + " ");
        }
    }
}