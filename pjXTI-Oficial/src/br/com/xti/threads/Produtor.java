package br.com.xti.threads;

import java.util.Random;


//rodar� v�rias threads e inclui -r� informa��es
public class Produtor implements Runnable{


	private Ponte ponte;
	private Random random = new Random();
	
	public Produtor(Ponte ponte){
		this.ponte = ponte;
	}
	
	
	//gera informa��es para adicionar na ponte
	@Override
	public void run() {
		
		//variavel local, somando o total de numeros
		int total = 0;
		
		//armazenar 5 vezes o valor na ponte
		for(int i=0; i<5; i++){
			try {
				
				//define um tempo para guardar, para dormir um periodo determinado
				//tempo aleatorio entre 0 e 3 segundos
				Thread.sleep(random.nextInt(3000));//millisecundos
				//somente para controle
				total+=i;
				ponte.set(i);//seta informa��es na ponte
				System.out.println("\t" + total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
