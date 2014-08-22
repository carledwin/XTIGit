package br.com.xti.poo.classes;

import br.com.xti.poo.classes.modelos.Cachorro;

public class CachorroTest {

	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();
		
		pitbull.raca = "Pit Bull";
		pitbull.tamanho = 40;
		pitbull.latir();
		
		Cachorro viralata = new Cachorro();
		
		viralata.raca = "Vira - Lata";
		viralata.tamanho = 30;
		viralata.latir();
		
	}

}
