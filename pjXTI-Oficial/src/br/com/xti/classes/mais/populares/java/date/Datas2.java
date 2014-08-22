package br.com.xti.classes.mais.populares.java.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		
		/*FORMATACAO DE DATAS classe abstrata e não pode ser instancia*/
		
		//recuperar a instancia
		Calendar c = Calendar.getInstance();
		
		c.set(1980,  Calendar.FEBRUARY,12 );
		
		Date date = c.getTime();

		//Data sem formatação
		System.out.println("Data sem formatação");
		System.out.println(date);
		System.out.println("\n");
		
		/*DATEFORMAT classe abstrata e não pode ser instanciada*/
		
		
		/*Formatação de datas*/
		//recuperar a instancia - utilizada para formatação de data, dia, mes e ano
		DateFormat fInstance = DateFormat.getInstance();
		//Data sem formatação
		System.out.println("Formatação com getInstance");
		System.out.println("-->  ");
		System.out.println("\n");
		
		/*Formatação de datas*/
		//recuperar a instancia - utilizada para formatação de data, dia, mes e ano
		DateFormat fDate = DateFormat.getDateInstance();
		//Data sem formatação
		System.out.println("Formatação com getDateInstance");
		System.out.println("-->  " + fDate.format(date));
		System.out.println("\n");
			
			//Estilos
			/*Formatação de datas*/
			//recuperar a instancia - utilizada para formatação de data, dia, mes e ano
			//FULL - exibe o formato completo, dia da semana, dia do mes, mes e ano
			fDate = DateFormat.getDateInstance(DateFormat.FULL);
			//Data sem formatação
			System.out.println("Formatação com getDateInstance com constante FULL");
			System.out.println("-->  " + fDate.format(date));
			System.out.println("\n");
			
				//LONG - exibe o formato longo, dia do mes, mes e ano
				fDate = DateFormat.getDateInstance(DateFormat.LONG);
				//Data sem formatação
				System.out.println("Formatação com getDateInstance com constante LONG");
				System.out.println("-->  " + fDate.format(date));
				System.out.println("\n");
				
					//MEDIUM - exibe o formato medio, dia/mes/ano XXXX
					fDate = DateFormat.getDateInstance(DateFormat.MEDIUM);
					//Data sem formatação
					System.out.println("Formatação com getDateInstance com constante MEDIUM");
					System.out.println("-->  " + fDate.format(date));
					System.out.println("\n");
	
						//SHORT - exibe o formato longo, dia/mes/ano XX
						fDate = DateFormat.getDateInstance(DateFormat.SHORT);
						//Data sem formatação
						System.out.println("Formatação com getDateInstance com constante SHORT");
						System.out.println("-->  " + fDate.format(date));
						System.out.println("\n");

						
		/*CONVERTER STRING / TEXTO EM DATA*/
		//lança exception ParseException caso não consiga converter para data
		Date date2 = fDate.parse("12/02/1983");
		System.out.println("Conversão de String - Texto para Data");
		System.out.println("-->  " + fDate.format(date2));
		System.out.println("\n");

				
		
		/*Formatação de datas*/
		//recuperar a instancia - utilizada para formatação de hora, minuto e segundo
		DateFormat fTime = DateFormat.getTimeInstance();
		//Data sem formatação
		System.out.println("Formatação com getTimeInstance");
		System.out.println("-->  " + fTime.format(date));
		System.out.println("\n");
		
				
		/*Formatação de datas*/
		//recuperar a instancia - utilizada para formatação de data, dia, mes, ano, hora, minuto e segundo
		DateFormat fDateTime = DateFormat.getDateTimeInstance();
		//Data sem formatação
		System.out.println("Formatação com getDateTimeInstance");
		System.out.println("-->  " + fDateTime.format(date) );
		
		
		/*SIMPLEDATAFORMAT*/
		
		/*Formatação de datas*/
		//recuperar a instancia - utilizada para formatação de data, dia, mes, ano, hora, minuto e segundo
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Data sem formatação
		System.out.println("Formatação com SimpleDateFormat .format");
		System.out.println("-->  " + sdf.format(date2));
		
		/*CONVERTER STRING PARA DATA COM SIMPLEDATEFORMAT*/
		System.out.println("Conversão de String para Date com SimpleDateFormat .parse");
		System.out.println("-->  " + sdf.parse("10/10/2010"));
		
	}
}
