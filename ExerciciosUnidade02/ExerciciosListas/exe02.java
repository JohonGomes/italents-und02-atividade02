package ExerciciosListas;

import java.util.ArrayList;

/*2 - Remoção de Elementos Duplicados:
Crie um metodo para remover elementos duplicados de um ArrayList
 */
public class exe02 {
    public static void main(String[] args) {
        // Cria um novo ArrayList para armazenar números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        // Adiciona os números 2, 4, 6, 4, 2, 6 à lista
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(4);
        numeros.add(2);
        numeros.add(6);

        // Imprime a lista original
        System.out.println("Lista de Arrays Original: " + numeros);

        // Chama o metodo removerDuplicados para eliminar elementos repetidos
        removerDuplicados(numeros);

        // Imprime a lista após a remoção dos duplicados
        System.out.println("Lista sem elementos duplicados: " + numeros);
    }

    // Metodo para remover elementos duplicados da lista
    public static void removerDuplicados(ArrayList<Integer> lista){
        // Loop externo: percorre a lista do início ao fim
        for (int i=0; i < lista.size(); i++){
            // Loop interno: começa do elemento seguinte ao i até o final da lista
            for (int j = i + 1; j < lista.size(); j++){
                // Compara o elemento na posição i com o elemento na posição j
                if(lista.get(i).equals(lista.get(j))){
                    // Se forem iguais, remove o elemento na posição j
                    lista.remove(j);
                    // Decrementa j para compensar a remoção e não pular o próximo elemento
                    j--;
                }
            }

        }
    }
}
