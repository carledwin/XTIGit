package br.com.xti.classes.mais.populares.java.assertions;

import java.util.Scanner;

public class Assertions {

	
	/*
	 * ASSERTION - assert - assertivas
	 * 
	 * Recurso de teste para tempo de desenvolvimento
	 * 
	 * São verificações feitas no sistema em tempo de desenvolvimento, utilizadas para assegurar que
	 * coisas que não podem acontecer sejam notificadas quando acontecerem.
	 * Utilizar para testar coisas que nunca deveriam acontecer.
	 * 
	 * Para coisas que podem acontecer utilizar - Exceptions.
	 * 
	 * Em programas funcionando de forma adequada, nenhuma assertion irá falhar
	 * 
	 * 
	 * As assertions não deveram mais ser utilizadas quando o aplicativo estiver pronto, somente
	 * em desenvolvimento.
	 * 
	 * 
	 * HABILITAR AS ASSERTIONS PARA UMA CLASSE A PARTIR DO PROMPT DE COMANDO
	 * Executando a partir do prompt de comando, no diretorio
	 * 
		c:\xti\XTI>java br.com.xti.erros.exception.assertions.Assertions
		Entre com um numero de 0 a 10:
	 * 
	 * 
	 * para habilitar as assertions, informe um parametro apos java '-ea'
	 * -ea ->>> enable assertion - habilite as assertions
	 * -enableassertions ->>> enable assertion - habilite as assertions
	 * c:\xti\XTI>java -ea br.com.xti.erros.exception.assertions.Assertions
		Entre com um numero de 0 a 10:
	 * 
	 * HABILITAR AS ASSERTIONS PARA UMA CLASSE DENTRO DA IDE - ECLIPSE
	 * Na Excecução, opção Run Configurations
	 * - Java Applications
	 * - Selecione a classe Assertions 
	 * - na aba argumentos, passe o argumento para a VM
	 * em VM arguments, pois este argumento é para a mesma, inserindo o argumento -ea
	 * 
	 * 
	 * PARA DESABILITAR AS ASSERTION
	 * -da
	 * 
	 * PARA HABILITAR TODAS AS ASSERTIONS EM UM PACOTE PACKAGE
	 * c:\xti\XTI>java -ea: br.com.xti...
	 * -ea: package
	 *  
	 *  
	 *  PARA HABILITAR TODAS AS ASSERTIONS EM UM PACOTE PACKAGE E DESABILITAR PARA UM PACOTE AO MESMO TEMPO
	 * c:\xti\XTI>java -ea: br.com.xti... -da:java.lang
	 * -ea: package
	 *  
	 *  
	 */
	
	public static void main(String[] args) {
	
		
		//Programa para que o usuario informe um numero entre 0 e 10
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um numero de 0 a 10:");
		
		int numero = s.nextInt();
		
		//verificação para garantir que o numero informado está entre 0 e 10
		//assert cria uma verificação com um parametro obrigatorio que é a validação (entre 0 e 10)
		//será avalidado quando o programa estiver sendo executado em desenvolvimento,
		//caso a avaliação falhe será lançado um erro, ou seja uma classe que estende a classe ERRO
		//é possível ainda lançar uma mensagem informado o erro que está ocorrendo
		//na primeira tentativa de executar o programa e informar um numero invalido, o programa
		//não executará a assert, por defaut, sua verificação, porque por defaut as assert estão 
		//desligadas, é necessario ligá-las.
		//as mesmas são desabilitadas por default, porque quando o programa for destribuido
		//as assert devem estar desligadas
		assert (numero >=0 && numero <= 10) : "Numero invalido: >>>  " + numero;
		//Caso não passe no teste de verificação, será lançado um error AssertionError + a mensagem.
		//as assertions não devem ser tratadas dentro do programa
		//Exception in thread "main" java.lang.AssertionError: Numero invalido: >>>  11
		//at br.com.xti.erros.exception.assertions.Assertions.main(Assertions.java:69)
		
		System.out.println("Voce entrou com o numero: " + numero);
		
	}
}
