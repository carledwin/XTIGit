package br.com.xti.poo.enumeracao;


public class EnumTest {

	
			//static para pertencer somente a esta classe
			//final para não poder ser alterada 
			//double tipo da constante
			//sempre com letra maiuscula
			public static final double PI = 3.14;
			
	public static void andar(Medida medida, int total){
		if(medida == Medida.MT){
			//... código
			System.out.println("Chamada ao enum em metros");
		}else{
			System.out.println("Chamada ao enum em outro tipo de medida");			
		}
		
	}
			
	public static void main(String[] args) {
		
		System.out.println(PecasXadrez.BISPO);
		System.out.println("\n*************************************************************************");
		System.out.println("Enum: " + Medida.MT);
		System.out.println("Titulo do Enum MT: " + Medida.MT.titulo);
		
		System.out.println("\n*************************************************************************");
		//Percorrer todas as constantes dentro de um ENUM
		//Medida.values() --> retorna um array do objeto
		for (Medida m : Medida.values()) {
			System.out.println(m + " : " + m.titulo);
		}
		
		System.out.println("\n*************************************************************************");
		
		andar(Medida.MT, 100);

System.out.println("\n*************************************************************************");
		
		andar(Medida.MM, 100);

	}

}
