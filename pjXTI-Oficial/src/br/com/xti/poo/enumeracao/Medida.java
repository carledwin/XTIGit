package br.com.xti.poo.enumeracao;

public enum Medida {

	//somente uma das duas formas é permitida, sendo esta setando valor para a constante
	MM("Milímetros"), CM("Centimetros"), MT("Mêtros");

	//titulo das enumerações
	public String titulo;
	
	Medida(String titulo) {
		this.titulo = titulo;
	}
	
	
	// ---> MM, CM, MT; esta forma de iniciar as constantes dará erro
	//MM, CM, MT; //somente uma das duas formas é permitida, sendo esta sem setar valor para a constante
	//Medida() {} // caso este construtor não exista e exista um contrutor com parametros
	

	
	

	 
	
	
}
