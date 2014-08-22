package br.com.xti.poo.classes.superr;

public class AnimalSuperClasse {

	double peso;
	String comida;
	
	//atributo visivel somente para a SUPER classe
	private int serial;
	
	//atributo visivel somente para SUB classes
	protected int serialParaSubclasses;
	
	//
	
	
	/*Quando este construtor padrão não está mais implementado dará erro nas subclasses
	Quando for extender esta super classe em uma subclasse será necessário
	na sub classe dentro do seu construtor se referenciar a SUPER classe 
	atraves da chamada ao construtor  da super(Animal) classe "" informando os parametros da SUBCLASSE(Cachorro)*/
	/*public AnimalSuperClasse() {
		//o construtor pode chamar outro
		//this(peso, comida);
		this(0,null);
	}
	*/
	
	public AnimalSuperClasse(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir(){System.out.println("Dormiu");}
	
	//metodo tradicional
	void fazerBarulho(){System.out.println("Fazer Barulho!");}
}
