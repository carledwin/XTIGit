package br.com.xti.logica.operadores;
import java.util.Scanner;

public class OperadorEspec{

	public static void main(String[] args){
	
		int idade = 4;
		
		String x = (idade >= 18 ? "Maior de Ideade" : "Menor de idade");
		
		String sexo = "M", pais = "Brasil";
		
		System.out.println(x);
		System.out.println(sexo);
		System.out.println(pais);
		System.out.println("\n\n\n\n");
		
		System.out.println("Informe o Raio: \n");
		
		
		
		//Calculo de Diâmetro diametro : 2r
		//double raio = 10;
		
		Scanner s = new Scanner(System.in);
		double raio = s.nextDouble();
		
		System.out.println("\n Raio: \t" + raio);
		
		double diametro = 2 * raio;
		System.out.println("\n Diametro: \t" + diametro);
		
		//Circunferencia : 2 PI r  encontrar o valor de PI em Java
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("\n Circunferencia: \t" + circunferencia);
		
		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println("\n Area: \t" + area);
		
	}
}