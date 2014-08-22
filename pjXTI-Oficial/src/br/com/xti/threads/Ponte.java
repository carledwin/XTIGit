package br.com.xti.threads;



/**
 * A documenta��o � gerada pelo javadoc que vem junto com o JDK
 * 
 * Uma <code>Ponte</code> representa o elo de
 * liga��o entre objetos Produtores e Consumidores
 * de Informa��es.  Os <i>Produtores</i> utilizam as 
 * Pontes para gravar informa��es e copartilhar
 * essas informa��es com os Consumidores que l�em
 * esses dados da Ponte para fazer o processamento.
 * 
 * marcas:
 * version - vers�o do codigo
 * since - desde qual vers�o do java esta classe ir� funcionar
 * author - autor do codigo
 * see - indicar classes que implementam esta interface
 * 
 * 
 * @author Carl Edwin
 * @author Segundo autor
 * @version 1.3
 * @since 1.0
 *
 *@see - PonteNaoSincronizada
 *@see - PonteSincronizada
 *
 *
 */

public interface Ponte {
	

	//define a informa��o que ser� compartilhada
	/**
	 * Armazena o valor informado na ponte. Geralmente
	 * ser� chamado pelas classes Produtoras de dados.
	 * 
	 * marcas:
	 * param - informa os parametros sendo utilizados
	 * throws - informa os tipos de exce��es que podem ser lan�adas pelo metodo
	 * 
	 * @param value
	 * @throws InterruptedException
	 */
	public void set(int value) throws InterruptedException;
	
	//recupera a informa��o que foi commpartilhada
	/**
	 * Recupera a informa��o armazenada na ponte. Esse
	 * metedo ser� chamado pelas consumidoras de dados.
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;

}
