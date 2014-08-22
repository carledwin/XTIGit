package br.com.xti.poo.classes.modelos;

//acesso para classes
//package acess�vel somente no pacote 
//public acessivel em outros pacotes
//***private utilizado somente em situa��es muito especifica que ser� visto em design pattern.
public class Funcionario {

	//sempre permitir o m�nimo de acesso as vari�veis e m�todos
	
	//package -  
	//private - recurso auxiliar para realizar a�oes dentro da classe
	//
	
	
	private String nome;
	
	//a aus�ncia de um modificador de acesso faz com que a vari�vel fique acess�vel a todo o pacote
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
		
		f.nomePackage = "Saulo";//vari�vel vis�vel para o pacote acesso package icone triangulo azul
		
		f.nomeProtected = "Ronaldo";//vari�vel acess�vel para a classe ou para classes filhas ou mesmo pacote, sub-classes
		
		f.nomePublic = "Rei"; //acessivel a todos os elementos, de todas a classes e pacotes icone circulo verde
		
		f.getNome();//acessivel dentro da classe somente.
		
		f.getNomePackage(); //acessivel somente dentro do pacote.
		
		f.getNomeProtected(); //acessivel somente no pacote, em classes filhas e dentro da pr�pria classe
		
		f.getNomePublic(); //Acess�vel dentro do pacote, da classe, fora do pacote e em outras classes
		
		
		
	}

}
