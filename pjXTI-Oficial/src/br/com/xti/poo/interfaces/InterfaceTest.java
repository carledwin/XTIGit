package br.com.xti.poo.interfaces;

import br.com.xti.poo.heranca.multipla.CuboHerancaMultipla;
import br.com.xti.poo.operacoesmatematicas.VolumeCalculavel;

public class InterfaceTest {

	//usado em polimorfismo
	public static void area(AreaCalculavel areaC){
		System.out.println(areaC.calculaArea());
	}
	
	//usado em polimorfismo
		public static void volume(VolumeCalculavel volumeC){
			System.out.println(volumeC.calculaVolume());
		}
	
	public static void main(String[] args) {
		
		//e do Tipo AreaCalculavel
		//Quadrado quadrado = new Quadrado(2);  
		
		//pode receber quadrado que é do seu tipo
		//AreaCalculavel area = quadrado;
		
		//Quadrado quadrado = new Quadrado(2); ou
		area(new Quadrado(2));
		
		//CuboHerancaMultipla cubo = new CuboHerancaMultipla(2); ou
		volume(new CuboHerancaMultipla(2));
		
	}
}
