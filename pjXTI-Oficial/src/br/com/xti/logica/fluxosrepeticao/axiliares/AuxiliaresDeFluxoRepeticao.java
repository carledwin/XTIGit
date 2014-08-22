package br.com.xti.logica.fluxosrepeticao.axiliares;
public class AuxiliaresDeFluxoRepeticao{

	public static void main(String[] args){
		//break para encerrar um loop inteiro ( o mais interno)
		//continue para encerrar a iteração atual ( o mais interno)
		//Rótulos
		//palavra chave break
		while(true){
			System.out.println("Entrou");
			System.out.println("Chegou ao break e vai encerrar o loop");
				break;//encerra o loop inteiro
						//não utilizar while(true) sem break, pois se tornará loop infinito
		} 
		
			System.out.println("Saiu do loop");
		
		//palavra chave continue
		for(int i = 0; i<20; i++){
			if(i == 5){
				continue;//encerra a iteração atual e não imprime o 5
			}
				if(i == 9){
					break; //encerra o loop quando i for igual a 9 e não imprime nada a partir do 9
				}
			System.out.println(i);
		}
		
		//Label Rótulos nomes para as estrutura - fluxo
		// um: >> nome do rotulo seguido de :(dois pontos)
		//utilizado para acessar as estruturas rotuladas
		
		um:
		for(int x = 0; x < 50; x++){
			
			if(x >= 5 ){
				dois:
				for(int y = 0; y<20; y++){
						if(y == 9){
							System.out.println("Encerrara agora os loops dois: e um: devido break um, loop principal");
							break um; //encerra o loop quando i for igual a 9 e não imprime nada a partir do 9
						}
					System.out.println("loop mais interno:  dois:  " + y);
				}
			}
		System.out.println("loop mais externo: um: " + x);
		}
		
		
			//Label - Rótulos
			//encontrar true dentro da matriz
			//matriz com dois elementos
			boolean[][] matriz = {
				{false, true, false, false, false},
				{false, false, false, false, false}
			};
			
			//fluxo de repeticao para encontrar o valor true
			busca:
			for(int a = 0 ; a < matriz.length; a++){
				System.out.println("A ");
				//percorrer os elementos internos pelo indice a
				for(int b = 0; b < matriz[a].length; b++){
					if(matriz[a][b] == true){
						System.out.println("TRUE");
						break busca; //finaliza a busca ao encontrar o item procurado
					};
					System.out.println("B ");
				}
			}
		
	}
}