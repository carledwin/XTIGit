package br.com.xti.poo.construtores;

public class ConstrutoresCarro {

	
	String modelo; 
	int velocidadeMaxima;  
	double segundosZeroACem;
	
	//Blocos de comandos que podem ser utilizados para inicializar os objetos
	//Este método é criado automaticamente caso não seja criado
	//representação em UML <<create>> ConstrutoresCarro()
	//Construtores não são métodos, pois não retornam nada
	//Todos os construtores devem possuir o mesmo nome da classe
	//São iniciados com letra MAIUSCULA, diferente de métodos que são com minusculas
	/*public ConstrutoresCarro() {
		
	}*/
	//Caso exista um construtor com parametros definido a JVM não definirá automaticamente o 
	//construtor acima, sendo necessário declara-lo manualmente se quizer chama-lo
	
	public ConstrutoresCarro() {
		
	}
	
	
	//inicializar o construtor/ ou seja as variáveis deste objeto que será criado pelo Construtor
	public ConstrutoresCarro(String modelo, int velocidadeMaxima, double segundosZeroACem){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	public static void main(String[] args) {
		

	}

}
