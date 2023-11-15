package com.igor.cursojava.aula06EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer01Fila {

	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<String>();
		int op = 0;
		String cliente = null;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("\n1- Adicionar Cliente na Fila");
		System.out.println("\n2- Listar todos os Clientes");
		System.out.println("\n3- Retirar Cliente da Fila");
		System.out.println("\n0- Sair");
		op = scan.nextInt();
		
		switch(op) {
		case 1:
			scan.nextLine();
			System.out.println("\nDigite o nome do cliente para adicionar:");
			cliente = scan.nextLine();
			if(cliente.isEmpty()) {
				System.out.println("\nO nome não foi adicionado na fila...");
			}else {
				
			
			fila.add(cliente);
			System.out.println("\nCliente " + cliente + " foi adicionado!");
			}
			break;
		case 2:
			
			scan.nextLine();
			System.out.println("\nLista de clientes da fila..." + fila);
			for(Iterator<String> it = fila.iterator();it.hasNext();) {
				System.out.println(it.next());
			}
			break;
		
		case 3:
			scan.nextLine();
			if(fila.isEmpty() == true) {
				System.out.println("A fila está vazia...");
			}else {
				System.out.printf("\nO cliente %s foi chamado(a)!", fila.poll());
				System.out.println("\nFila: ");
				for(Iterator<String> it = fila.iterator(); it.hasNext();) {
					System.out.println(it.next());
				}
				System.out.println();
			}
			break;
		
		case 0:
			System.out.println("\nPrograma finalizado...");
			break;
			default:
				System.out.println("\nOpção inválida!!!");
		}
	
	}while(op !=0);

}

}