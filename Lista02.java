package Unidade02;

import java.util.ArrayList;

public class Lista02 {

	public static void main(String[] args) {
		ArrayList<String> ListaComprasUpgrade = new ArrayList<>();
		ListaComprasUpgrade.add("Tomate");
		ListaComprasUpgrade.add("Queijo");
		ListaComprasUpgrade.add("Presunto");
		ListaComprasUpgrade.add("Pão");
		ListaComprasUpgrade.add("Alface");
		
		//Clonar uma lista anterior
		//Precisamos fazer a conversão (casting) da lista referência 
		
		ArrayList <String> ListaLanche = (ArrayList<String>) ListaComprasUpgrade.clone();
		
		System.out.println(ListaLanche);
		
		//Adicionando um novo item a lista.
		ListaLanche.add("Requeijão");
		
		System.out.println(ListaLanche);

		ListaComprasUpgrade.clear();
		System.out.println(ListaComprasUpgrade.isEmpty()); // isEmpty(),  verifica se a lista esta vazia.
		System.out.println(ListaComprasUpgrade.size());
		
		System.out.println("-----------------------------------------------------");
		// Usando o for para mostrar itens da lista
		
		boolean existe = false;
		for (String item : ListaLanche) {
			
			System.out.println(item);
			if(item == "Alface") {
				existe = true;
			}
		}
		
		if(existe) {
			System.out.println("Item encontrado");
		}else{
			System.out.println("Item não encontrado");
		}
		
		
	}

}
