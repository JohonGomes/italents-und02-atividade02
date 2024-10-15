package ExerciciosPilhas;

import java.util.Stack;

public class exe04 {
    public static void main(String[] args) {
        // Define quatro expressões para testar
        String expressao1 = "(2 + 3) * (4 - 1)"; // Expressão balanceada
        String expressao2 = "((2 + 3) * (4 - 1)"; // Expressão desbalanceada
        String expressao3 = ")(2 + 3)("; // Expressão desbalanceada
        String expressao4 = "2 + 3 - 4 * 1"; // Expressão sem parênteses

        // Verifica e imprime o resultado do balanceamento para cada expressão
        System.out.println("A expressão 1 está balanceada? " + verificarBalanceamento(expressao1));
        System.out.println("A expressão 2 está balanceada? " + verificarBalanceamento(expressao2));
        System.out.println("A expressão 3 está balanceada? " + verificarBalanceamento(expressao3));
        System.out.println("A expressão 4 está balanceada? " + verificarBalanceamento(expressao4));
    }

    public static boolean verificarBalanceamento(String expressao) {
        // Cria uma pilha para armazenar os parênteses abertos
        Stack<Character> pilha = new Stack<>();

        // Percorre cada caractere da expressão
        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {
                // Se encontrar um parêntese aberto, empilha
                pilha.push(caractere);
            } else if (caractere == ')') {
                // Se encontrar um parêntese fechado...
                if (pilha.isEmpty() || pilha.peek() != '(') {
                    // ...e a pilha estiver vazia ou o topo não for um parêntese aberto, a expressão está desbalanceada
                    return false;
                } else {
                    // ...e houver um parêntese aberto correspondente, desempilha
                    pilha.pop();
                }
            }
        }
        // A expressão está balanceada se a pilha estiver vazia no final
        return pilha.isEmpty();
    }
}