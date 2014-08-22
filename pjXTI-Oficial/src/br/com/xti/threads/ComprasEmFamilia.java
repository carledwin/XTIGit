package br.com.xti.threads;

//transformando a classe em um objeto Runnable
public class ComprasEmFamilia implements Runnable{

	ContaConjunta conta = new ContaConjunta();
	
	//metodo obrigatorio implementado
	@Override
	public void run() {
		
		//recuperar a Thread corrente, em execução
		String cliente = Thread.currentThread().getName();
		
		//poderá realizar 5 compras, quem comprar primeiro
		for(int i=0; i<5; i++){
		conta.sacar(20, cliente);
		
		if(conta.getSaldo() < 0){
			System.out.println("Estourou");
		}
		}
		
	}
	
	public static void main(String[] args){
		
		//Todos utilizando o mesmo cartão, com o saldo inicial de 100
		
		//criando objeto Runnable
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		
		//Threads criadas, mas para serem executadas necessitam de 
		//um metodo run implementado no objeto Runnable
		new Thread(irAsCompras, "Pai").start(); //Thread 01
			new Thread(irAsCompras, "Mãe").start(); //Thread 01
				new Thread(irAsCompras, "Filha").start(); //Thread 01
					new Thread(irAsCompras, "Babá").start(); //Thread 01
		
	}

}
