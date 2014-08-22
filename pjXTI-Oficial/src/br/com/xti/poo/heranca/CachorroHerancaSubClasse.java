package br.com.xti.poo.heranca;

import br.com.xti.poo.classes.superr.AnimalSuperClasse;

public class CachorroHerancaSubClasse extends AnimalSuperClasse {


	double peso;
	
	//Objeto específico CachorroHerancaSubClasse do tipo  AnimalSuperClasse 
	
	//Está correto
	/*public CachorroHerancaSubClasse(double peso, String comida) {
		super(peso, comida);
		// TODO Auto-generated constructor stub
	}*/
	
	//OU
	public CachorroHerancaSubClasse(){
		//chamada obritoria ao construtor da super classe, pois a mesma não possui construtor padrão 
		
		//faz referencia a super classe
		super(30,"Carne");
		
		//para acessar um atributo ou método da super classe seria da seguinte maneira
		
		/*super.comida;
		super.peso;
		super.dormir();*/
		
/*		this.peso; // atributo do
		super.peso;
*/		
		
		//visivel somente para subclasses de animal
		//super.serialParaSubclasses;
		
	}

	//SOBREESCREVER MÉTODO FAZER BARULHO da superClasse AnimalSuperClasse
	void fazerBarulho(){
		System.out.println("Au, Au!");
	}
}
