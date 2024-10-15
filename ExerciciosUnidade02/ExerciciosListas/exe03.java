package ExerciciosListas;
import java.util.ArrayList;

public class exe03 {
    public static void main(String[] args) {
        // Cria a primeira ArrayList e adiciona os elementos 1, 3, 5
        ArrayList<Integer> lista01 = new ArrayList<>();
        lista01.add(1);
        lista01.add(3);
        lista01.add(5);

        // Cria a segunda ArrayList e adiciona os elementos 2, 4, 6
        ArrayList<Integer> lista02 = new ArrayList<>();
        lista02.add(2);
        lista02.add(4);
        lista02.add(6);

        // Chama o metodo intercalarListas e armazena o resultado em 'intercalada'
        ArrayList<Integer> intercalada = intercalarListas(lista01, lista02);

        // Imprime as listas originais e a lista intercalada
        System.out.println("Lista de Array 01: " + lista01);
        System.out.println("Lista de Array 02: " + lista02);
        System.out.println("\nLista Intercalada (Array 01 + Array 02): " + intercalada);
    }

    public static ArrayList<Integer> intercalarListas(ArrayList<Integer> lista01, ArrayList<Integer> lista02){
        // Cria uma nova ArrayList para armazenar os elementos intercalados
        ArrayList<Integer> intercalada = new ArrayList<>();

        // Obtém o tamanho das listas de entrada
        int tamanho01 = lista01.size();
        int tamanho02 = lista02.size();
        // Determina o tamanho da maior lista
        int tamanhoTotal = Math.max(tamanho01, tamanho02);

        // Loop para intercalar os elementos
        for (int i = 0; i < tamanhoTotal; i++){
            // Se ainda houver elementos na lista01, adiciona o elemento atual
            if (i < tamanho01){
                intercalada.add(lista01.get(i));
            }
            // Se ainda houver elementos na lista02, adiciona o elemento atual
            if (i < tamanho02){
                intercalada.add(lista02.get(i));
            }
        }
        // Retorna a lista intercalada
        return intercalada;
    }
}