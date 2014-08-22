package br.com.xti.logica.desafios;
public class DesafioFibonacci{
	
	public static void main(String[] args){
	
		
		int anterior = 1;
		int proximo = 0;
		
		while(proximo < 1500){
			
			System.out.print(proximo + ", ");
			
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			
		}
		
	
	}
}