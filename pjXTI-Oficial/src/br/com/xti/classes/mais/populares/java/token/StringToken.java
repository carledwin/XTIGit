package br.com.xti.classes.mais.populares.java.token;

public class StringToken {

	public static void main(String[] args) {
		
		String s = " XHTML; CSS; JavaScript; jQuery; JAVA";
		
		String s2 = "Venha trabalhar na XTI.";
		
		//quebrar a string com o delimitador, que recebe uma expressão regular, neste caso quebrar 
		//o token pelo delimitador (;) que encontrar, será retornado um array de strings
		//contendo todos os tokens
		String[] tokens = s.split(";");
		
		String[] palavras = s2.split(" ");
		
		//quantidade de elementos
		System.out.println(tokens.length + "\n ****************-- QUANTIDADE --****************** \n");
		
		System.out.println(tokens.length + " : tokens.");
		
		System.out.println("\n ****************-- DELIMITADOR ; --****************** \n");
		
		for (String token : tokens) {
			
			System.out.println(token);
		}
		
		System.out.println("\n ****************-- DELIMITADOR \" \" --****************** \n");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
