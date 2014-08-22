package br.com.xti.poo.classes.abstratas;


//
public abstract class AnimalAbstrata {

	
	//as classes abstratas podem conter também, metodos implementados
	//metodos final não podem ser alterados por suas subclasses
	//impede que o metodo seja sobreescrito
	final void dormir(){
		System.out.println("Dormiu...");
	}
	
	//metodos por implementar
	//metodo sem corpo é um metodo abstrato
	//os metodos abstratos só podem existir em classes que não podem ser instanciada, 
	//ou seja uma classe abstrata 
	public abstract void fazerBarulho();
}
