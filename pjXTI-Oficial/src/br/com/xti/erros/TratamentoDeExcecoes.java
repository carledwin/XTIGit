package br.com.xti.erros;

public class TratamentoDeExcecoes {

	/*TRATAMENTO DE EXCE��ES
	 * 	Recurso utilizado para construir programas robustos e tolerantes a falhas em java
	 * 
	 * 
	 * EXCEPTION
	 * 	indica��o de um problema ocorrido durante a exececu��o do programa
	 * 	exece��o significa que o problema n�o ocorre frequentemente, ou seja � uma exce��o a regra
	 * 
	 * DETALHAMENTO DE EXCE��ES - Exce��es s�o objetos
	 *  - todas as exce��es devem obrigatoriamente estender a classe  Throwable
	 *  - a classe Throwable estende da classe Object, esta classe possui uma variavel que � uma String 
	 *  que pode ser utilizada para descrever a exce��o e pode ser recuperada esta informa��o atraves
	 *  do metodo getMessage()
	 *  - por convens�o a maioria das Exce��es que ser�o construidas por voc� devem estender a classe Exception,
	 *  que � uma classe de Throwable
	 *  -as exce��es geramente s�o Exce��es verificadas, ou seja, 'checked' - o compilador verica se os metodos 
	 *  lan�am apenas exce��es que eles mesmos declararam
	 *  
	 * * As exce��es padr�o estendem RuntimeException que vem de Exception ou da classe Error, ambas n�o s�o
	 *  verificadas ou 'checked'
	 *  
	 *  - ao tornar uma exce��o checked, a mesma esta sendo documentada, aumentando a seguran�a assegurando 
	 *  que o tratador daquela exce��o ir� trata-la
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * com o tratamento de exce��o o programa pode continuar executando ao inves de encerrar,
	 * auxilia na robustes do programa desenvolvido, colaborando para a computa��o de miss�o critica
	 * 
	 * 
	 * Estuturas para tratar exce��es
	 * 
	 * TRY - tente executar
	 * 
	 * 
	 * CATCH - capture o erro, informe o tipo de erro que est� sendo capturado no bloco/estrutura
	 * 
	 * 
	 * FINALLY - executado independente se teve ou n�o erro no try/catch, basta ter um try e finally
	 * o finally sempre sera executado
	 * 	Utilizado normalmente para limpar as variaveis, fechar conex�es, strings de dados ...
	 *  Pode ter um bloco try/finally somente
	 *  
	 *  
	 *  
	 *  MULTI CATCH - � a possibilidade de tratar varios tipos de exce��es no mesmo bloco catch
	 *  a partir da vers�o 7
	 *  
	 *  
	 *  STACKTRACE - pilha de erros, um erro pode come�ar em uma classe e ser propagado para outras,
	 *  permite verificar as mensagens de erro e por onde passaram as exce��es
	 *  Ex: 
	 *  e2.printStackTrace() - imprime a pilha de erros encontrada nesta exception.
	 *  e2.getStackTrace() - captura apenas o stackTrace, onde � recebido um array de stackTrace, dos erros
	 *  identificados, para um tratamento.
	 *  e2.getMessage() - retorna uma mensagem com mensagens de erros no formato String
	 *  
	 *  
	 *  THROWS - 
	 *  
	 *  
	 *  EXCE��ES COMUNS - 
	 * 
	 */
	
}
