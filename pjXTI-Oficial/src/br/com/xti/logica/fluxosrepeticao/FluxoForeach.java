package br.com.xti.logica.fluxosrepeticao;
import java.util.ArrayList;

public class FluxoForeach{

	public static void main(String[] args){
	
		/*for*/
		int[] pares = {2,4,6,8};
		for(int i = 0; i < pares.length; i++){
			int par = pares[i];
			System.out.println("Com for: \t" + par);
		}
		
		System.out.print("\n \n \n");
		
		/*forEach*/ 
		//for aprimorado percorre elementos para frente somente
		//: retorna o elemento que ele deve percorrer
		for(int par : pares){
			System.out.println("Com forEach: \t" + par);
		}
	
	System.out.print("\n \n \n");
	
	ArrayList<Integer> listNumero = new ArrayList<>();
	
	for(int i = 0; i <= 10; i++){
		listNumero.add(i);
		System.out.println("Adicionou i a lista: \t" + i);
	}
	
	System.out.print("\n \n \n");
	
	System.out.print("***** Lendo toda a lista de uma vez ******");
	
	System.out.print("\n \n");
	
	listNumero.set(4,6);
	
	System.out.print(listNumero.toString());
	
	System.out.print("\n \n \n");
	
	System.out.print("***** Leitura dos valores da lista com o ForEach ******");
	
	System.out.print("\n \n \n");
	
		/*ForEach*/
		for(Integer numero : listNumero){
				System.out.println("Leu um item da lista: \t" + numero);
		}
	
	
	/*
	String Masculino 
	char M ou F
	Integer 123456
	Boolean true ou false
	Double 4.75
	Date 25/12/2014
	
	< menor
	> maior
	
	*/
	
	}
	
	

}