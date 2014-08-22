package br.com.xti.poo.encapsulamento;

public class FuncionarioEncapsulamento {

	
	
	//outras classes n�o podem acessar diretamente esta vari�vel
	//ser� necess�rio disponibilizar um m�todo que permite acesso ao valor da vari�vel
	private String nome;
	
	private boolean ativo;
	
	//get recupera��o
	//is  recupera��o
	//set configura��o
	
	
	//captura o valor
	public String getNome(){
		//retorna a vari�vel protegida 
		return nome;
	}
	
	//n�o returna nenhum valor
	//altera o valor da vari�vel
	public void setNome(String nome){
		//this a vari�vel desta classe recebe o valor passado por parametro
		this.nome = nome;
	}
	
	//para vari�veis boolean n�o se utiliza get mas sim is
	public boolean isAtivo(){
		return ativo;
	}
	
	public void setAtivo(boolean ativo){
		
		this.ativo = ativo;
	}
	
}
