package br.com.xti.classes.mais.populares.java.date;


import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		//Inicio do calendario 01 de Jan de 1970
		//Tempo em java é medido com tipo longo em milesegundos
		//O computador tem esta informação de milesegundos desde 01 Jan de 1970
		System.out.println(System.currentTimeMillis());// 1403865175296
		
		//Objeto do tipo data
		
		Date agora = new Date();
		
		System.out.println(agora);//Fri Jun 27 07:33:56 BRT 2014
		
		//criar data informando a quantidade de milisegundos
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);//Sat Sep 08 22:46:40 BRT 2001
		
		//Metodos da classe Date
		
		//retorna os milisegundos deste tempo
		System.out.println(data.getTime()); 
		
		//define um tempo em milisegundos
		data.setTime(1_000_222_000_333L);
		
		//comparar a data com outra data
		/*data menor que a comparada retorna -1
		data iguala comparada retorna 0
		data maior que a comparada retorna 1 */
		System.out.println(data.compareTo(agora));
		
		//
		System.out.println();
		
		//Não utilizar metodos deprecados da classe Data, pois serão removidos
		//Utilizar a Classe calendar para isto
		
		/*MANIPULAÇÃO DA DATAS COM Calendar*/
		
		//Calendar é uma classe abstrata, não pode ser criada instancia da mesma
		//utilizar metodo static da mesma que retorna uma instancia da mesma
		Calendar c = Calendar.getInstance(); //Calendario Gregoriano Default
		
		//inicializar uma data
		c.set(1980, Calendar.FEBRUARY, 12);
		
		//Calendar recuperar o objeto Date
		c.getTime();
		
		//Date retorna o tempo em milisegundos
		data.getTime();
		
		System.out.println(c.getTime());
		
		
		/*RECUPERAR INFORMAÇÕES SOBRE A DATA*/
		
		//recuperar campos da data - field
		System.out.println(c.get(Calendar.YEAR));//ano
		System.out.println(c.get(Calendar.MONTH));//mes
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//dia do mes
		
		
		/*DEFINIR INFORMAÇÕES SOBRE A DATA*/
		
		System.out.println(c.getTime());
		//Definir os campos
		c.set(Calendar.YEAR, 1972);// alterar ano
		c.set(Calendar.MONTH,Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 25);
		System.out.println(c.getTime());
		
		/*LIMPAR CAMPOS INFORMAÇÕES SOBRE A DATA*/
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		//adicionar e remover unidade de tempos
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(c.getTime());
		
		c.add(Calendar.MONTH, -2);
		c.add(Calendar.YEAR, -2);
		c.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println(c.getTime());
		System.out.println("Data atual");
		//metodo ROLL aumenta ou diminui a unidade de tempo sem passar para o proximo mes, ano
		//ou seja não altera tipos maiores
		System.out.println(c.getTime());
		c.roll(Calendar.DAY_OF_MONTH, 40);
		System.out.println("Usando ROLL + 40 dias");
		System.out.println(c.getTime());
		
		//sem o metodo ROLL ele passará para o proximo mes
		System.out.println("Data atual + 60 dias");
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 60);
		System.out.println("Sem ROLL");
		System.out.println(c.getTime());
		
		
		/*Saudação com Bom dia, Boa tarde, Boa noite*/
		
		Calendar c1 = Calendar.getInstance();
		
		//recuperar a hora do dia
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if(hora <= 12){
			System.out.println("Bom dia: " + c1.getTime());
		}else if(hora > 12 && hora < 18){
			System.out.println("Boa tarde: " + c1.getTime());
		}else{
		System.out.println("Boa noite: " + c1.getTime());
		}
				
		
	}

}
