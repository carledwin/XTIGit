package br.com.xti.logica.array;

import java.util.Random;

public class ArrayMultiDimensional{

	public static void main(String[] args){
	
		//Array com uma dimensao
		String[] umaDimensao = {"Ricardo", "Sandra"};
		
		//indice do elemento na posicao 0
		//umaDimensao[0]
		
		//quantos elementos tem o array
		//umaDimensao.length
		
		//Array com duas dimensoes
		String[][] duasDimensoes = {
			{"Ricardo", "M", "DF"},
			{"Sandra", "F", "MG"}
		};
		
		//acessando array com duas dimensoes
		//duasDimensoes[0][0]
		//duasDimensoes[1][0]
		
		duasDimensoes[1][0] = "SANDRA";
		
		System.out.println(duasDimensoes.length);
		System.out.println(duasDimensoes[0].length);
		System.out.println(duasDimensoes[0][0]);
		System.out.println(duasDimensoes[1][0]);
		
		System.out.println("\n\n\n\n\n\n\n");
		
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei",};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		//permite numero aleatorio
		/*
		Random rFace = new Random();
		Random rNipe = new Random();
		*/
		//r.nextInt() ou podendo informar o numero maximo
		//r.nextInt(10)
		
		/*int indiceFace = rFace.nextInt(faces.length);
		String face = faces[indiceFace];
		
		int indiceNipe = rNipe.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];
		*/
		
		/*String face = faces[rFace.nextInt(faces.length)];
		String nipe = nipes[rNipe.nextInt(nipes.length)];
		*/
		
		Random r = new Random();
		
		String face = faces[r.nextInt(faces.length)];
		String nipe = nipes[r.nextInt(nipes.length)];
		
		//String carta = "Carta >>:  " + faces[0] + " de " + nipes[0];
		String carta = "Carta >>:  " + face + " de " + nipe;
	
		System.out.println(carta);
	
		
	
	
	
	}
}
