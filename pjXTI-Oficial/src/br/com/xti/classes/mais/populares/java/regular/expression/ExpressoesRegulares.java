package br.com.xti.classes.mais.populares.java.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {

	public static void main(String[] args) {
		/*
		 * Regular Expression - Expressoes Regulares - s�o um padr�o de pesquisa no formato string
		 * -- padr�o de pesquisa e altera��o de textos
		 * -- uteis para validar dados e assegurar que estejam em um determinado formato
		 * 
		 * Metodos Java - 
		 *
		 */
		String padrao = "Java";
		String padraoMinuscula = "java";
		
		String texto = "Java";
		
		//boolean b = "Java".matches("Java");
		
		//valida se o texto est� dentro do padr�o, com o metodo matches
		boolean b = texto.matches(padrao);
		System.out.println(b);
		
		boolean bMinuscula = texto.matches(padraoMinuscula);
		System.out.println(bMinuscula);
		
		/* 
		 * Modificadores - 
		 * 
		 * (?i), Ignora mai�sculas e min�sculas
		 * (?x), Reconhece Comentarios
		 * (?m), Trabalha com Multilinhas
		 * (?s), Dottal 
		 */
		
		//ignorar maiusculas e minusculas(?i)
		//boolean c = "Java".matches("(?i)java");
		boolean c = "Java".matches("(?i)" + "java");
		System.out.println(c);
		
		
		//avaliar considerando varias linhas (?i)+(?m) -> (?im)
		c = "Java".matches("(?im)" + "java");
		System.out.println(c);
		
		
		
		
		 /* Meta Caracteres - s�o caracteres especiais que indicam a ocorrencia de letras, numeros, espa�os...
		 * 
     	 * .  procura qualquer caracter   
		 * \d procura qualquer numero   							-> digitos				[0-9]
		 * \D procura qualquer coisa que n�o seja numero 			-> n�o � digito			[^0-9]
		 * \s procura qualquer espa�o 								-> espa�os				[\t\n\x0B\f\r]
		 * \S procura qualquer coisa que n�o seja espa�o 			-> n�o � espa�o			[\s]
		 * \w procura qualquer letra ou numero 						-> letra				[a-zA-Z_0-9]
		 * \W procura qualquer coisa que n�o seja letra ou numero  	-> n�o � letra ou numero
		 * 
		 */
		
		//encontrar a ocorrencia de uma caracter qualquer
		//analisa a string e v� se � um metaCaracter caracter
		c = "@".matches(".");
		System.out.println(c);
		
		//ocorrencia de um numero
		c = "2".matches("\\d");
		System.out.println(c);
		
		//ocorrencia de letras e numeros
		c = "3".matches("\\w");
		System.out.println(c);
		
		//ocorrencia de letras e numeros
		c = "#".matches("\\w");// n�o � letra ou numero
		System.out.println(c);
		
		//ocorrencia de espa�os
		c = "\n".matches("\\s");
		System.out.println(c);
		
		c = "Pi".matches(".");//false pois est� sendo procurado somente um caracter
		System.out.println(c);
		
		c = "P2".matches("\\w\\w");//false pois est� sendo procurado somente um caracter
		System.out.println(c);
		
		
		//express�o para valida��o de cep
		c = "06223-000".matches("\\d\\d\\d\\d\\d-\\d\\d\\d");
		
		
		
		 /* Quantificadores - 
		 * X{n} 	X, exatamente
		 * X{n,} 	X,pelo menos 
		 * X{n, m} 	X,pelo menos e n�o mais que
		 * X?		X,0  ou 1 vez
		 * X*		X,0 ou mais vezes
		 * X+		X,1 ou mais vezes
		 */
		
		//procura a ocorrencia digitos n vezes
		c = "21".matches("\\d{2}");
		System.out.println(c);
		
		
		//procura a ocorrencia digitos n vezes ou mais
		c = "213432323".matches("\\d{2,}");
		System.out.println(c);

		
		//procura a ocorrencia digitos n vezes no maximo
		c = "213432323".matches("\\d{2,5}");
		System.out.println(c);
		
		
		//procura a ocorrencia digitos 0 ou 1 vez
		c = "".matches("\\d?");
		System.out.println(c);
		

		//procura a ocorrencia digitos 0 ou mais vezes
		c = "434343434".matches("\\d*");
		System.out.println(c);
		
		//procura a ocorrencia digitos 1 ou mais vezes
		c = "".matches("\\d+");
		System.out.println(c);

		
		//express�o para valida��o de cep
		//c = "06223-000".matches("\\d\\d\\d\\d\\d-\\d\\d\\d");
		c = "06223-000".matches("\\d{5}-\\d{3}");
		System.out.println(c);
		
		//valida��o de data
		c = "26/12/2014".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(c);
		
		
		
		 /* MetaCaracteres de Fronteiras- para definir se a string come�a ou termina com determinado padr�o 
		 * 
		 * ^ come�a - inicia
		 * $ termina - finaliza
		 * |  ou
		 * 
		 */
		
		//analizar se com Pier
		c = "Pier21".matches("^Pier.*");  //come�a com Pier e continua com 0 ou mais caracteres
		System.out.println(c);


		//analizar se terminha com 21
		c = "dsfgrftdsgfdsf21".matches(".*21$");//zero ou mais caracteres e finaliza com 21
		System.out.println(c);

		
		//verificar ser existe @ no texto
		c = "carlinstrgmail.com".matches(".+@.+");
		System.out.println(c);

		
		//
		c = "tem java aqui".matches("^tem.+aqui$");
		System.out.println(c);

		
		//
		c = "sim".matches("sim|n�o");
		System.out.println(c);

		

		/* Agrupadores -  agrupam conjuntos de caracteres
		 * [...]			Agrupamento - conjunto de letras
		 * [a-z]			Alcance - todos os caracteres entre a - z minusculo
		 * [a-e][i-u]		Uni�o - todos os caracteres entre a - e + i - u minusculo
		 * [a-z&&[aeiou]]	Interse��o - todos os caracteres entre a - z + aeiou
		 * [^abc]			Exce��o - tudo menos abc
		 * [a-z&& [^m-p]]	Subtra��o - caracteres entre a - z menos m - p
		 * \x				Fuga literal
		 *
		 */

		//qualquer numero de a - z
		c = "x".matches("[a-z]");
		System.out.println(c);
		//
		c = "A".matches("[a-z]");
		System.out.println(c);
		//
		c = "3".matches("[0-9]");
		System.out.println(c);
		//
		c = "True".matches("true");
		System.out.println(c);
		//
		c = "True".matches("[tT]rue");//true True
		System.out.println(c);
		//
		c = "True".matches("true");
		System.out.println(c);
		//Avaliar� se foi escrito com letra maiuscula ou minuscula
		c = "nAo".matches("[sS]im|[yY]es|[nN]�o|[nN]o");//sim Sim | n�o N�o | yes Yes | no No 
		System.out.println(c);

		
		//Valida��o de nome que comece com letra maiuscula
		c = "Beatriz".matches("[A-Z][a-z]+"); 
		System.out.println(c);

		//qualquer palavra que termine com olho e n�o comece com abc
		c = "dlho".matches("[^abc]lho"); 
		System.out.println(c);
		
		//ver se o usuario escreveu crau ou creu
		c = "crau".matches("cr[ae]u"); 
		System.out.println(c);
		
		
		//valida��o de emails
		c = "rh@xtiuniversity.com.br".matches("\\w+@\\w+\\..{3}\\..{2}"); 
		//converte a express�o regurar em algortimo em tempo de execu��o, muito menos performatico
		System.out.println(c);
		
		
		//encontrar todas as ocorrencias da palavra doce
		String doce = "Qual � o Doce mais doCe que o doce";
		
		//classes para manipula��o de express�es regulares
		//Retorna um objeto pattern
		//Pattern.compile("") ;//Prepare esta express�o regular para utilizar depois, muito mais performatico
		
		//Retorna um objeto matcher
		//Pattern.compile("(?i)doce").matcher("doce");
		
		//Matcher matcher =Pattern.compile("(?i)doce").matcher("doce"); //retorna somente uma vez, pois compara a string
		
		//(?i)  Ignora mai�sculas e min�sculas
		Matcher matcher =Pattern.compile("(?i)doce").matcher(doce); //retorna todas as ocorrencias, pois est� 
																	//comparando a variavel doce
		//encontrar todas as ocorrencias da palavra doce
		//metodo .find - retorna um booleano se encontrar
		while(matcher.find()){
			//retorna a ocorrencia da palavra doce atraves do metodo group enquanto estiver encontrando a ocorrencia
			System.out.println(matcher.group());
		}
		
		/*Substitui��es
		 * 
		 */
		
		System.out.println(doce);
		
		//substituir todas as ocorrencias da palavra doce por ...
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		//substituir ra-re-ri-ro-ru por xx
		String rato = "O rato roeu a roupa do rei de roma";
		
		System.out.println(rato);
		
		String g = rato.replaceAll("(?i)r[aeiou]","XX");
		
		System.out.println(g);
		
		//tabular o texto
		String h = "Tabular este texto com espa�o para tabula��o";
		
		String o = h.replaceAll("\\s", "\t");
		
		System.out.println(o);
		
		
		//objetivo
		//http://www.xti.com.br/2011/clientes.jsp
		
		String url = "www.xti.com.br/clientes-2011.html";
		//String url = "(www.xti.com.br)/(clientes)-(2011).html";
		
		//criar uma express�o regular que localize este padr�o
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		
		//validar o padr�o de verifica��o de acordo com a url indicada - (atual)
		c = url.matches(re);
		
		System.out.println(c);
		
		
		System.out.println(url);
		
		//transformar partes da express�o regular em variavies
		//para recuperar a variavel $(posi��o da variavel)
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		//objetivo
		//http://www.xti.com.br/2011/clientes.jsp
		//									regex - padr�o, substitui��o
		String novoFormato = url.replaceAll(re, "http://$1/$3/$2.jsp");
		
		System.out.println(novoFormato);
		
		
		
	}
	
	

}
