package br.com.xti.threads;

public class PonteTest {

	public static void main(String[] args) {
		
/*//NÃO SINCRONIZADA
		//Interface   // classe concreta
		Ponte ponteNaoSincronizada = new PonteNaoSincronizada();
		//multiplas threads
		
		//cria Thread produtora
		new Thread(new Produtor(ponteNaoSincronizada)).start();
		
		//cria Thread consumidora
		new Thread(new Consumidor(ponteNaoSincronizada)).start();*/
		
		
		//SINCRONIZADA
				//Interface   // classe concreta
				Ponte ponteSincronizada = new PonteSincronizada();
				//multiplas threads
				
				//cria Thread produtora
				new Thread(new Produtor(ponteSincronizada)).start();
				
				//cria Thread consumidora
				new Thread(new Consumidor(ponteSincronizada)).start();

		
		
	}
	
	

}
