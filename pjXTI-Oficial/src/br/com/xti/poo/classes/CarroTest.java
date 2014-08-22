package br.com.xti.poo.classes;

import br.com.xti.poo.classes.modelos.Carro;
import br.com.xti.poo.classes.modelos.Motor;
import br.com.xti.poo.construtores.ConstrutoresCarro;

public class CarroTest {

	public static void main(String[] args) {
		
		//Construtor sem inicialização de variaveis
		//Construtor sem parametros
		ConstrutoresCarro ferrari = new ConstrutoresCarro();
		
		ferrari.modelo = "Ferrari";
		ferrari.segundosZeroACem = 7;
		ferrari.velocidadeMaxima = 300;
		System.out.println(ferrari.modelo);
		System.out.println(ferrari.segundosZeroACem);
		System.out.println(ferrari.velocidadeMaxima);
		
		//Construtor com inicialização de variaveis
		//Construtor com parametros
		ConstrutoresCarro audi = new ConstrutoresCarro("Audi", 280, 10);

		System.out.println("***********************************************************************");
		
		System.out.println(audi.modelo);
		System.out.println(audi.segundosZeroACem);
		System.out.println(audi.velocidadeMaxima);
		
		System.out.println("***********************************************************************");
		
		Motor motor = new Motor("Esportivo", 1500);
		Carro fusca = new Carro("Fusca", 180, 30, motor);
		
		System.out.println("Modelo:         " + fusca.modelo);
		System.out.println("Zero a Cem:     " + fusca.segundosZeroACem);
		System.out.println("Velocidade Máx: " + fusca.velocidadeMaxima);
		System.out.println("Tipo:           " + fusca.motor.tipo);
		System.out.println("Potência:       " + fusca.motor.potencia);
		
		System.out.println("***********************************************************************");
		
		Carro monza = new Carro("Monza", 220, 25, new Motor("Sedan", 2000));
		
		System.out.println("Modelo:         " + monza.modelo);
		System.out.println("Zero a Cem:     " + monza.segundosZeroACem);
		System.out.println("Velocidade Máx: " + monza.velocidadeMaxima);
		System.out.println("Tipo:           " + monza.motor.tipo);
		System.out.println("Potência:       " + monza.motor.potencia);
		
	}

}

