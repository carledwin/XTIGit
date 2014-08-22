package br.com.xti.erros.exception;


//todas as exceções criadas por vc, devem estender da classe Exception
//esta classe será transformada em Exceção "checked" - verificadas
//Exception estende de Throwable que possui o metodo getMessage() alimentado por uma String
public class SenhaInvalidaException extends Exception{

	//utilizada numa aplicação para autenticação de usuario
	public  SenhaInvalidaException(String mensagem){
		super(mensagem);//chamada ao metodo construtor de exception que receberá o parametro de String
	}
}
