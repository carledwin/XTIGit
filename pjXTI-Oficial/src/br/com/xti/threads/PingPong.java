package br.com.xti.threads;

//transformar a classe em Thread
//Toda thread implementa Runnable, um objeto executavel
//o unico metodo que deve ser implementado é o run()
public class PingPong extends Thread{

	String palavra;
	long tempo;
	
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	//metodo run implementado para a classe Thread PingPong
	public void run(){
		for(int i=0; i<5; i++){
		try {
			System.out.print(palavra + ",   ");
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
		
		//colocar a classe Thread para ser executada
		new PingPong("ping", 1500).start();//um segundo e meio
		new PingPong("pong", 4000).start();
		
		System.out.println("Ver Thread");
		
	}
}
