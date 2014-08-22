package br.com.xti.generic;

import java.util.ArrayList;

//tornar uma classe do tipo generico <E>
//E - qualquer elemento
public class Generico <E>{
	
	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}

	public E getElemento(){
		return elemento;
	}
	
	//caracteres coringas
	//são importantes, que permitem especificar parametros que atuam como
	//supertipos ou subtipos parametrizados
	
	//lista de qualquer ? tipo de Number, 
	//ou seja uma lista de qualquer tipo que estenda Number
	//ou o proprio Number
	//este metodos suporta então uma lista de Double, Float, Number...
	//aceita elementos filhos de number
	public double soma(ArrayList<? extends Number> lista){
		double total = 0;
		for (Number number : lista) {
			total += number.doubleValue();
		}
		return total;
	}

	//especificar elementos pais de um tipo,
	//ou seja, não se quer aceitar filhos de Number,
	//somente pais de Number
	//neste caso dará exceção, pois não pode converter Pais de Number em Number
	public double soma1(ArrayList<? super Number> lista){
		double total = 0;
		for (Number number : lista) {
			total += number.doubleValue();
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		//é obrigatorio informar o tipo de dados que o elemento terá
		Generico<String> g = new Generico<>();
		
		g.setElemento("Lago Paranoá");
		
		//em tempo de compilação a JVM irá analisar
		//e permitir a utilização somente deste tipo para o elemento
		//não permite outro tipo por segurança
		//g.setElemento(123456);
		
		//Não é mais necessario realizar CAST para acessar os metodos do tipo elemento
		//String e = (String) g.getElemento().toString();
		
		g.getElemento().toUpperCase();
		
		System.out.println(g.getElemento());
		
	}
}
