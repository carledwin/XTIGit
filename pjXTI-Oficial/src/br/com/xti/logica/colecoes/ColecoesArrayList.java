package br.com.xti.logica.colecoes;
import java.util.ArrayList;


public class ColecoesArrayList{
	
	public static void main(String[] args){
	
		//Array define a quantidade de elementos ao ser inicializado, 
		//não podendo ser alterado durante a execucao;

		// Deve especificar o tipo de dados que será armazenado
		//dentro da lista de array
		//A partir da versao 7 do java não é necessario declarar o 
		//tipo no construtor
		ArrayList<String> cores = new ArrayList<>();
		
		//semelhante a cores[0] = "Branco";
		cores.add("Branco");
		
		//outra forma de adicionar
		cores.add(1,"Vermelho");
		cores.add("Amarelo");
		cores.add("Azul");
		cores.add("Verde");
		
		System.out.println(cores.toString());
		
		//tamanho
		System.out.println("Size: \t" + cores.size());
		
		//elemento indice
		System.out.println("Elemento no Indice 2: \t" + cores.get(2));
		
		//verifica posicao do elemento
		System.out.println("Posicao da cor Verde: \t" + cores.indexOf("Verde"));
		
		//remove o elemento
		System.out.println("Remove o elemento: \t" + cores.remove("Branco"));		
		
		System.out.println(cores.toString());
		
		//verifica se o array contem o elemento
		System.out.println("Verifica se o array contem o elemento cor Branco: \t" + (cores.contains("Branco") == true ? "Contem" : "Nao contem"));
		System.out.println("Verifica se o array contem o elemento cor Vermelho: \t" + (cores.contains("Vermelho") == true ? "Contem" : "Nao contem"));
		
		
	}

}