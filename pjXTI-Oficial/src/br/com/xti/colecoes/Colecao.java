package br.com.xti.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		/*
		 Collection
	Interface Set
	Trabalha com registros sem duplicidade
	classes que a implementam: TreeSet, LinkedHashSet e HashSet

	Interface List
	Aceita registros duplicados ordenados
	classes que a implementam: Vector, ArrayList e LinkedList

	Interface Queue
	Representa uma fila de espera, registros incluidos no final da fila e removidos do inicio
	classes que a implementam: PriorityQueue e LinkedList

Map - Chave e Valor
Interface Map 
Chave e valor, como um dicionario
classes que a implementam: Hashtable, LinkedHashMap, HashMap, Sorted Map(TreeMap)

Classes utilitarias

	Arrays - para manipulação de Arrays
	Collections - para manipulação de Coleções 
		 * */
		
		
		Collection<String> c = new ArrayList<>();
		
		c.add("A");
		c.add("E");
		c.add("I");
		
		
		//metodos basicos das coleções
		System.out.println(c.toString());//imprime
		System.out.println(c.isEmpty()); //verifica se a coleção está vazia
		System.out.println(c.contains("A")); //verifica se o elemento existe dentro da coleção
		System.out.println(c.remove("A")); //remove o elemento da coleção
		System.out.println(c.toString());//imprime
		
		//metodos para trabalhar com grupos de elementos
		
		/*grupos*/
		Collection<String> c2 = Arrays.asList("a","u");//transforma um array em coleção
		
		/*ADICIONAR*/
		//adiciona todos os elementos na primeira coleção
		c.addAll(c2);
		System.out.println(c.toString());//imprime
		//verifica se existem todos os elementos da coleção 2 na coleção 1
		c.containsAll(c2);
		System.out.println(c.toString());//imprime
		
		//percorrer todos os elementos da coleção - utilizando um foreach
		System.out.println("foreach");
		for (String string : c) {
			System.out.println(string);
		}
		
		/*REMOVER*/
		//remover todos os elementos da coleção 2 que existem na coleção 1
		c.removeAll(c2);

		/*CONVERÇÃO */
		//(converter)transformar de uma coleção em um Array
		c.toArray();//não possui parametros
		
		//(converter)transformar de uma coleção em um Array
		//neste caso é definido no array de String a quantidade de elementos, 
		//passando a quantidade total de elementos da coleção
		String[] s = c.toArray(new String[c.size()]);///recebe um parametro que define o tipo de array
	
		//exibe o array, convertendo-a em string
		//utilizando a classe utilitária Arrays 
		System.out.println(Arrays.toString(s));
		
		/*LIMPAR*/
		c.clear();
		System.out.println(c.toString());//imprime
	}

}
