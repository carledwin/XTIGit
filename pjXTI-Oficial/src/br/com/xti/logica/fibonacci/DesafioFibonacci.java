package br.com.xti.logica.fibonacci;
public class DesafioFibonacci{
	public static void main(String[] args){
	
	//1+2[3]
	int atual = 0;
	int proximo = 1;
	int anterior = 0;
	for(int cont = 0; cont < 14; cont++ ){
		if(atual < 2){
			System.out.print(atual + ",");
			atual += proximo;
			System.out.print(atual + ",");
		}else if( atual == 2){
			anterior = atual;
			atual = atual + proximo;
			System.out.print(atual + ",");
		}else{
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
			System.out.print(atual + ",");
			
		
		}
	}
}

}

