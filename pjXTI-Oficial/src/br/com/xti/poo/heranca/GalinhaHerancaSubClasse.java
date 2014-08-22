package br.com.xti.poo.heranca;

import br.com.xti.poo.classes.superr.AnimalSuperClasse;

public class GalinhaHerancaSubClasse extends AnimalSuperClasse {

	//Objeto específico GalinhaHerancaSubClasse do tipo  AnimalSuperClasse
	
	//Está correto
	/*public GalinhaHerancaSubClasse(double peso, String comida) {
		super(peso, comida);
		// TODO Auto-generated constructor stub
	}*/

	//OU
	public GalinhaHerancaSubClasse(){
		//chamada obritoria a super classe
		super(2, "Milho");
	}
	
	//SOBREESCREVER MÉTODO FAZER BARULHO da superClasse AnimalSuperClasse
	void fazerBarulho(){
			System.out.println("Có, Có!");
		}
}
