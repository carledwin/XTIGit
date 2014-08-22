package br.com.xti.classes.mais.populares.java.number;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {

		double saldo = 123_456.789;
		
		
		//NumberFormat -é classe abstrata não sendo possivel instanciar,
		//possui um metodo para recuperar uma instancia da classe
		//para formatar numeros genericos
		NumberFormat nf = NumberFormat.getInstance();
		
		//opções de formatação
		
		//formatação de acordo com a localização default do 'sistema'
		//o metodo .format recebe por padrão um double
		System.out.println(nf.format(saldo));
		
		//para formatar numeros inteiros
		NumberFormat nfInteger = NumberFormat.getIntegerInstance();
		System.out.println(nfInteger.format(saldo));
		
		//para formatar numeros percentuais
		NumberFormat nfPercent = NumberFormat.getPercentInstance();
		System.out.println(nfPercent.format(0.25));
		
		//para formatar moedas - capturando o formato da moeda local - Locale - Brasileiro
		NumberFormat nfCurrency = NumberFormat.getCurrencyInstance();
		System.out.println(nfCurrency.format(saldo));
		
		//formatacao de maximo casas decimais
		//para formatar moedas - capturando o formato da moeda local - Locale - Brasileiro
		nfCurrency.setMaximumFractionDigits(1);
		System.out.println(nfCurrency.format(saldo));
			nfCurrency.setMaximumFractionDigits(5);
			System.out.println(nfCurrency.format(saldo));

			
		/*INTERNACIONALIZAÇÃO DE NUMEROS*/

			
		//formatacao do LOCALE para USA
		NumberFormat nfCurrencyUSA = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("--> USA:  " + nfCurrencyUSA.format(saldo));
		
		
		//formatacao do LOCALE para USA
		NumberFormat nfCurrencyFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("--> FRANCE:  " + nfCurrencyFRANCE.format(saldo));
		
	
		/*CONVERSÃO DE STRING PARA MOEDA */
		//formatacao do LOCALE para USA
		NumberFormat nfCurrencyDefault = NumberFormat.getCurrencyInstance();
		System.out.println("--> Default:  " + nfCurrencyDefault.format(saldo));
	
		//caso não consigua converter, será lançada uma exceção de ParseExcepition
		System.out.println("Parse de String para moeda:   " + nfCurrencyDefault.parse("R$ 1.100,25"));
			
	}

}
