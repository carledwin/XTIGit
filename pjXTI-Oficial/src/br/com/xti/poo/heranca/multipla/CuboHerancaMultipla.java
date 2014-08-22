package br.com.xti.poo.heranca.multipla;

import br.com.xti.poo.interfaces.AreaCalculavel;
import br.com.xti.poo.operacoesmatematicas.VolumeCalculavel;

public class CuboHerancaMultipla implements VolumeCalculavel, AreaCalculavel {

	double lado;
	
	public CuboHerancaMultipla(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaVolume() {
		return 6 * lado * lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado * lado;
	}

}
