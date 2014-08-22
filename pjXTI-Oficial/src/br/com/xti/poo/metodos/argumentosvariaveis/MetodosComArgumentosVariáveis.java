package br.com.xti.poo.metodos.argumentosvariaveis;

public class MetodosComArgumentosVariáveis {

	
	public static void main(String[] args) {
		//lista de numeros que o usuario irá informar no momento que chamar o método
		
		MetodosComArgumentosVariáveis metodosComArgumentosVariáveis = new MetodosComArgumentosVariáveis();
		
		//metodo com parametros indefinidos com lista, não necessita criar array, os numeros
		//podem ser passados diretamente
		System.out.println("Soma:  " + metodosComArgumentosVariáveis.somaListaInt(2,3,5,6,1));
		
		
		//obrigatoriamente deve ser criado um array para passar ao metodo
		double[] numeros = {4,3,2,5,6,7,8};
		//metodo com parametros indefinidos com array - declarado obrigatoriamente
		System.out.println("Soma:  " + metodosComArgumentosVariáveis.somaArrayInt(numeros));
		
		System.out.println("Soma:  " + metodosComArgumentosVariáveis.concatenaListaStr("Fernando "," Alves "," Silva."));
		
		
		System.out.println("Soma:  " + metodosComArgumentosVariáveis.somaStringListaInt("Carl", 1,2,3,4,5,7));
		
	}
	
	
	
	//método para numero indefinido de parametros,
	//metodos variaveis so podem terminar com lista de parametros indefinidos (argumentos variaveis), 
	//mas podem possuir outros parametros no inicio
	// é permitido somente um parametro com argumentos variaveis
		public double somaStringListaInt(String nome, double ... numeros){ 
			
			System.out.println(nome);
			
			double total = 0;
			//os numero são convertidos em um array no momento que o método é executado
			for (double n : numeros) {
				total += n;
			}
			
			return total;
			}
		
		//não é permitido
		//public double somaStringListaInt(String ... nome, double ... numeros){
		
	
	
	//método para numero indefinido de parametros 
	public double somaListaInt(double ... numeros){ 
		
		double total = 0;
		//os numero são convertidos em um array no momento que o método é executado
		for (double n : numeros) {
			total += n;
		}
		
		return total;
		}
	
	
	public String concatenaListaStr(String ... nomes){ 
		
		String nome = "";
		//os numero são convertidos em um array no momento que o método é executado
		for (String n : nomes) {
			nome += n;
		}
		
		return nome;
		}
	
	
	public double somaArrayInt(double[] numeros){ 
		
		double total = 0;
		//os numero são convertidos em um array no momento que o método é executado
		for (double n : numeros) {
			total += n;
		}
		
		return total;
		}
}
