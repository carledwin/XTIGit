package br.com.xti.logica.autoboxing;
public class AutoBoxing{

	public static void main(String[] args){
	
		//inserido na versão 5 do java
		//AutoBoxing Recurso auxiliar das classes Wrappers
		//Boxing("Encaixotar")
		//Unboxing("Desencaixotar")
		
		//antigamente
		Integer x = new Integer(555); //boxing - empacotado
		int a = x.intValue(); //unboxing - desenpacotar
		a++; //incrementa
		x= new Integer(a);//re-empacotar - boxing
		//Recuperando o tipo primitivo da variavel x.intValue();
		System.out.println(x.intValue());
		
		Boolean v = new Boolean("false");
		//era necessario extrair o valor para somente depois efetuar a comparação
		if(!v.booleanValue()){
			System.out.println(v.booleanValue());
		}
		
		
		//Atualmente
		Integer y = 555;
		y++;//unboxing - desenpacota, incrementa e boxing - reempacota
		
		//para exibir o valor não existe a necessidade de recuperar o valor 
		//primitivo, basta chamar a variavel
		System.out.println(y);
		
		//para acessar os metodos do objeto, permanece da mesma forma
		System.out.println(y.intValue());
		
		Boolean z = new Boolean("true");
		//agora a classe Wrapper pode ser comparada diretamente dentro do if,
		//sem a necessidade de unboxing e boxing,
		//pois é executado o AutoBoxing automaticamente a partir do java 5
		//sendo realizados unboxing, ***incremento e boxing
		if(z){
			System.out.println(z);
		}
	
	}
}