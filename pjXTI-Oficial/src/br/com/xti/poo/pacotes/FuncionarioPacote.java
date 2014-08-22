package br.com.xti.poo.pacotes;

import br.com.xti.poo.classes.modelos.Funcionario;

public class FuncionarioPacote {

	/*Teste dentro do mesmo pacote da classe Funcionario*/
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		//não é possível visualizar a variavel nome pois a mesma está privada
		//erro de copilação
		f.nome = "Ricardo";
		
		//acessível pois está dentro do mesmo pacote, pois é uma variável com acesso package
		f.nomePackage = "Saulo";
		
		f.nomeProtected = "Ronaldo";//variável acessível para a classe ou para classes filhas ou mesmo pacote, sub-classes que não é o caso
		
		f.nomePublic = "Rei"; //acessivel a todos os elementos, de todas a classes e pacotes icone circulo verde
		
		
		f.getNome();//acessivel dentro da classe somente.
		
		f.getNomePackage(); //acessivel somente dentro do pacote.
		
		f.getNomeProtected(); //acessivel somente no pacote, em classes filhas e dentro da própria classe
		
		f.getNomePublic(); //Acessível dentro do pacote, da classe, fora do pacote e em outras classes

	}

}
