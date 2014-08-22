package br.com.xti.logica.operadores;
public class OperadorLogic{

	public static void main(String[] args){
	
		int x = 6;
		//true se as duas forem verdadeiras
		System.out.println("X eh maior ou igual a 1 E menor ou igual a 10: \t" + ((x >=1 ) && (x <=10)));
		
		//true se as duas forem verdadeiras
		System.out.println("X eh maior ou igual a 1 E menor ou igual a 5: \t" + ((x >=1 ) && (x <=5)));
		
		//true se uma das duas for verdadeira
		System.out.println("X eh maior ou igual a 1 OU menor ou igual a 10: \t" + ((x >=1 ) || (x <=10)));
		
		//true se for verdadeira
		System.out.println("X eh maior que 1: \t" + (x > 1 ));
		
		//true se não for verdadeira
		System.out.println("X NAO eh maior que 1: \t" + !(x > 1 ));
	}

}
