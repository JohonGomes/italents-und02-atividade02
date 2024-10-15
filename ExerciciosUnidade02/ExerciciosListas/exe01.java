package ExerciciosListas;

import java.util.ArrayList;

/*1 - Inversão de Lista:
Escreva um programa para inverter os elementos de um ArrayList sem usar métodos prontos do
java.
*/
public class exe01 {
    public static void main(String[] args) {
        //Cria um ArrayList de inteiros chamado "numeros"
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);

        //Imprime a lista original e seu tamanho.
        System.out.println("Lista de Arrays Original: " + numeros);
        int tamanhoArray = numeros.size();
        System.out.println("Tamanho do Array: " + tamanhoArray + " itens");

        //Utiliza um loop para inverter a ordem dos elementos na lista
        //Troca os elementos das extremidades (primeiro com último, segundo com penúltimo, etc.).
        for (int i = 0; i < tamanhoArray / 2; i ++){
            int temp = numeros.get(i);
            numeros.set(i, numeros.get(tamanhoArray - i - 1));
            numeros.set(tamanhoArray -i -1, temp);
        }
        //Imprime a lista invertida
        System.out.println("\nLista do Array Invertida: " + numeros);
    }
}
