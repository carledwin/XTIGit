package br.com.xti.poo.classes.modelos;

//acesso para classes
//package acessível somente no pacote 
//public acessivel em outros pacotes
//***private utilizado somente em situações muito especifica que será visto em design pattern.
public class Funcionario {

	//sempre permitir o mínimo de acesso as variáveis e métodos
	
	//package -  
	//private - recurso auxiliar para realizar açoes dentro da classe
	//
	
	
	private String nome;
	
	//a ausência de um modificador de acesso faz com que a variável fique acessível a todo o pacote
	//inacessivel para outros pacotes
	//seria o mesmo que:
	//package String nome2;
			String nomePackage;
			
	//para dar acesso dentro da classe ou para filhos da classe	
	protected String nomeProtected;
	
	
	public String nomePublic;
	
	
	private String getNome(){
		return nome;
	}
	
	
	//acesso package
	String getNomePackage(){
		return nome;
	}
	
	protected String getNomeProtected(){
		return nome;
	}
	
	public String getNomePublic(){
		return nome;
	}
			
	
	/*Teste dentro da classe Funcionario*/
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		//variavel nome com acesso private icone quadrado vermelho
		f.nome = "Ricardo";
		
		f.nomePackage = "Saulo";//variável visível para o pacote acesso package icone triangulo azul
		
		f.nomeProtected = "Ronaldo";//variável acessível para a classe ou para classes filhas ou mesmo pacote, sub-classes
		
		f.nomePublic = "Rei"; //acessivel a todos os elementos, de todas a classes e pacotes icone circulo verde
		
		f.getNome();//acessivel dentro da classe somente.
		
		f.getNomePackage(); //acessivel somente dentro do pacote.
		
		f.getNomeProtected(); //acessivel somente no pacote, em classes filhas e dentro da própria classe
		
		f.getNomePublic(); //Acessível dentro do pacote, da classe, fora do pacote e em outras classes
		
		
		
	}

}
