package br.com.xti.threads;

public class PonteNaoSincronizada implements Ponte{

	private int valor = -1;
	
	//utilizado pelo PRODUTOR
	@Override
	public void set(int value) throws InterruptedException {
		System.out.print(" Produziu: " + valor);
		this.valor = value;
	}

	//utilizado pelo CONSUMIDOR
	@Override
	public int get() throws InterruptedException {
		System.err.println(" Consumiu: " + valor);
		return valor;
	}

}
