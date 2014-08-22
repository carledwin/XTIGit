package br.com.model;

public class Transferencia {

	private int id;
	private String nome;
	private Transferencia transferencia;
	
	public Transferencia(){}
	
	public Transferencia(int id, String nome, Transferencia transferencia) {
		this.id = id;
		this.nome = nome;
		this.transferencia = transferencia;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Transferencia getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}
	
	
	
}
