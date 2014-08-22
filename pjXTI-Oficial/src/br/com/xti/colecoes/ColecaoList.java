package br.com.xti.colecoes;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		
		//interface List que recebe objeto String com ArrayList para implementar List
		//List tamb�m chamada de Sequencia
		//Cole��o ordenada que pode conter elementos duplicados
		//possui todos os metodos da Collection
		//e tamb�m alguns metodos para manipular indices
		//trabalha de forma semelhante a array
		List<String> list = new ArrayList();
		list.add("Futebol");
		list.add("Basquete");
		list.add("T�nis");
		list.add("Volei");
		list.add("Nata��o");
		list.add("Hockey");
		list.add("Boxe");
		list.add("Futebol");
		
		System.out.println(list);

		//metodos para manipular os dados como se fosse um array
		for(int i=0; i<list.size(); i++){
			//captura o lemento
			String letra = list.get(i);
			
			//seta um valor para o elemento naquela posi��o
			list.set(i, letra.toUpperCase());//alterando para MAIUSCULO
		}
		System.out.println(list);
		
		
		/*LOCALIZAR UM ELEMENTO NA LISTAGEM*/
		//tras a localiza��o-posi��o do elemento na lista
		System.out.println(list.indexOf("BOXE"));
		
		/*RETORNAR UMA SUBLISTAGEM DE ELEMENTOS*/
		//captura os elementos no intevalo passado como parametro
		System.out.println(list.subList(2,4));
		System.out.println(list.subList(1,6));
		
		/*REMOVER SUBLISTAS DA LISTA PRINCIPAL*/
		System.out.println(list.subList(2, 4));
		//remove os elementos da sublista da lista principal
		list.subList(2, 4).clear();
		System.out.println(list);
		
		
	}

}
