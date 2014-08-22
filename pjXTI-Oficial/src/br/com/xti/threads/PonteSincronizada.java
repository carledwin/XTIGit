package br.com.xti.threads;

public class PonteSincronizada implements Ponte{

	//controle de execução dos metodos pelas threads
	
	
	//threads esperem por uma condição para executar
	//recuperar o item da ponte 
	//não esteja ponte vazia
	
	//threads esperem por uma condição para executar
	//para a ponte proseguir não pode estar ocupada
	//não esteja ponte ocupada
	
	private int valor = -1;
	private boolean ocupada = false; //valor disponivel para receber valor para ser armazenado
	
	
	//mesmo que uma impressora, todas as solicitações impressas uma vez
	//produzido primeiro pelo produtor e cada valor produzido seja consumido 
	//exatamente uma vez pelo consumidor
	//sincronizar metodos get e set para executar somente uma vez
	@Override
	public synchronized void set(int value) throws InterruptedException {
		while(ocupada){
			System.out.println("Ponte cheia. Produtor deve arguardar...");
			wait(); // metodo wait da classe object - aguardar
		}
		//continua a execução
		System.out.print(" Produziu: " + valor);
		this.valor = value;
		
		//informar que a ponte está ocupada novamente.
		ocupada = true;
		notifyAll(); //informa a todas as threads de que o estado mudou ou não
	}


	//sincronizar metodos get e set para executar somente uma vez
	//consumido somente uma vez pelo consumidor
	@Override
	public synchronized int get() throws InterruptedException {
		
		while(!ocupada){
			System.out.println("Ponte vazia. Consumidor aguardando...");
			wait();//irá aguardar até a ponte estar ocupada para executar a leitura 
					//do que está na ponte
		}
		
		//realiza a leitura do que está na ponte
		System.out.print(" Consumiu: " + valor);
		
		//indicar que o consumidor pode armazenar valores
		ocupada = false;
		
		//notificar todas as Threads que estão aguardando a mudança de estatos
		notifyAll();
		
		
		return valor;
		
	}
	
	

}
