package br.com.xti.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		//Cole��o do tipo lista/List
		List<String> list = new ArrayList<>();
		list.add("Guaran�");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("A�a�");
		list.add("Banana");
		
		System.out.println(list);
		
		//Collections � uma classe utilitaria criada para manipula��o
		//de todos os tipos de cole��es java
		
		//metodos encontrados somente na classe utilitaria Collections
		
		/*ORDERNAR*/
		Collections.sort(list);//ordenar em ordem alfabetica os dados dentro de uma lista
		System.out.println(list);
		
		/*INVERTER*/
		Collections.reverse(list);//inveter a ordem da lista
		System.out.println(list);
		
		/*EMBARALHAR, COLOCAR OS REGISTROS EM ORDEM ALEATORIA*/
		Collections.shuffle(list);
		System.out.println(list);
		
		/*ADICIONAR ELEMENTOS EXTRAS */
		//parametro 1 lista que receber� os novos elementos
		//parametro 2 elementos que ser�o adicionados a lista
		Collections.addAll(list, "Cupua�u", "Laranja", "Laranja");
		System.out.println(list);
		
		
		/*CONTAR FREQUENCIA DE UM ELEMENTO NA LISTA*/
		//parametro 1 lista
		//parametro 2 elementos que ser� buscado
		System.out.println(Collections.frequency(list, "Laranja"));

		/*BUSCAR UM CONJUNTO DE PALAVRAS NA LISTA*/
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		
		//verificar se na lista principal existem os elementos da lista2
		boolean d = Collections.disjoint(list, list2);
		
		System.out.println(d);
		
		/*BUSCAR O INDICE DE UM ELEMENTO NA COLE��O*/
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guaran�");
		System.out.println(indice);
		
		/*PREENCHER TODA A COLE��O COM UMA DETERMINADA PALAVRA*/
		Collections.fill(list, "A�a�");
		System.out.println(list);
		
		/*CRIAR COLE��O QUE N�O PODE SER MODIFICADA*/
		//cole��o n�o modificavel, do tipo final
		//cole��o constante
		Collection<String> listConstante = Collections.unmodifiableCollection(list);
		
		System.out.println(listConstante);
		
		//Collections.fill(listConstante, "Banana"); dar� erro, pois a cole��o � uma constante
		Collections.addAll(listConstante, "Ma�a", "Uva");
		
		System.out.println(listConstante);//dar� uma exce��o, pois a cole��o � uma constante - java.lang.UnsupportedOperationException
		
	}

}
