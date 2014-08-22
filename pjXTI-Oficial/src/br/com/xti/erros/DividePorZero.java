package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	
	//informa ao metodo que todas exce��es que o metodo pode lan�ar, para que o mesmo tenha a chance
	// de tratar todas as exce��es informadas caso sejam lan�adas.
	//para isto � utilizada a clausula throws.
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {
			
			System.out.println("Digite o primeiro numero: ");
			
			int a = s.nextInt();
					
			System.out.println("Digite o numero divisor: ");
			
			int b = s.nextInt();
			System.out.println(a / b);
	
	}
	

	public static void main(String[] args) {
		
		//o usuario informar� os numero de para realizar a divisao
		Scanner s = new Scanner(System.in);
		
		boolean continuar = true;
		

			//tentar realizar esta execu��o tantas vezes quantas forem necessarias
		do{

			
			try{
				
				dividir(s);//n�o tratar� as exce��es, este metodo simplismente lan�a as mesmas atrav�s do throws
				
				
				continuar = false;
			}
			
			/*try{
					//n�o � permitido dividir um numero por zero, o que causa um erro em matematica, em java n�o � diferente
					
					//provocara erro de execu��o
					//int x = 1 / 0;
					
					System.out.println("Digite o primeiro numero: ");
					
					int a = s.nextInt();
							
					System.out.println("Digite o numero divisor: ");
					
					int b = s.nextInt();
					System.out.println(a / b);
					
					continuar = false;
					
				}*/
			
				//tratamento de uma exce��o por vez
				/*//InputMismatchException se entrar com um tipo inesperado
				//ArithmeticException se entrar com o divisor 0
				catch(InputMismatchException e1){
					//System.out.println("Capturei erro InputMismatchException");
					//imprime a mensagem derro em outra cor ao utilizar o System.err
					System.err.println("Os numeros devem ser inteiros!");
					
					//realiza��o do tratamento caso o usuario n�o informe o tipo valido
					//o scanner fica aguardando uma nova a��o para liberar a leitura para o usuario
					s.nextLine();//descarta a entrada que deu erro e libera novamente para o usuario
					
					
				}
				catch(ArithmeticException e2 ){
					//System.out.println("Capturei erro ArithmeticException");
					//imprime a mensagem derro em outra cor ao utilizar o System.err
					System.err.println("O divisor deve ser diferente de 0!");
					
					//o scanner fica aguardando uma nova a��o para liberar a leitura para o usuario
					s.nextLine();//descarta a entrada que deu erro e libera novamente para o usuario
				}*/
			
				//tratamento de exce��es com mult-catch
			
			catch(InputMismatchException | ArithmeticException e2){
				System.err.println("Numero inv�lido!");
				//e2.printStackTrace(); //retorna a pilha de erros em formato de array
				System.err.println("Mensagem de erro: >>>>  " + e2.getMessage()); // retorna as mensagens de erro em formato String
				s.nextLine();// descarta a entrada errada e libera novamente para o usuario.
				
				
			}
			
				finally{
					System.out.println("Finally executado...");
				}
				

		}while(continuar);
		

	}

}
