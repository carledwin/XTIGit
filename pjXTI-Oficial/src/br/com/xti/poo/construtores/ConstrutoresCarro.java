package br.com.xti.poo.construtores;

public class ConstrutoresCarro {

	
	String modelo; 
	int velocidadeMaxima;  
	double segundosZeroACem;
	
	//Blocos de comandos que podem ser utilizados para inicializar os objetos
	//Este m�todo � criado automaticamente caso n�o seja criado
	//representa��o em UML <<create>> ConstrutoresCarro()
	//Construtores n�o s�o m�todos, pois n�o retornam nada
	//Todos os construtores devem possuir o mesmo nome da classe
	//S�o iniciados com letra MAIUSCULA, diferente de m�todos que s�o com minusculas
	/*public ConstrutoresCarro() {
		
	}*/
	//Caso exista um construtor com parametros definido a JVM n�o definir� automaticamente o 
	//construtor acima, sendo necess�rio declara-lo manualmente se quizer chama-lo
	
	public ConstrutoresCarro() {
		
	}
	
	
	//inicializar o construtor/ ou seja as vari�veis deste objeto que ser� criado pelo Construtor
	public ConstrutoresCarro(String modelo, int velocidadeMaxima, double segundosZeroACem){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	public static void main(String[] args) {
		

	}

}
