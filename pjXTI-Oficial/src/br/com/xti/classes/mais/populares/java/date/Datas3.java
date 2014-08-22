package br.com.xti.classes.mais.populares.java.date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		c.set(1980, Calendar.FEBRUARY, 12);
		
		Date date = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(f.format(date));
		
		
		
		//Objeto LOCALE
		//localiza o local padrão do sistema operacional
		Locale padrao = Locale.getDefault();
		
		//Construir um locale - definir o proprio locale
		//utilizando a ISO639 lista de codigos de linguas  formados por dois caracteres
		//utilizando a ISO3166 lista de codigos de paises formados por dois caracteres
									//linhga e pais
		Locale brasil = new Locale("pt","BR");
													//estilo de data, localizador de lingua e país
		DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println("Formatação de data e LOCALIZADOR pt e BR COM LOCALE:");
		System.out.println("BRASIL");
		System.out.println("-->  " + f2.format(date));
		
		//neste caso o computador exibirá somente ?????? por não possuir os caracteres indianos
		Locale india = new Locale("hi","IN");
		//estilo de data, localizador de lingua e país
		DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println("Formatação de data e LOCALIZADOR hi e IN COM LOCALE:");
		System.out.println("INDIA");
		System.out.println("-->  " + f3.format(date));

		
		//Locale usa = new Locale("hi","IN");
		//neste caso a classe Locale possui uma constante para representar o local para os Estados Unidos
		Locale usa = Locale.US;
		//estilo de data, localizador de lingua e país
		DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println("ESTADOS UNIDOS");
		System.out.println("Formatação de data e LOCALIZADOR com constante .US COM LOCALE:");
		System.out.println("-->  " + f4.format(date));

		
		
		//neste caso a classe Locale possui uma constante para representar o local para o JAPAO
		Locale japao = Locale.JAPAN;
		//estilo de data, localizador de lingua e país
		DateFormat f5 = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.println("JAPAO");
		System.out.println("Formatação de data e LOCALIZADOR com constante .JAPAN COM LOCALE:");
		System.out.println("-->  " + f5.format(date));

		
		//neste caso a classe Locale possui uma constante para representar o local para o JAPAO
		Locale italiano = Locale.ITALIAN;
		//estilo de data, localizador de lingua e país
		DateFormat f6 = DateFormat.getDateInstance(DateFormat.FULL, italiano);
		System.out.println("ITALIA");
		System.out.println("Formatação de data e LOCALIZADOR com constante .ITALIAN COM LOCALE:");
		System.out.println("-->  " + f6.format(date));

	}

}
