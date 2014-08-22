package br.com.xti.erros.exception;


//todas as exce��es criadas por vc, devem estender da classe Exception
//esta classe ser� transformada em Exce��o "checked" - verificadas
//Exception estende de Throwable que possui o metodo getMessage() alimentado por uma String
public class SenhaInvalidaException extends Exception{

	//utilizada numa aplica��o para autentica��o de usuario
	public  SenhaInvalidaException(String mensagem){
		super(mensagem);//chamada ao metodo construtor de exception que receber� o parametro de String
	}
}
