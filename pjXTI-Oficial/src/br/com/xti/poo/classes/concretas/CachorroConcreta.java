package br.com.xti.poo.classes.concretas;

import br.com.xti.poo.classes.abstratas.AnimalAbstrata;

public class CachorroConcreta extends AnimalAbstrata {

	
	
	//metodos final não podem ser alterados por outras classes
	//impede que o metodo seja sobreescrito
	void dormir(){}
	
	@Override
	public void fazerBarulho() {
		
	}

}
