package br.com.xti.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//Filas de atendimento
		
		//interface Queue
		
		//Regra FIFO First in First out
		//o primeiro a entrar é o primeiro a sair
		Queue<String> fila = new LinkedList<>();
		
		//lista de espera, os elementos adicionados serão adicionados no final da fila
		//fila de banco, correios
		fila.add("Ricardo"); //1
		fila.add("Marcio"); //2
		fila.add("Flavia"); //3
		fila.add("Sandra"); //4 adiciona o elemento ao final da fila 
		fila.offer("Carl");//5 oferece o elemento ao final da fila
		
		System.out.println(fila);

		/*metodos em queue*/
		//qual a proxima pessoa a ser atendida da fila
		//verifica quem é o proximo sem remover
		System.out.println(fila.peek());
		
		//remover o proximo elemento da fila (do inicio da fila)
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		//instanciar o Objeto LinkedList<>();
		/* outros metodos diponivies em LinkedList*/
		/*CAST*/
		LinkedList<String> f = (LinkedList) fila;
		
		//adicionar o elemento no inicio da fila
		f.addFirst("Cloves");
		System.out.println(fila);
		
		//adicionar o elemento no final da fila
		f.addLast("Hernandes");
		System.out.println(fila);
		
		
		
		//retorna qual é a primeira pessoa da fila sem remover
		System.out.println(f.peekFirst());
		//retorna qual é a ultima pessoa da fila sem remover 
		System.out.println(f.peekLast());
		
		//remove a primeira pessoa da fila e retorna o elemento removido
		System.out.println(f.pollFirst());
		
		//remove a ultima pessoa da fila e retorna o elemento removido
		System.out.println(f.pollLast());
		
		System.out.println(fila);
		
		
	}

}
