package br.com.xti.logica.operadores;
public class OperadorM{

	public static void main(String[] args){
	
		//Soma
		double x = 7 + 3;
		
		//Subtração
		double y = 7 - 3;
		
		//Multiplicação
		double z = 7 * 3;
		
		//Divisão
		double t = 7 / 3;
		
		//Modulo
		double h = 7 % 3;
		
		//Contatenação
		String g = "Oi " + "Programador Java";
		
		String u =  (3 % 2) == 1 ? "Eh Impar" : "Eh Par";
		
		String v =  (10 % 2) == 1 ? "Eh Impar" : "Eh Par";
		
		//Mais com menos
		double a = -(+3);
		
		//Menos com mais
		double b = +(-3);
		
		//Menos com menos
		double c = -(-3);
		
		//Mais com mais
		double d = +(+3);
		
		//Pre - Incremento +1 >> e = 6 + 1
		int e = 6;
		int ea = ++e;
		
		//Pre - Decremento -1 >> f = 
		int f = 6;
		int fa = --f;
		
		//Pos - Incremento +1 >> e = 6 + 1
		int i = 6;
		int ia = i--;
		
		
		//Pos - Decremento -1 >> f = 6 - 1
		int j = 6;
		int ja = j--;
		
		
		
		
		System.out.println("\n \n *****  7 por 3 *****");
		System.out.println("\n Soma: \t" + x);
		System.out.println("\n Subtracao: \t" +  y);
		System.out.println("\n Multiplicacao: \t" + z);
		System.out.println("\n Divisao: \t" + t);
		System.out.println("\n Modulo: \t" + h);
		System.out.println("\n Concatenacao: \t" + g);
		System.out.println("\n 3 eh: \t" + u);
		System.out.println("\n 10 eh: \t" + v);
		System.out.println("\n Mais com menos eh: \t" + a);
		System.out.println("\n Menos com mais eh: \t" + b);
		System.out.println("\n menos com menos eh: \t" + c);
		System.out.println("\n mais com mais eh: \t" + d);
		System.out.println("\n pre - incremento de 6 com ++6 eh: \t" + ea);
		System.out.println("\n pre - decremento de 6 com --6 eh: \t" + fa);
		System.out.println("\n pos - incremento de 6 com 6++ eh: \t" + ia);
		System.out.println("\n pos - decremento de 6 com 6-- eh: \t" + ja);
		
		
		
		
	}

}
