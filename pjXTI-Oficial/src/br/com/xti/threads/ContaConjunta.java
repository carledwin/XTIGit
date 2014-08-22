package br.com.xti.threads;

public class ContaConjunta {

	private int saldo = 100;
	
	public int getSaldo(){
		return saldo;
	}
	
	//desta forma o metodo causar� estouro no saldo da conta, 
	//pois continuar� realizando saques mesmo sem saldo 
	//public void sacar(int valor, String cliente){
	
	//modificador-> synchronized para bloquear o metodo enquanto uma Thread estiver utilizando-o,
	//utilizar em blocos, if, for, methodos - para que as threads n�o interfiram, umas nas outros
	//o metodo passar� a ser bloqueado at� que a Thread que o utiliza termine de executar,
	//somente ap�s isto uma outra Thread poder� iniciar a execu��o do mesmo.
	public synchronized void sacar(int valor, String cliente){
		if(saldo >= valor){
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar ");
			try {
				System.out.println(" esperando ");
				Thread.sleep(1000);//aguardando o processamento
			} catch (InterruptedException e) {} 
			saldo -= valor;
			String msg = cliente + " SACOU " + valor
					+ " [Saldo Original= " + saldoOriginal + ", Saldo Final= "+ saldo + "] ";
			System.out.println(msg);
		}else{
			System.out.println(" Saldo insuficiente para " + cliente);
		}
	}
}
