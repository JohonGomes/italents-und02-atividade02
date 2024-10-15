package Unidade02.ExerciciosUnidade02.out.production.ExerciciosUnidade02.Filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        // Cria uma fila usando LinkedList
        Queue<String> fila = new LinkedList<>();
        // Cria um Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        // Loop principal do programa
        while (continuar) {
            // Exibe o menu de opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar pessoa à fila de espera");
            System.out.println("2 - Chamar próxima pessoa da fila de espera");
            System.out.println("3 - Exibir fila de espera");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            // Lê a opção do usuário
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            // Switch para tratar cada opção
            switch (opcao) {
                case 1:
                    // Adiciona uma pessoa à fila
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println("Pessoa adicionada à fila de espera.");
                    break;
                case 2:
                    // Chama a próxima pessoa da fila
                    if (!fila.isEmpty()) {
                        String proximaPessoa = fila.poll();
                        System.out.println("Próxima pessoa chamada da fila de espera: " + proximaPessoa);
                    } else {
                        System.out.println("Fila de espera está vazia.");
                    }
                    break;
                case 3:
                    // Exibe a fila de espera
                    if (!fila.isEmpty()) {
                        System.out.println("Fila de espera:");
                        for (String pessoa : fila) {
                            System.out.println(pessoa);
                        }
                    } else {
                        System.out.println("Fila de espera está vazia.");
                    }
                    break;
                case 4:
                    // Sai do programa
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}