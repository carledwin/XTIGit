package br.com.xti.logica.fibonacci;
public class DesafioFFF{

	public static void main(String[] args){
	int n1 = 0;
	int n = 1;
			while(n < 400){
				System.out.println(n);
				n = n + n1;
				n1 = n - n1;
			}
	}
}