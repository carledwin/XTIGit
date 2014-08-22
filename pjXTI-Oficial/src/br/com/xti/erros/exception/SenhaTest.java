package br.com.xti.erros.exception;

public class SenhaTest {

	
	//verifica se a senha informada � igual a senha correta
	//dar� erro, pois esta exce��o � verificada em tempo de compila��o, desta forma
	//� necessario declara-la na assinatura do metodo
	//static void autenticar(String senha){
	static void autenticar(String senha) throws SenhaInvalidaException{
		if("123".equals(senha)){
			//autenticado
			System.out.println("Autenticado");
		}else{
			//senha incorreta
			//throw - lan�a uma exce��o
			//dar� erro, pois esta exce��o � verificada em tempo de compila��o, desta forma
			//� necessario declara-la no metodo
			throw new SenhaInvalidaException("Senha incorreta");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			//autenticar("123");
			autenticar("1234");
		} catch (SenhaInvalidaException e) {
			//tamb�m suporta printStackTrace que tras a pila de erros mostrando onde iniciou o erro, propagando por onde o erro passou
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

}
