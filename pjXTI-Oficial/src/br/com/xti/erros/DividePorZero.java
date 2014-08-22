package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	
	//informa ao metodo que todas exceções que o metodo pode lançar, para que o mesmo tenha a chance
	// de tratar todas as exceções informadas caso sejam lançadas.
	//para isto é utilizada a clausula throws.
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {
			
			System.out.println("Digite o primeiro numero: ");
			
			int a = s.nextInt();
					
			System.out.println("Digite o numero divisor: ");
			
			int b = s.nextInt();
			System.out.println(a / b);
	
	}
	

	public static void main(String[] args) {
		
		//o usuario informará os numero de para realizar a divisao
		Scanner s = new Scanner(System.in);
		
		boolean continuar = true;
		

			//tentar realizar esta execução tantas vezes quantas forem necessarias
		do{

			
			try{
				
				dividir(s);//não tratará as exceções, este metodo simplismente lança as mesmas através do throws
				
				
				continuar = false;
			}
			
			/*try{
					//não é permitido dividir um numero por zero, o que causa um erro em matematica, em java não é diferente
					
					//provocara erro de execução
					//int x = 1 / 0;
					
					System.out.println("Digite o primeiro numero: ");
					
					int a = s.nextInt();
							
					System.out.println("Digite o numero divisor: ");
					
					int b = s.nextInt();
					System.out.println(a / b);
					
					continuar = false;
					
				}*/
			
				//tratamento de uma exceção por vez
				/*//InputMismatchException se entrar com um tipo inesperado
				//ArithmeticException se entrar com o divisor 0
				catch(InputMismatchException e1){
					//System.out.println("Capturei erro InputMismatchException");
					//imprime a mensagem derro em outra cor ao utilizar o System.err
					System.err.println("Os numeros devem ser inteiros!");
					
					//realização do tratamento caso o usuario não informe o tipo valido
					//o scanner fica aguardando uma nova ação para liberar a leitura para o usuario
					s.nextLine();//descarta a entrada que deu erro e libera novamente para o usuario
					
					
				}
				catch(ArithmeticException e2 ){
					//System.out.println("Capturei erro ArithmeticException");
					//imprime a mensagem derro em outra cor ao utilizar o System.err
					System.err.println("O divisor deve ser diferente de 0!");
					
					//o scanner fica aguardando uma nova ação para liberar a leitura para o usuario
					s.nextLine();//descarta a entrada que deu erro e libera novamente para o usuario
				}*/
			
				//tratamento de exceções com mult-catch
			
			catch(InputMismatchException | ArithmeticException e2){
				System.err.println("Numero inválido!");
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
