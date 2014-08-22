package br.com.xti.poo.classes;

import br.com.xti.poo.classes.modelos.Galinha;



public class GalinhaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Galinha g1 = new Galinha();
		//chamada normal
		//g1.botar();
		
		
		g1.botarComRetornoDoObjeto();
		
		System.out.println("Galinha 1 :  " + g1.ovos);
		
		Galinha g2 = new Galinha();
		//chamada concatenando chamadas de metodo que retorna o objeto
		g2.botarComRetornoDoObjeto().botarComRetornoDoObjeto();
		System.out.println("Galinha 2 :  " + g2.ovos);
		
		//para acessar uma vari�vel ou m�todo static n�o � necess�rio Instanciar a classe Galinha
		//basta chamar a classe Galinha seguido da vari�vel ou m�todo static
		System.out.println("Ovos da Granja:  " + Galinha.ovosDaGalinha);
		
		
		//acesso ao m�todo static sem a necessidade de instanciar a classe Galinha
		System.out.println("Media de Ovos por galinhas :  " + Galinha.mediaDeOvos(2));

	}

}
