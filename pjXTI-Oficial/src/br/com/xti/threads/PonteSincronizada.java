package br.com.xti.threads;

public class PonteSincronizada implements Ponte{

	//controle de execu��o dos metodos pelas threads
	
	
	//threads esperem por uma condi��o para executar
	//recuperar o item da ponte 
	//n�o esteja ponte vazia
	
	//threads esperem por uma condi��o para executar
	//para a ponte proseguir n�o pode estar ocupada
	//n�o esteja ponte ocupada
	
	private int valor = -1;
	private boolean ocupada = false; //valor disponivel para receber valor para ser armazenado
	
	
	//mesmo que uma impressora, todas as solicita��es impressas uma vez
	//produzido primeiro pelo produtor e cada valor produzido seja consumido 
	//exatamente uma vez pelo consumidor
	//sincronizar metodos get e set para executar somente uma vez
	@Override
	public synchronized void set(int value) throws InterruptedException {
		while(ocupada){
			System.out.println("Ponte cheia. Produtor deve arguardar...");
			wait(); // metodo wait da classe object - aguardar
		}
		//continua a execu��o
		System.out.print(" Produziu: " + valor);
		this.valor = value;
		
		//informar que a ponte est� ocupada novamente.
		ocupada = true;
		notifyAll(); //informa a todas as threads de que o estado mudou ou n�o
	}


	//sincronizar metodos get e set para executar somente uma vez
	//consumido somente uma vez pelo consumidor
	@Override
	public synchronized int get() throws InterruptedException {
		
		while(!ocupada){
			System.out.println("Ponte vazia. Consumidor aguardando...");
			wait();//ir� aguardar at� a ponte estar ocupada para executar a leitura 
					//do que est� na ponte
		}
		
		//realiza a leitura do que est� na ponte
		System.out.print(" Consumiu: " + valor);
		
		//indicar que o consumidor pode armazenar valores
		ocupada = false;
		
		//notificar todas as Threads que est�o aguardando a mudan�a de estatos
		notifyAll();
		
		
		return valor;
		
	}
	
	

}
