package Unidade02.ExerciciosUnidade02.out.production.ExerciciosUnidade02.Maps;

import java.util.HashMap;
import java.util.Map;

public class exe08 {
    public static void main(String[] args) {
        // Define a frase de exemplo
        String frase = "Esta é uma frase de exemplo, uma frase simples para demonstração.";

        // Remove pontuações e converte para minúsculas
        frase = frase.toLowerCase().replaceAll("[^a-zA-Z ]", "");

        // Divide a frase em palavras
        String[] palavras = frase.split(" ");

        // Cria um HashMap para armazenar a frequência das palavras
        HashMap<String, Integer> frequenciaPalavras = new HashMap<>();

        // Conta a frequência das palavras
        for (String palavra : palavras) {
            if (frequenciaPalavras.containsKey(palavra)) {
                // Se a palavra já existe, incrementa a contagem
                frequenciaPalavras.put(palavra, frequenciaPalavras.get(palavra) + 1);
            } else {
                // Se é uma nova palavra, inicia a contagem com 1
                frequenciaPalavras.put(palavra, 1);
            }
        }

        // Exibe a frequência das palavras
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + " - Frequência: " + entry.getValue());
        }
    }
}