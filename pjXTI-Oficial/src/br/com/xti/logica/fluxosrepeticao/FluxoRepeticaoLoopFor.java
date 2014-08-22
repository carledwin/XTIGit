package br.com.xti.logica.fluxosrepeticao;
public class FluxoRepeticaoLoopFor{

	public static void main(String[] args){
	
	String texto =""; //Incremento
		//for(int i = 0; sempre true; i++){ // loop infinito
		for(int i = 0; i < 10; i++){
			texto += i + ","; //incrementa os numeros como 
							//se estivesse formando uma palavra
			//System.out.println(i);
		}
	System.out.println(texto);
		
	
	String texto2 =""; // Decremento
	for(int i = 10; i > 0; i--){
		texto2 += i + ","; //incrementa os numeros como 
							//se estivesse formando uma palavra
		}
	System.out.println(texto2);
		
	String texto3 ="";
	//verificar todos os pares entre 10 e 20
		for(int i = 10; i <= 20; i++){
			if(i % 2 == 0){
			texto3 += i + ","; 
			}
		}
		System.out.println(texto3);
	
	
	//criando um quadrado com asterisco
	int tamanho = 5;
	for(int i = 0; i < tamanho; i++){
		for(int x = 0; x < tamanho; x++){
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}