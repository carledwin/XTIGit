package br.com.compator;

import java.util.Comparator;

import br.com.model.Transferencia;

public class OrdenadorAsc implements Comparator<Transferencia> {

	@Override
	public int compare(Transferencia o1, Transferencia o2) {
		
		if(o1.getId() < o1.getId()){
			return -1;
		}

		if(o1.getId() > o1.getId()){
			return 1;
		}
		return 0;
	}
	
}
