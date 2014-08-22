package br.com.xti.colecoes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		String[] cores = {"verde", "amarelo", "azul", "branco", "azul", "amarelo", "verde"};
		
		//Aceita itens repetidos
		List<String> list = Arrays.asList(cores);
		
		System.out.println(list);
		
		
		//recebe um conjunto de strings
		//Set<String> set = new HashSet<>();
		Set<String> set = new HashSet<>(list);
		
		//mantem somente os registros unicos, ignorando os duplicados
		System.out.println(set);
		
				
		}

	}

