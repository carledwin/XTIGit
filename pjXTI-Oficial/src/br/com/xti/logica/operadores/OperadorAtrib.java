package br.com.xti.logica.operadores;
public class OperadorAtrib{

	public static void main(String[] args){
		
		int x = 6;
		int y = 6;
		int z = 6;
		int t = 6;
		int v = 6;
		
		System.out.println("\n X = " + x);
		System.out.println("\n Y = " + y);
		System.out.println("\n Z = " + z);
		System.out.println("\n T = " + t);
		System.out.println("\n V = " + v);
		System.out.println("\n Incrementa 3 e atribui a X: \t" + (x += 3));
		System.out.println("\n Decrementa 3 e atribui a Y: \t" + (y -= 3));
		System.out.println("\n Multiplica por 3 e atribui a Z: \t" + (z *= 3));
		System.out.println("\n Divide por 3 e atribui a T: \t" + (t /= 3));
		System.out.println("\n Modulo de 3 e atribui a V: \t" + (v %= 3));
	
	}
}