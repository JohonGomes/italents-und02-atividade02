package Unidade02;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();

		// adiciona no mapa a chave e o valor (key, value)
		mapa.put("Johon", 37);
		mapa.put("Frderico", 06);
		mapa.put("Eros", 3);
		mapa.put("Zak", 10);

		System.out.println(mapa);
		System.out.println("----------------");

		// retorna o valor que a chave "Johon" tem!
		System.out.println(mapa.get("Johon"));

		// substitui o valor da chave passada, se não encontrar nada acontece
		mapa.replace("Johon", 30);
		System.out.println(mapa.get("Johon"));

		// Adiciona se NÃO EXISTIR.
		mapa.putIfAbsent("Romeu", 02);
		System.out.println(mapa);

		// remove do mapa a chave passada.
		mapa.remove("Romeu");
		System.out.println(mapa);

		// faz a busca no mapa pela chave
		if (mapa.containsKey("Johon")) {
			System.out.println("Existe a chave passada!");
		} else {
			System.out.println("Não existe a chave passada!");
		}

		// faz a busca no mapa pelo valor
		if (mapa.containsValue(15)) {
			System.out.println("Existe a chave passada!");
		} else {
			System.out.println("Não existe a chave passada!");
		}
		
		// retorna true ou false em relação ao mapa
		if(mapa.isEmpty()) {
			System.out.println("O Mapa está vazio");
		}
		
		// laço para verificar todo o mapa.
		for (String nome : mapa.keySet()) {
			System.out.println(nome);
		}
		
		// exibe o tamanho do mapa.
		int tamanho = mapa.size();
		System.out.println("O tamanho do mapa é : " + tamanho);

	}

}
