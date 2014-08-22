package br.com.xti.logica.fluxosrepeticao;
import java.util.ArrayList;
import java.util.Scanner;


public class FluxoRepeticaoWhile{

	public static void main(String[] args){
	
	//while é executado somente se for verdade
	
	//ex. avaliar se um numero é maior ou menor que outro
	
	int i = 0;
	
	//cuido com loop infinito 
	// o numero deve ser incrementado
	//executado 0 -n
	while( i < 2){
		System.out.println(i);
		i++;
	}
	
	/*semelhante a 
		for(int i = 0 ; i < 2; i++){
		System.out.println(i);
		}
	*/
	
	//do while é executado pelo menos uma vez
	//executado 1 -n
	int x = 3;
	do{
		System.out.println(x);
		x++;
	}while(x < 2);
	
	System.out.println("\n \n \n");
	
	ArrayList<String> produtos = new ArrayList<>();
	
	//Captura 
	Scanner s = new Scanner(System.in);
	
	System.out.println("Liste seus produtos e para sair digite Fim: \n \n \n ");
	
	
	String produto;
	
	
	
	while(!"fim".equals(produto = s.nextLine())){
		
		produtos.add(produto);
	}
	
	System.out.println("\n\n\n\n ******************  Os item da lista de produtos sao: ***************\n\n\n\n\n" + produtos.toString());
	
	
	}
	
	
	

}