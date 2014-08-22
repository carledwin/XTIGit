package br.com.xti.poo.enumeracao;

public enum Medida {

	//somente uma das duas formas � permitida, sendo esta setando valor para a constante
	MM("Mil�metros"), CM("Centimetros"), MT("M�tros");

	//titulo das enumera��es
	public String titulo;
	
	Medida(String titulo) {
		this.titulo = titulo;
	}
	
	
	// ---> MM, CM, MT; esta forma de iniciar as constantes dar� erro
	//MM, CM, MT; //somente uma das duas formas � permitida, sendo esta sem setar valor para a constante
	//Medida() {} // caso este construtor n�o exista e exista um contrutor com parametros
	

	
	

	 
	
	
}
