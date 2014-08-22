package br.com.xti.poo.classes.modelos;

import java.io.Serializable;

public class Conta implements Serializable {

	
	private String cliente;
	private double saldo;
	
	//para testar reflection
	public String sobrenome;
	public double total;
	
	//transient private double saldo; // impede a serializa��o e grava��o da informa��o, para o caso de serializa��o
	
	
	public Conta(){}
	
	public Conta(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void exibeSaldo(){
		
	//System.out.println(cliente + " seu saldo � " + saldo );	
		System.out.println(this.getCliente() + " seu saldo � " + this.getSaldo() );
	}
	
	public void saca(double valor){
		// deduzir do saldo o valor do saque
		//saldo = saldo - valor;
		saldo -= valor;
		
		//ver se tem autoriza��o para saque
		//se o limite do dia n�o foi ultrapassado
		// se tem saldo na conta
		//atualizar registros do banco
		//entregar o dinheiro ao cliente
	}
	
	public void deposita(double valor){
		
		saldo += valor;
	}
	
	public void transferePara(Conta destino, double valor){
		
		//saca da conta atual e deposita na conta de destino
		//conta atual utilizo this
		this.saca(valor);
		destino.deposita(valor);
		
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
