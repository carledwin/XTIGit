package br.com.xti.classes.mais.populares.java.string;

public class StringOperacoes {

	/*
	 * STRINGS  -	representam textos, conjunto de caracteres
	 * 
	 * CONTRU��O
	 * LOCALIZA��O
	 * COMPARA��O
	 * EXTRA��O
	 * MODIFICA��O
	 * 
	 */
	
	public static void main(String[] args) {

		String s1Literal = "Write Once";
		String s2 = s1Literal + "Run AnyWhere";
		String s3 = new String();
		String s4 = new String("Java Virtual Machine");
		
		char[] array = {'J', 'a','v','a'};
		
		String s5 = new String(array);
		
		//OPERA��ES BASICAS
		
		//tamnho - numero de caracteres dentro da string
		int tamanho = s1Literal.length();
		System.out.println("Tamanho da String: " + tamanho);
		
		
		//LOCALIZA��O 
		
		//localizar um caracter dentro da string, utilizando o index de 0 a n
		char letra = s1Literal.charAt(6);
		System.out.println("Posi��o do caracter informando o index(indice) do caracter, neste caso '6' : >>>   " + letra + "  Dentro da String " + s1Literal);
		
		//retorna a propria String, a representa��o deste texto
		String toString_texto = s1Literal.toString();
		System.out.println("Representa��o da String como texto com o toString:  " + toString_texto);
		
		//encontrar a primeira ocorrencia de um caracter dentro da string e retorna a posi��o dentro do array de char (string) em que est� esta letra
		int posicaoCaracter = s1Literal.indexOf('r');
		System.out.println("A letra(caracter) 'r' est� localizada na posi��o:  " + posicaoCaracter + " dentro da string " + s1Literal.toString());
		
		//encontrar a posi��o onde come�a( primeira ocorrencia) uma palavra dentro de uma string
		int posicaoPalavra = s1Literal.indexOf("Once");
		System.out.println("A palavra 'Once ' est� localizada / � iniciada na posi��o:  " + posicaoPalavra + "  dentro da palavra " + s1Literal.toString() );
		
		//encontra a posi��o da ultima ocorrencia do caracter na string
		int ultimaOcorrencia = s1Literal.lastIndexOf('e');
		System.out.println("A ultima ocorrencia para o caracter 'e' dentro da string: " + s1Literal.toString() + "  est� na posi��o: " + ultimaOcorrencia);
		
		//informa se a string est� vazia
		boolean vazia = s1Literal.isEmpty();
		System.out.println("A string:  " + s1Literal.toString() + " est� vazia? " + (vazia == true ? " Sim " : " N�o "));
		
		
		//COMPARA��O DE STRINGS
		
		String xti  = "XTI";
		
		//comparar strings, comparando os valores de duas strings
		//o comparador == n�o pode ser comparado, pois compara se as referencias s�o as mesmas
		boolean x = xti.equals("xti");
		
		System.out.println("XTI � igual a xti:  equals" + (x == true ? " Sim " : " N�o " ));
		
		String you  = "YOU";
		
		//para ignorar letras maiusculas e minusculas, case sensitive
		boolean t = you.equalsIgnoreCase("you");
		
		System.out.println("YOU � igual a you equals ignore case:  " + (t == true ? " Sim " : " N�o " ));
		
		//indica se o texto come�a com determinada string ou caracter
		boolean h = xti.startsWith("XT");
		boolean i = xti.startsWith("TI");
		System.out.println("XTI come�a com XT?  " + (h == true ? " Sim " : " N�o " ));
		System.out.println("XTI come�a com TI?  " + (i == true ? " Sim " : " N�o " ));
		 
		//indica se o texto termina com determinada string
		boolean j = xti.endsWith("TI");
		boolean f = xti.endsWith("XT");
		System.out.println("XTI termina com TI?  " + (j == true ? " Sim " : " N�o " ));
		System.out.println("XTI termina com XT?  " + (f == true ? " Sim " : " N�o " ));
		
		//comparar alfabeticamente se uma palavra vem antes da outra
		//comparar se uma string � maior que outra
		//indicado para criar metodo que ordene texto em ordem alfab�tica, pode ser utilizado tamb�m para saber
		//qual numero � maior que outro
		int c = "amor".compareTo("bola");//amor vem antes de bola retornando um numero menor do que zero >>> -1
		int b = "bola".compareTo("amor");//bola maior que amor retornando um numero maior que zero >>> 1
		String stringInformada = "bola";
		int d = "bola".compareTo(stringInformada);//bola  � igual a bola retornando zero
		System.out.println("Amor �:  " + (c < 0 ? " Menor que bola" : "Maior que bola"));
		System.out.println("Bola �:  " + (b < 0 ? " Menor que amor" : "Maior que amor"));
		System.out.println("Bola �:  " + (d != 0 ? " diferente da string informada: >>> " : "igual a string informada: >>> " + stringInformada ));
		
		
		//descobrir se uma string est� dentro de outra em uma determinada posi��o
		String so = "Olhe, olhe!";
		//so.regionMatches(toffset a partir da posicao n, other existe a string "Olhe", ooffset a partir da posicao 0 , len com n caracteres);
		boolean exitePalavraNaPosicaoIndicadaCase = so.regionMatches(6, "Olhe", 0, 4);
		System.out.println("Existe a palavra 'Olhe' Case Sensitive na posi��o indicada 6? " + (exitePalavraNaPosicaoIndicadaCase == true ? " Sim " : " N�o ") ); // n�o porque a letra � minuscula
		
		//com o primeiro parametro como true para ignorar o case sensitive 
		boolean exitePalavraNaPosicaoIndicadaIgnoreCase = so.regionMatches(true,6, "Olhe", 0, 4);
		System.out.println("Existe a palavra 'Olhe' Ignore Case na posi��o indicada 6? " + (exitePalavraNaPosicaoIndicadaIgnoreCase == true ? " Sim " : " N�o ") ); // existe
		
		
		//EXTRA��O DE DADOS DE DENTRO DE UMA STRING
		
		String l = "O Brasil � Lindo";
		
		//encontrar uma substring ou seja um peda�o de texto dentro de uma string a partir de posi��o n
		//captura o restante da string
		String subString_l_begin_11 = l.substring(11);
		System.out.println(subString_l_begin_11.toString());
		
		//posi��o inicial -begin, posi��o final -end
		subString_l_begin_11 = l.substring(2, 8);
		System.out.println(subString_l_begin_11.toString());
		//metodo sobrecarregado de substring, indicando o inicio - a partir da posi��o n at� a posicao y
		
		
		
		//OPERA�OES DE MODIFICA��O DE STRINGS
		
		//concatenar outra string
		subString_l_begin_11 = l.concat(" que Maravilha!");
		System.out.println(subString_l_begin_11.toString());
		
		//trocar caracteres dentro da string, 
		//informando o caracter existente(old) na string e o que ir� substitu�-lo (new)
		subString_l_begin_11 = l.replace('a', '@');
		System.out.println(subString_l_begin_11.toString());
		
		//trocar a primeira - regex ocorrencia do caracter por outro valor - replacement
		subString_l_begin_11 = l.replaceFirst(" ", "X");
		System.out.println(subString_l_begin_11.toString());
		
		//trocar todas as ocorrencias - regex de um caracter por outro valor - replacement
		subString_l_begin_11 = l.replaceAll(" ", "Remplace");
		System.out.println(subString_l_begin_11.toString());
		
		//METODOS DE CONVERS�O
		
		//converte a string em letras maiusculas
		subString_l_begin_11 = l.toUpperCase();
		System.out.println(subString_l_begin_11.toString());
		
		//converte a string em letras minusculas
		subString_l_begin_11 = l.toLowerCase();
		System.out.println(subString_l_begin_11.toString());
		
		//METODO PARA REMOVER OS ESPA�OS EM BRANCO 
		 
		//com espa�os
		System.out.println("          espa�os      ");
		
		//antes e depois da string
		System.out.println("          semespa�os      ".trim());
		
		//antes e depois da string n�o remove os espa�os no meio da string
		System.out.println("            sem  *** n�o remove os espa�os no meio da string ***  espa�os         ".trim());
		
		String comEspa�os = "            sem  *** n�o remove os espa�os no meio da string ***  espa�os         ";
		
		String removeTodosEspa�os = comEspa�os.replaceAll(" ", "");
		
		System.out.println("Espa�os removidos com replaceAll() ");
		System.out.println(removeTodosEspa�os.toString());
	}
	
	
}
