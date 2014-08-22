package br.com.xti.logica.array;

import java.util.Arrays;

public class ArraySimples{

	public static void main(String[] args){
	
		/* 	String pais = "Brasil";
			String pais2 = "Rússia";
			String pais3 = "India";
			String pais4 = "China";
		*/
		
		//Formas de inicializar um array
		
		String[] paises = {"Brasil", "Russia", "India", "China"};
		
		//inicialização sempre requer o valor de posicoes;
		int[] impares = new int[5];
		
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		System.out.println(paises[0]);
		
		paises[0] = "BRAZIL";
		
		System.out.println(paises[0]);
		
		//Exception ArrayIndexOutOfBoundsException posicao nao encontrada
		//System.out.println(impares[7]);
		System.out.println("Posicao 4 do Array de Impares: \t" + impares[4]);
		//Descobrir o tamanho do array
		System.out.println("Tamanho do Array de paises: \t" + paises.length);
		
		//java.util.Arrays para exibir todos os elementos do array
		System.out.println(Arrays.toString(paises));
		
		//verificar se existe um elemento - Devolve a posicao do elemento no array
		int posicao = Arrays.binarySearch(paises, "Russia");
		
		System.out.println("Busca o elemento Russia no array paises: \t" + posicao);
		
		System.out.println("Array sem ordenacao: \t" + Arrays.toString(paises));
		
		//Ordenar o array com sort (array, ordenar de, ate)
		Arrays.sort(paises, 0, paises.length);
		
		System.out.println("Array ordenado com sort: \t" + Arrays.toString(paises));
		
		Double[] valores = {12.35, 3456.3456};
		
		System.out.println("Acessar o elemento do array e seu metodo: \t" + valores[0].doubleValue());
		
	}
	
}