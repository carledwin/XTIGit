package br.com.xti.poo.classes.concretas;

import br.com.xti.poo.classes.abstratas.AnimalAbstrata;

//esta classe não pode ser extendida, herdada pois possui o modificador final
public final class CachorroConcretaFinal extends AnimalAbstrata{

	@Override
	public void fazerBarulho() {
		
	}

	//ver classe PitBull
}
