package br.com.xti.erros;

import br.com.xti.poo.classes.modelos.Galinha;
import br.com.xti.poo.classes.superr.AnimalSuperClasse;
import br.com.xti.poo.heranca.CachorroHerancaSubClasse;

public class ExcecoesComuns {

	
	static int[] arraysNulo; // Não iniciado
	
	static int[] arraysComZeroPosicoes = new int[0]; //iniciada com zero posições 
	
	public static void main(String[] args) {
		
		//java.lang.NullPointerException
		//ocorrerá uma exceçao de NullPointerException pois o array não foi iniciado, este objeto é nulo
		//System.out.println(arraysNulo.length);
		
		
		//java.lang.ArithmeticException
		//tentativa de divisão por zero
		//int x = 5 / 0;
		
		
		//java.lang.ArrayIndexOutOfBoundsException
		//tentativa de acesso a posição de inisistene dentro do array
		//System.out.println(arraysComZeroPosicoes[1]);

		
		
		//Teste de Eh UM
		AnimalSuperClasse 		a = new Galinha(4, "Milho");
		Galinha 				g = (Galinha) a; //o CAST funcionará, pois são do mesmo tipo
		
		
		//java.lang.ClassCastException
		//Tentativa de colocar a galinha dentro de um cachorro, pois não passou no teste
		// do Eh UM - Não existe relacionamento entre galinha e cachorro
		//CachorroHerancaSubClasse c = (CachorroHerancaSubClasse) a; //o CAST funcionará, pois são do mesmo tipo
		
		
		//java.lang.NumberFormatException
		//erro ao tentar converter String em numero, por estar em um formato desconhecido pela classe de conversão
		//Utilizando a classe Wrapper para conversão.
		//int inteiro = Integer.parseInt("x"); //não funciona pois é de um tipo desconhecido pela classe de conversão
		//System.out.println(inteiro);
		//Funciona adquadamente
		//int inteiroCerto = Integer.parseInt("2132342");
		//System.out.println(inteiroCerto);
		
		
	}

}
