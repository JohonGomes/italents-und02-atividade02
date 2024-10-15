package Unidade02;

import java.util.ArrayDeque;
import java.util.Deque;

public class Documentos {
	//Atributos dos documentos
	private String titulo;
	private int nPaginas;
	
	//Construtor
	public Documentos(String titulo, int nPaginas) {
		this.titulo = titulo;
		this.nPaginas = nPaginas;
	}

	public static void main(String[] args) {
		
		Deque<Documentos> pilha = new ArrayDeque<>();
	
		Documentos doc1 = new Documentos("Processo 121", 50);
		Documentos doc2 = new Documentos("Processo 122", 55);
		Documentos doc3 = new Documentos("Processo 123", 60);
		Documentos doc4 = new Documentos("Processo 124", 65);
		Documentos doc5 = new Documentos("Processo 125", 70);
		
		pilha.push(doc1);
		pilha.push(doc2);
		pilha.push(doc3);
		pilha.push(doc4);
		pilha.push(doc5);
		
		while(!pilha.isEmpty()) {
			Documentos tempDocumentos = pilha.pop(); // casting, conversão!
			System.out.println("Título: " + tempDocumentos.titulo);
			System.out.println("Nº de Páginas: " + tempDocumentos.nPaginas);
			System.out.println("-----------------------------------------");
		}
	
	}

}
