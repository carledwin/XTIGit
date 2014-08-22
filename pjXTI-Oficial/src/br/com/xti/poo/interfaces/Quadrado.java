package br.com.xti.poo.interfaces;


// ao utilizar uma interface, e necessario implementar todos os seus metodos
public class Quadrado implements AreaCalculavel {

	double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	
	@Override
	public double calculaArea() {
		//calcular a area do quadrado
		return lado * lado;
	}

}
