package br.com.xti.classes.mais.populares.java.string;

public class StringOperacoes {

	/*
	 * STRINGS  -	representam textos, conjunto de caracteres
	 * 
	 * CONTRUÇÃO
	 * LOCALIZAÇÃO
	 * COMPARAÇÃO
	 * EXTRAÇÃO
	 * MODIFICAÇÃO
	 * 
	 */
	
	public static void main(String[] args) {

		String s1Literal = "Write Once";
		String s2 = s1Literal + "Run AnyWhere";
		String s3 = new String();
		String s4 = new String("Java Virtual Machine");
		
		char[] array = {'J', 'a','v','a'};
		
		String s5 = new String(array);
		
		//OPERAÇÕES BASICAS
		
		//tamnho - numero de caracteres dentro da string
		int tamanho = s1Literal.length();
		System.out.println("Tamanho da String: " + tamanho);
		
		
		//LOCALIZAÇÃO 
		
		//localizar um caracter dentro da string, utilizando o index de 0 a n
		char letra = s1Literal.charAt(6);
		System.out.println("Posição do caracter informando o index(indice) do caracter, neste caso '6' : >>>   " + letra + "  Dentro da String " + s1Literal);
		
		//retorna a propria String, a representação deste texto
		String toString_texto = s1Literal.toString();
		System.out.println("Representação da String como texto com o toString:  " + toString_texto);
		
		//encontrar a primeira ocorrencia de um caracter dentro da string e retorna a posição dentro do array de char (string) em que está esta letra
		int posicaoCaracter = s1Literal.indexOf('r');
		System.out.println("A letra(caracter) 'r' está localizada na posição:  " + posicaoCaracter + " dentro da string " + s1Literal.toString());
		
		//encontrar a posição onde começa( primeira ocorrencia) uma palavra dentro de uma string
		int posicaoPalavra = s1Literal.indexOf("Once");
		System.out.println("A palavra 'Once ' está localizada / é iniciada na posição:  " + posicaoPalavra + "  dentro da palavra " + s1Literal.toString() );
		
		//encontra a posição da ultima ocorrencia do caracter na string
		int ultimaOcorrencia = s1Literal.lastIndexOf('e');
		System.out.println("A ultima ocorrencia para o caracter 'e' dentro da string: " + s1Literal.toString() + "  está na posição: " + ultimaOcorrencia);
		
		//informa se a string está vazia
		boolean vazia = s1Literal.isEmpty();
		System.out.println("A string:  " + s1Literal.toString() + " está vazia? " + (vazia == true ? " Sim " : " Não "));
		
		
		//COMPARAÇÃO DE STRINGS
		
		String xti  = "XTI";
		
		//comparar strings, comparando os valores de duas strings
		//o comparador == não pode ser comparado, pois compara se as referencias são as mesmas
		boolean x = xti.equals("xti");
		
		System.out.println("XTI é igual a xti:  equals" + (x == true ? " Sim " : " Não " ));
		
		String you  = "YOU";
		
		//para ignorar letras maiusculas e minusculas, case sensitive
		boolean t = you.equalsIgnoreCase("you");
		
		System.out.println("YOU é igual a you equals ignore case:  " + (t == true ? " Sim " : " Não " ));
		
		//indica se o texto começa com determinada string ou caracter
		boolean h = xti.startsWith("XT");
		boolean i = xti.startsWith("TI");
		System.out.println("XTI começa com XT?  " + (h == true ? " Sim " : " Não " ));
		System.out.println("XTI começa com TI?  " + (i == true ? " Sim " : " Não " ));
		 
		//indica se o texto termina com determinada string
		boolean j = xti.endsWith("TI");
		boolean f = xti.endsWith("XT");
		System.out.println("XTI termina com TI?  " + (j == true ? " Sim " : " Não " ));
		System.out.println("XTI termina com XT?  " + (f == true ? " Sim " : " Não " ));
		
		//comparar alfabeticamente se uma palavra vem antes da outra
		//comparar se uma string é maior que outra
		//indicado para criar metodo que ordene texto em ordem alfabética, pode ser utilizado também para saber
		//qual numero é maior que outro
		int c = "amor".compareTo("bola");//amor vem antes de bola retornando um numero menor do que zero >>> -1
		int b = "bola".compareTo("amor");//bola maior que amor retornando um numero maior que zero >>> 1
		String stringInformada = "bola";
		int d = "bola".compareTo(stringInformada);//bola  é igual a bola retornando zero
		System.out.println("Amor é:  " + (c < 0 ? " Menor que bola" : "Maior que bola"));
		System.out.println("Bola é:  " + (b < 0 ? " Menor que amor" : "Maior que amor"));
		System.out.println("Bola é:  " + (d != 0 ? " diferente da string informada: >>> " : "igual a string informada: >>> " + stringInformada ));
		
		
		//descobrir se uma string está dentro de outra em uma determinada posição
		String so = "Olhe, olhe!";
		//so.regionMatches(toffset a partir da posicao n, other existe a string "Olhe", ooffset a partir da posicao 0 , len com n caracteres);
		boolean exitePalavraNaPosicaoIndicadaCase = so.regionMatches(6, "Olhe", 0, 4);
		System.out.println("Existe a palavra 'Olhe' Case Sensitive na posição indicada 6? " + (exitePalavraNaPosicaoIndicadaCase == true ? " Sim " : " Não ") ); // não porque a letra é minuscula
		
		//com o primeiro parametro como true para ignorar o case sensitive 
		boolean exitePalavraNaPosicaoIndicadaIgnoreCase = so.regionMatches(true,6, "Olhe", 0, 4);
		System.out.println("Existe a palavra 'Olhe' Ignore Case na posição indicada 6? " + (exitePalavraNaPosicaoIndicadaIgnoreCase == true ? " Sim " : " Não ") ); // existe
		
		
		//EXTRAÇÃO DE DADOS DE DENTRO DE UMA STRING
		
		String l = "O Brasil é Lindo";
		
		//encontrar uma substring ou seja um pedaço de texto dentro de uma string a partir de posição n
		//captura o restante da string
		String subString_l_begin_11 = l.substring(11);
		System.out.println(subString_l_begin_11.toString());
		
		//posição inicial -begin, posição final -end
		subString_l_begin_11 = l.substring(2, 8);
		System.out.println(subString_l_begin_11.toString());
		//metodo sobrecarregado de substring, indicando o inicio - a partir da posição n até a posicao y
		
		
		
		//OPERAÇOES DE MODIFICAÇÃO DE STRINGS
		
		//concatenar outra string
		subString_l_begin_11 = l.concat(" que Maravilha!");
		System.out.println(subString_l_begin_11.toString());
		
		//trocar caracteres dentro da string, 
		//informando o caracter existente(old) na string e o que irá substituí-lo (new)
		subString_l_begin_11 = l.replace('a', '@');
		System.out.println(subString_l_begin_11.toString());
		
		//trocar a primeira - regex ocorrencia do caracter por outro valor - replacement
		subString_l_begin_11 = l.replaceFirst(" ", "X");
		System.out.println(subString_l_begin_11.toString());
		
		//trocar todas as ocorrencias - regex de um caracter por outro valor - replacement
		subString_l_begin_11 = l.replaceAll(" ", "Remplace");
		System.out.println(subString_l_begin_11.toString());
		
		//METODOS DE CONVERSÃO
		
		//converte a string em letras maiusculas
		subString_l_begin_11 = l.toUpperCase();
		System.out.println(subString_l_begin_11.toString());
		
		//converte a string em letras minusculas
		subString_l_begin_11 = l.toLowerCase();
		System.out.println(subString_l_begin_11.toString());
		
		//METODO PARA REMOVER OS ESPAÇOS EM BRANCO 
		 
		//com espaços
		System.out.println("          espaços      ");
		
		//antes e depois da string
		System.out.println("          semespaços      ".trim());
		
		//antes e depois da string não remove os espaços no meio da string
		System.out.println("            sem  *** não remove os espaços no meio da string ***  espaços         ".trim());
		
		String comEspaços = "            sem  *** não remove os espaços no meio da string ***  espaços         ";
		
		String removeTodosEspaços = comEspaços.replaceAll(" ", "");
		
		System.out.println("Espaços removidos com replaceAll() ");
		System.out.println(removeTodosEspaços.toString());
	}
	
	
}
