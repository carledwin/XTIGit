package br.com.xti.poo.operacoesmatematicas;

public class MatematicaTest {

	public static void main(String[] args) throws Exception {
		
		Matematica m = new Matematica();
		
		int ma = m.maior(10 , 20);
		
		System.out.println(ma);
		
		double so = m.soma(10, 20);
		
		System.out.println(so);
		
		//2,4
		int par = m.maior(2, 4);
		//3,5
		int impar = m.maior(3, 5);
		
		//soma do maior numero par e do maior numero impar
		double soma = m.soma(par, impar);
		
		System.out.println(soma);
		
		double numero = 49;
		
		double raiz = m.raiz(numero);
		
		System.out.println("Raiz:" + raiz);
		
		double divide = m.divide(5,0);
		
		System.out.println("Divide:" + divide);
	}

}
