package br.com.xti.poo.metodos.argumentosvariaveis;

public class MetodosComArgumentosVari�veis {

	
	public static void main(String[] args) {
		//lista de numeros que o usuario ir� informar no momento que chamar o m�todo
		
		MetodosComArgumentosVari�veis metodosComArgumentosVari�veis = new MetodosComArgumentosVari�veis();
		
		//metodo com parametros indefinidos com lista, n�o necessita criar array, os numeros
		//podem ser passados diretamente
		System.out.println("Soma:  " + metodosComArgumentosVari�veis.somaListaInt(2,3,5,6,1));
		
		
		//obrigatoriamente deve ser criado um array para passar ao metodo
		double[] numeros = {4,3,2,5,6,7,8};
		//metodo com parametros indefinidos com array - declarado obrigatoriamente
		System.out.println("Soma:  " + metodosComArgumentosVari�veis.somaArrayInt(numeros));
		
		System.out.println("Soma:  " + metodosComArgumentosVari�veis.concatenaListaStr("Fernando "," Alves "," Silva."));
		
		
		System.out.println("Soma:  " + metodosComArgumentosVari�veis.somaStringListaInt("Carl", 1,2,3,4,5,7));
		
	}
	
	
	
	//m�todo para numero indefinido de parametros,
	//metodos variaveis so podem terminar com lista de parametros indefinidos (argumentos variaveis), 
	//mas podem possuir outros parametros no inicio
	// � permitido somente um parametro com argumentos variaveis
		public double somaStringListaInt(String nome, double ... numeros){ 
			
			System.out.println(nome);
			
			double total = 0;
			//os numero s�o convertidos em um array no momento que o m�todo � executado
			for (double n : numeros) {
				total += n;
			}
			
			return total;
			}
		
		//n�o � permitido
		//public double somaStringListaInt(String ... nome, double ... numeros){
		
	
	
	//m�todo para numero indefinido de parametros 
	public double somaListaInt(double ... numeros){ 
		
		double total = 0;
		//os numero s�o convertidos em um array no momento que o m�todo � executado
		for (double n : numeros) {
			total += n;
		}
		
		return total;
		}
	
	
	public String concatenaListaStr(String ... nomes){ 
		
		String nome = "";
		//os numero s�o convertidos em um array no momento que o m�todo � executado
		for (String n : nomes) {
			nome += n;
		}
		
		return nome;
		}
	
	
	public double somaArrayInt(double[] numeros){ 
		
		double total = 0;
		//os numero s�o convertidos em um array no momento que o m�todo � executado
		for (double n : numeros) {
			total += n;
		}
		
		return total;
		}
}
