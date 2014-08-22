package br.com.xti.poo.classes.superr;

import br.com.xti.externo.CachorroTestExterno;
import br.com.xti.poo.heranca.CachorroHerancaSubClasse;
import br.com.xti.poo.heranca.GalinhaHerancaSubClasse;

//todas as classes estendendem a classe Object
//public class AnimalSuperClasseTest extends Object {
public class AnimalSuperClasseTest {
	
	
	//com polimorfismo - bastaria receber o animal independente do tipo de animal executar o metodo fazerBarulho() dele
	//O parametro é do tipo mais generico (Super classe), para que todos os tipos mais especificos possam ser passados como
	//parametro para este método(Galinha, Cachorro...)
	public static void barulho(AnimalSuperClasse animal){
		animal.fazerBarulho();
	}
	
	//com fluxo condicional sem polimorfismo, o tipo de animal deve ser definido
	public static void barulho(String animal){
		if(animal.equals("class br.com.xti.poo.CachorroHerancaSubClasse")){
			System.out.println("Au, Au!   -   com fluxo condicional.");
		}else if(animal.equals("class br.com.xti.poo.GalinhaHerancaSubClasse")){
			System.out.println("Có, Có!   -   com fluxo condicional.");
		}else if(animal.equals("class br.com.xti.poo.AnimalSuperClasse")){
			System.out.println("Fazer Barulho!   -   com fluxo condicional.");
		}
	}
	

	public static void main(String[] args) {
		
		//Teste de É UM ANIMAL?
		//Se sim então deve estender de animal
		
		//Qualquer alteração realizada na Super - Classe refletira nas Sub - Classes.
		
		//tipo mais especifico
		//CachorroHerancaSubClasse toto = new CachorroHerancaSubClasse();
		//tipo mais generico
		AnimalSuperClasse toto = new CachorroHerancaSubClasse();
		toto.comida = "Carne";
		toto.dormir();
		
		AnimalSuperClasse marlei = new CachorroHerancaSubClasse();
		
		AnimalSuperClasse animalGenerico = new AnimalSuperClasse(0,null);
		
		
		//tipo mais especifico
		//GalinhaHerancaSubClasse carijo = new GalinhaHerancaSubClasse();
		
		//tipo mais generico
		AnimalSuperClasse carijo = new GalinhaHerancaSubClasse();
		
		carijo.dormir();
		
		//Testar o tipo de um objeto
		
		System.out.println("Instanceof - Totó é um cachorro?     R: " + (toto instanceof CachorroHerancaSubClasse == true ? " Sim. " : " Não."));
		System.out.println("Instanceof - Totó é um animal?       R: " + (toto instanceof AnimalSuperClasse 		== true ? " Sim. " : " Não."));
		System.out.println("equals     - Totó é igual Carijó?    R: " + (toto.equals(carijo) 						== true ? " Sim. " : " Não."));
		System.out.println("equals     - Totó é igual marlei?    R: " + (toto.equals(marlei) 						== true ? " Sim. " : " Não."));
		System.out.println("equals     - Totó é igual Totó?      R: " + (toto.equals(toto) 						== true ? " Sim. " : " Não."));
		System.out.println("hashCode   - Totó 		 	R: " + toto.hashCode());
		System.out.println("getClass   - Totó 		 	R: " + toto.getClass());
		System.out.println("toString   - Totó 		 	R: " + toto.toString());
		
		System.out.println("\n\n**************************************************************************\n\n");
		
		
		System.out.println("Barulho de Animal Generico (SuperClasse):  ");
		animalGenerico.fazerBarulho();
		System.out.println("\n");
		System.out.println("Barulho do Totó:  ");
		toto.fazerBarulho();
		System.out.println("\n");
		System.out.println("Barulho da Carijó:  ");
		carijo.fazerBarulho();
		
		System.out.println("\n\n**************************************************************************\n\n");
		
		System.out.println("CHAMANDO O METODO FAZERBARULHO COM POLIMORFISMO");
		System.out.println("\n\n**************************************************************************\n\n");
		System.out.println("Barulho da Carijó:  ");
		barulho(carijo);
		System.out.println("\n");
		System.out.println("Barulho da Marlei:  ");
		barulho(marlei);
		System.out.println("\n");
		System.out.println("Barulho de Animal Generico (SuperClasse):  ");
		barulho(animalGenerico);
		System.out.println("\n");
		System.out.println("Barulho do Totó:  ");
		barulho(toto);
		
		System.out.println("\n\n**************************************************************************\n\n");
		
		System.out.println("CHAMANDO O METODO FAZERBARULHO COM FLUXO CONDICIONAL SEM POLIMORFISMO");
		System.out.println("\n\n**************************************************************************\n\n");
		System.out.println("Barulho da Carijó:  ");
		barulho(carijo.getClass().toString());
		System.out.println("\n");
		System.out.println("Barulho da Marlei:  ");
		barulho(marlei.getClass().toString());
		System.out.println("\n");
		System.out.println("Barulho de Animal Generico (SuperClasse):  ");
		barulho(animalGenerico.getClass().toString());
		System.out.println("\n");
		System.out.println("Barulho do Totó:  ");
		barulho(toto.getClass().toString());
		
		System.out.println("\n\n**************************************************************************\n\n");
		
	}

}

