package Unidade02;

import java.util.LinkedList;
import java.util.Queue;

public class Pedido {
	
	private int nPedido;
	private String[] itens;
	private float valor;
	
	public Pedido(int nPedido, String[] itens, float valor) {
		this.nPedido = nPedido;
		this.itens = itens;
		this.valor = valor;
	}

	public static void main(String[] args) {
		// FIFO 
		
		Queue<Pedido> fila = new LinkedList<>();
		
		String[] itensTempPedido1 = {"XBurguer", "Refrigerante", "Batata"};
		Pedido pedido1 = new Pedido(123, itensTempPedido1, 30.45f);
		
		String[] itensTempPedido2 = {"Refrigerante", "Sorvete"};
		Pedido pedido2 = new Pedido(124, itensTempPedido2, 22.67f);
		
		String[] itensTempPedido3 = {"cachorro-Quente", "Refrigerante", "Batata", "Torta", "Sorvete", "Molho"};
		Pedido pedido3 = new Pedido(125, itensTempPedido3, 55.25f);
		
		
		fila.offer(pedido1);
		fila.offer(pedido2);
		fila.offer(pedido3);
		
		while(!fila.isEmpty()) {
			Pedido pedidoTemp = fila.poll();
			System.out.println("Nº Pedido: " + pedidoTemp.nPedido);
			System.out.println("Itens: ");
			for (String item : pedidoTemp.itens) {
				System.out.println("  " + item);		
				}			
			System.out.println("Valor " + pedidoTemp.valor);
			System.out.println("----------------------------------");
		}
	

	}

}
