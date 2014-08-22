package br.com.xti.poo.classes.modelos;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	public Carro() {
		
	}
	
	
	public Carro(String modelo,	int velocidadeMaxima,	double segundosZeroACem) {
		//this(modelo, velocidadeMaxima, segundosZeroACem, motor);
		
		//this(); //Construtor padrão
		
		//chamando o contrutor abaixo, mais completo
		this(modelo, velocidadeMaxima, segundosZeroACem, null);
	}
	
	public Carro(String modelo,	int velocidadeMaxima,	double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem =  segundosZeroACem;
		this.motor = motor;
	}
	

}
