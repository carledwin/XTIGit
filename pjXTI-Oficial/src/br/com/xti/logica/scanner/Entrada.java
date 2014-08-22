package br.com.xti.logica.scanner;

import java.util.Scanner;

public class Entrada{

	public static void main(String[] args){
		
		
		
		//Chamada do Programa
		//System.out.println(args[0]);
		
		//Interagindo com o Usuário Trabalha com entradas do sistema
		//método nextLine que retorna uma String 
		System.out.println("Qual o seu nome?");
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		
		System.out.println("Bem vindo: " + nome + "!");
		
		
	}

}