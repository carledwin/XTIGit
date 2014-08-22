package br.com.xti.erros;

import br.com.xti.poo.classes.modelos.Galinha;
import br.com.xti.poo.classes.superr.AnimalSuperClasse;
import br.com.xti.poo.heranca.CachorroHerancaSubClasse;

public class ExcecoesComuns {

	
	static int[] arraysNulo; // N�o iniciado
	
	static int[] arraysComZeroPosicoes = new int[0]; //iniciada com zero posi��es 
	
	public static void main(String[] args) {
		
		//java.lang.NullPointerException
		//ocorrer� uma exce�ao de NullPointerException pois o array n�o foi iniciado, este objeto � nulo
		//System.out.println(arraysNulo.length);
		
		
		//java.lang.ArithmeticException
		//tentativa de divis�o por zero
		//int x = 5 / 0;
		
		
		//java.lang.ArrayIndexOutOfBoundsException
		//tentativa de acesso a posi��o de inisistene dentro do array
		//System.out.println(arraysComZeroPosicoes[1]);

		
		
		//Teste de Eh UM
		AnimalSuperClasse 		a = new Galinha(4, "Milho");
		Galinha 				g = (Galinha) a; //o CAST funcionar�, pois s�o do mesmo tipo
		
		
		//java.lang.ClassCastException
		//Tentativa de colocar a galinha dentro de um cachorro, pois n�o passou no teste
		// do Eh UM - N�o existe relacionamento entre galinha e cachorro
		//CachorroHerancaSubClasse c = (CachorroHerancaSubClasse) a; //o CAST funcionar�, pois s�o do mesmo tipo
		
		
		//java.lang.NumberFormatException
		//erro ao tentar converter String em numero, por estar em um formato desconhecido pela classe de convers�o
		//Utilizando a classe Wrapper para convers�o.
		//int inteiro = Integer.parseInt("x"); //n�o funciona pois � de um tipo desconhecido pela classe de convers�o
		//System.out.println(inteiro);
		//Funciona adquadamente
		//int inteiroCerto = Integer.parseInt("2132342");
		//System.out.println(inteiroCerto);
		
		
	}

}
