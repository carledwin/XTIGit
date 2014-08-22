package br.com.xti.poo.encapsulamento;

public class FuncionarioEncapsulamento {

	
	
	//outras classes não podem acessar diretamente esta variável
	//será necessário disponibilizar um método que permite acesso ao valor da variável
	private String nome;
	
	private boolean ativo;
	
	//get recuperação
	//is  recuperação
	//set configuração
	
	
	//captura o valor
	public String getNome(){
		//retorna a variável protegida 
		return nome;
	}
	
	//não returna nenhum valor
	//altera o valor da variável
	public void setNome(String nome){
		//this a variável desta classe recebe o valor passado por parametro
		this.nome = nome;
	}
	
	//para variáveis boolean não se utiliza get mas sim is
	public boolean isAtivo(){
		return ativo;
	}
	
	public void setAtivo(boolean ativo){
		
		this.ativo = ativo;
	}
	
}
