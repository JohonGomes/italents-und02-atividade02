package Unidade02;

import java.util.ArrayList;

public class Lista01 {

	public static void main(String[] args) {
		//Criando uma lista
		//Arrays e Listas são coisas diferentes no Java
		
		String[] ListaCompras = new String[3];
		
		ListaCompras[0] = "Banana";
		ListaCompras[1] = "Tomate";
		ListaCompras[2] = "Feijão";
		
		//Array List
		//Precisa tipar a Lista <String>
		//Não precisa definir tamanho, cuidado para não alocar muita memória do PC. 
		
		ArrayList<String> ListaComprasUpgrade = new ArrayList<>();
		ListaComprasUpgrade.add("Macarrão");
		ListaComprasUpgrade.add("Queijo");
		ListaComprasUpgrade.add("Presunto");
		ListaComprasUpgrade.add("Pão");
		
		//visualizando itens na lista
		System.out.println(ListaCompras[1]);
		System.out.println(ListaComprasUpgrade.get(2)); // precisa usar o get para buscar itens especificos
		
		//conta os itens na lista
		System.out.println(ListaCompras.length); //lenght, traz o tamanho da lista.
		System.out.println(ListaComprasUpgrade.size()); //size, traz o tamanho da lista
		
		//busca na lista , retorna true ou false.
		System.out.println(ListaComprasUpgrade.contains("Presunto")); // contains, procura um determinado item na lista (ele é case sensitive)!
		
		//Removendo um item da lista
		
		ListaComprasUpgrade.remove("Presunto");// remove, pode passar o objeto , ou seja, o nome.
		
		ListaComprasUpgrade.remove(3); // remove, pode passar o index, ou seja, o número do item da lista.
		
		// Limpando a lista completamente;
		ListaComprasUpgrade.clear(); // clear, remove todos os elementos da lista de uma so vez.
	}

}
