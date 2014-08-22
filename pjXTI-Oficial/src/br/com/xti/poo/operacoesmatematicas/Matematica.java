package br.com.xti.poo.operacoesmatematicas;

import java.util.InputMismatchException;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	public int maior(int um, int dois){
	
		if(um > dois){
			return um;
		}else{
			return dois;
		}
	}
	
	public double soma(double um, double dois){
		
		//return um + dois;
		double s =  um + dois;
		
		return s;
	}
	
	public double divide(double um, double dois) throws InputMismatchException, ArithmeticException {
		
		//return um / dois;
		double s = 0;
		try {
			s =  um / dois;
		} catch (InputMismatchException | ArithmeticException e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public double raiz( double numero){
		double raiz = Math.sqrt(numero);
		return raiz;
	}

}
