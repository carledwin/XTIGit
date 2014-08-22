package br.com.xti.classes.mais.populares.java.string;

public class StringMutavel {

	public static void main(String[] args) {
		
		//Ambas possuem os mesmos metodos, neste caso com metodos sincronizados, 
		//para ambientes multiprocessados, trabalhando com varias treads acessando os mesmos StringBuffers
		StringBuffer sbf = new StringBuffer();
		
		//n�o possuem metodos sincronizados o que pode n�o funcionar muito bem no momento em que milhares de
		//requisi��es est�o sendo feitas simultaneamente
		//StringBuilder sbu = new StringBuilder();
		StringBuilder sbu = new StringBuilder("Java ");
		
		//Ambas podem ser criadas da mesma forma que um objeto String
		
		sbu.toString();//converte em string
		sbu.length();//tamanho da string
		sbu.capacity(); // capacidade de armazenamento da string disponivel
		
		System.out.println(sbu.toString());
		
		sbu.reverse(); //inverte a ordem dos caracteres
		
		
		
		System.out.println(sbu.toString());
		System.out.println(sbu.length());
		System.out.println(sbu.capacity());
		
		sbu.append(" a linguagem");//adiciona textos a string sem criar novos objetos
		
		sbu.append(" Trabalhando ");
		
		//acrescentando array de caracteres
		char[] c = {'c','o','m',' ',};
		
		//concatenando appends
		sbu.append(c).append(" TEXTOS ...");
		
		System.out.println(sbu.toString());
		System.out.println(sbu.length());
		System.out.println(sbu.capacity());
		
		
		//a JVM concatena em tempo de execu��o utilizando a String builder
		String s  = "Oi " + "como " + "vai voc�";
		       s += " aaa "; //neste caso est� sendo criado um novo objeto do tipo stringBuilder 
		       				//para realizar a concatena��o novamente 
		
		//seria o mesmo que 
		String s2 = new StringBuilder("Oi ")
		.append(" como ").append("vai voc�").toString();//neste caso � o mesmo objeto
		
		System.out.println(s);
		System.out.println(s2);
		
		//metodo para remover conteudos com args de posicao inicial e quantidade de caracteres
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
	
		System.out.println(url);

	}

}
