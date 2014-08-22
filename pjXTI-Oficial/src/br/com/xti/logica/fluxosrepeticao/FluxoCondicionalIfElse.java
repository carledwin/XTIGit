package br.com.xti.logica.fluxosrepeticao;
public class FluxoCondicionalIfElse{

	public static void main(String[] args){
	
	//int idade = 10;
	int idade = 19;
		if(idade < 11){
			System.out.println("Eh uma crianca");
		}
				
		//if		
		boolean passou = false;
		if(passou){
			System.out.println("Contratado.");
		}
				
		//if else		
		//int numero = 10;
		int numero = 11;
		if(numero % 2 == 0){
			System.out.println("Eh Par.");
		}else{
			System.out.println("Eh Impar");
		}
			
		
		//if else if
		int vIdade = 50;
		if(vIdade <= 12){
		System.out.println("Crianca");
		}else if(vIdade > 12 && vIdade <=18){
		System.out.println("Adolescente");
		} else if(vIdade > 18 && vIdade <=60){
		System.out.println("Adulto");
		}else{
		System.out.println("Menor de idade");
		}
		
		
		//If aninhado
		int nota = 5;
		if(nota >= 7){
			System.out.println("Passou");
		}else{
			System.out.println("Reprovou");
			if(nota >=6){
				System.out.println("mas pode fazer recuperacao.");
			}
		}
	}

}