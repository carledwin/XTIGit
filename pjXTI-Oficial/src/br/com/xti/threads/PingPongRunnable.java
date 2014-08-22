package br.com.xti.threads;

//transformar a classe em Thread
//Toda thread implementa Runnable, um objeto executavel
//o unico metodo que deve ser implementado é o run()
//utilizar objtos Runnable no lugar de Threads, transformado 
//a classe Thread para Runnable, implementando a interface Runnable
public class PingPongRunnable implements Runnable{

	String palavra;
	long tempo;
	
	public PingPongRunnable(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	
	//caso o metodo run não exista, terá que ser implementado
	/*@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}*/
	
	//metodo run implementado para a classe Thread PingPong
	public void run(){
		for(int i=0; i<10; i++){
		try {
			System.out.println("Thread->> " + palavra + ",  executada ->  "  + i + " vez(es).");
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			return;
		}
		}
	}
	
	
	//sleep - aguardar um templo / paralizar a thread, aguardar/dormir
	//run - executando
	//start - coloca a thread no estdo pronto para ser executada
	// 
	
	public static void main(String[] args) {
	
		//criando objeto Runnable
		Runnable ping = new PingPongRunnable("ping", 1500);//um segundo e meio
		Runnable pong = new PingPongRunnable("pong", 4000);
		
		//criando thead para executar o runnable
		//o construtor da thread recebe o runnable e a string
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		
		System.out.println("Ver Threads com Runnable");
		
	}



}
