package br.com.xti.poo.pacotes;

import br.com.xti.poo.classes.modelos.Funcionario;

public class FuncionarioPacote {

	/*Teste dentro do mesmo pacote da classe Funcionario*/
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		//n�o � poss�vel visualizar a variavel nome pois a mesma est� privada
		//erro de copila��o
		f.nome = "Ricardo";
		
		//acess�vel pois est� dentro do mesmo pacote, pois � uma vari�vel com acesso package
		f.nomePackage = "Saulo";
		
		f.nomeProtected = "Ronaldo";//vari�vel acess�vel para a classe ou para classes filhas ou mesmo pacote, sub-classes que n�o � o caso
		
		f.nomePublic = "Rei"; //acessivel a todos os elementos, de todas a classes e pacotes icone circulo verde
		
		
		f.getNome();//acessivel dentro da classe somente.
		
		f.getNomePackage(); //acessivel somente dentro do pacote.
		
		f.getNomeProtected(); //acessivel somente no pacote, em classes filhas e dentro da pr�pria classe
		
		f.getNomePublic(); //Acess�vel dentro do pacote, da classe, fora do pacote e em outras classes

	}

}
