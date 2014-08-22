package br.com.xti.logica.operadores;
public class OperadorComp{

	public static void main(String[] args){
	
	
	Integer x = 6;
	//int x = 6;
	
	//comparacação true ou false
	
	System.out.println("X igual a 6: \t" + (x == 6));
	System.out.println("X igual a 7: \t" + (x == 7));
	System.out.println("X diferente de 6: \t" + (x != 6));
	System.out.println("X diferente de 7: \t" + (x != 7));
	System.out.println("X maior que 6: \t" + (x > 6));
	System.out.println("X maior que 7: \t" + (x > 7));
	System.out.println("X menor que 6: \t" + (x < 6));
	System.out.println("X menor que 7: \t" + (x < 7));
	System.out.println("X maior ou igual a 6: \t" + (x >= 6));
	System.out.println("X maior ou igual a 7: \t" + (x >= 7));
	System.out.println("X menor ou igual a 6: \t" + (x <= 6));
	System.out.println("X menor ou igual a 7: \t" + (x <=7));
	System.out.println("X eh instanceof da Wrapper Integer: \t" + (x instanceof Integer));
	
	
	//Erro não é objeto
	//System.out.println(x instanceof int);
	//Erro de compilação
	//System.out.println("X igual a 7: \t" + (x == "6"));
	
	}

}
