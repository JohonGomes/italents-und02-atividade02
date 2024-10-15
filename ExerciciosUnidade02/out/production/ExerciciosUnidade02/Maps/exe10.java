package Unidade02.ExerciciosUnidade02.out.production.ExerciciosUnidade02.Maps;

import java.util.ArrayList;
import java.util.Collections;

public class exe10 {
    public static void main(String[] args) {
        //Cria um ArrayList chamado numeros que armazenará elementos do tipo Integer (números inteiros).
        ArrayList<Integer> numeros = new ArrayList<>();
        //Adiciona vários números inteiros ao ArrayList chamado numeros.
        numeros.add(12);
        numeros.add(5);
        numeros.add(9);
        numeros.add(20);
        numeros.add(3);
        numeros.add(15);

        //Imprime a lista original de números.
        System.out.println("Lista original: " + numeros);
        //Chama o metodo quickSortDecrescente para ordenar a lista em ordem decrescente.
        // Os argumentos passados são o ArrayList numeros, o índice inicial (0) e o índice final (numeros.size() - 1).
        quickSortDecrescente(numeros, 0, numeros.size() - 1);

        //Imprime a lista ordenada em ordem decrescente após a execução do Quick Sort.
        System.out.println("Lista ordenada (decrescente) com Quick Sort: " + numeros);
    }

    //Define o metodo quickSortDecrescente para ordenar uma ArrayList de inteiros em ordem decrescente.
    // Recebe a lista, o índice inicial e o índice final como parâmetros.
    public static void quickSortDecrescente(ArrayList<Integer> lista, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(lista, inicio, fim);
            quickSortDecrescente(lista, inicio, pivo - 1);
            quickSortDecrescente(lista, pivo + 1, fim);
        }
    }

    //Chama o metodo particionar para obter o índice do pivô após a partição da lista.
    // O pivô será usado para dividir a lista em duas partes.
    public static int particionar(ArrayList<Integer> lista, int inicio, int fim) {
        int pivo = lista.get(fim);
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            //Verifica se o elemento atual (lista.get(j)) é maior ou igual ao pivô.
            // Como a ordenação é decrescente, os maiores valores são movidos para a frente.
            if (lista.get(j) >= pivo) {
                i++;

                //Troca o elemento que está logo após a última posição maior que o pivô com o pivô,
                // colocando o pivô em sua posição final ordenada.
                Collections.swap(lista, i, j);
            }
        }

        Collections.swap(lista, i + 1, fim);
        return i + 1;
    }
}
