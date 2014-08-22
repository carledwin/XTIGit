package br.com.xti.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		//Coleção do tipo lista/List
		List<String> list = new ArrayList<>();
		list.add("Guaraná");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Açaí");
		list.add("Banana");
		
		System.out.println(list);
		
		//Collections é uma classe utilitaria criada para manipulação
		//de todos os tipos de coleções java
		
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
		//parametro 1 lista que receberá os novos elementos
		//parametro 2 elementos que serão adicionados a lista
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja");
		System.out.println(list);
		
		
		/*CONTAR FREQUENCIA DE UM ELEMENTO NA LISTA*/
		//parametro 1 lista
		//parametro 2 elementos que será buscado
		System.out.println(Collections.frequency(list, "Laranja"));

		/*BUSCAR UM CONJUNTO DE PALAVRAS NA LISTA*/
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		
		//verificar se na lista principal existem os elementos da lista2
		boolean d = Collections.disjoint(list, list2);
		
		System.out.println(d);
		
		/*BUSCAR O INDICE DE UM ELEMENTO NA COLEÇÃO*/
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guaraná");
		System.out.println(indice);
		
		/*PREENCHER TODA A COLEÇÃO COM UMA DETERMINADA PALAVRA*/
		Collections.fill(list, "Açaí");
		System.out.println(list);
		
		/*CRIAR COLEÇÃO QUE NÃO PODE SER MODIFICADA*/
		//coleção não modificavel, do tipo final
		//coleção constante
		Collection<String> listConstante = Collections.unmodifiableCollection(list);
		
		System.out.println(listConstante);
		
		//Collections.fill(listConstante, "Banana"); dará erro, pois a coleção é uma constante
		Collections.addAll(listConstante, "Maça", "Uva");
		
		System.out.println(listConstante);//dará uma exceção, pois a coleção é uma constante - java.lang.UnsupportedOperationException
		
	}

}
