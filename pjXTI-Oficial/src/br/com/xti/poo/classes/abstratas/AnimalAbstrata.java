package br.com.xti.poo.classes.abstratas;


//
public abstract class AnimalAbstrata {

	
	//as classes abstratas podem conter tamb�m, metodos implementados
	//metodos final n�o podem ser alterados por suas subclasses
	//impede que o metodo seja sobreescrito
	final void dormir(){
		System.out.println("Dormiu...");
	}
	
	//metodos por implementar
	//metodo sem corpo � um metodo abstrato
	//os metodos abstratos s� podem existir em classes que n�o podem ser instanciada, 
	//ou seja uma classe abstrata 
	public abstract void fazerBarulho();
}
