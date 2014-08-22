package br.com.xti.erros;

public class TratamentoDeExcecoes {

	/*TRATAMENTO DE EXCEÇÕES
	 * 	Recurso utilizado para construir programas robustos e tolerantes a falhas em java
	 * 
	 * 
	 * EXCEPTION
	 * 	indicação de um problema ocorrido durante a exececução do programa
	 * 	execeção significa que o problema não ocorre frequentemente, ou seja é uma exceção a regra
	 * 
	 * DETALHAMENTO DE EXCEÇÕES - Exceções são objetos
	 *  - todas as exceções devem obrigatoriamente estender a classe  Throwable
	 *  - a classe Throwable estende da classe Object, esta classe possui uma variavel que é uma String 
	 *  que pode ser utilizada para descrever a exceção e pode ser recuperada esta informação atraves
	 *  do metodo getMessage()
	 *  - por convensão a maioria das Exceções que serão construidas por você devem estender a classe Exception,
	 *  que é uma classe de Throwable
	 *  -as exceções geramente são Exceções verificadas, ou seja, 'checked' - o compilador verica se os metodos 
	 *  lançam apenas exceções que eles mesmos declararam
	 *  
	 * * As exceções padrão estendem RuntimeException que vem de Exception ou da classe Error, ambas não são
	 *  verificadas ou 'checked'
	 *  
	 *  - ao tornar uma exceção checked, a mesma esta sendo documentada, aumentando a segurança assegurando 
	 *  que o tratador daquela exceção irá trata-la
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * com o tratamento de exceção o programa pode continuar executando ao inves de encerrar,
	 * auxilia na robustes do programa desenvolvido, colaborando para a computação de missão critica
	 * 
	 * 
	 * Estuturas para tratar exceções
	 * 
	 * TRY - tente executar
	 * 
	 * 
	 * CATCH - capture o erro, informe o tipo de erro que está sendo capturado no bloco/estrutura
	 * 
	 * 
	 * FINALLY - executado independente se teve ou não erro no try/catch, basta ter um try e finally
	 * o finally sempre sera executado
	 * 	Utilizado normalmente para limpar as variaveis, fechar conexões, strings de dados ...
	 *  Pode ter um bloco try/finally somente
	 *  
	 *  
	 *  
	 *  MULTI CATCH - é a possibilidade de tratar varios tipos de exceções no mesmo bloco catch
	 *  a partir da versão 7
	 *  
	 *  
	 *  STACKTRACE - pilha de erros, um erro pode começar em uma classe e ser propagado para outras,
	 *  permite verificar as mensagens de erro e por onde passaram as exceções
	 *  Ex: 
	 *  e2.printStackTrace() - imprime a pilha de erros encontrada nesta exception.
	 *  e2.getStackTrace() - captura apenas o stackTrace, onde é recebido um array de stackTrace, dos erros
	 *  identificados, para um tratamento.
	 *  e2.getMessage() - retorna uma mensagem com mensagens de erros no formato String
	 *  
	 *  
	 *  THROWS - 
	 *  
	 *  
	 *  EXCEÇÕES COMUNS - 
	 * 
	 */
	
}
