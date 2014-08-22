package br.com.xti.threads;



/**
 * A documentação é gerada pelo javadoc que vem junto com o JDK
 * 
 * Uma <code>Ponte</code> representa o elo de
 * ligação entre objetos Produtores e Consumidores
 * de Informações.  Os <i>Produtores</i> utilizam as 
 * Pontes para gravar informações e copartilhar
 * essas informações com os Consumidores que lêem
 * esses dados da Ponte para fazer o processamento.
 * 
 * marcas:
 * version - versão do codigo
 * since - desde qual versão do java esta classe irá funcionar
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
	

	//define a informação que será compartilhada
	/**
	 * Armazena o valor informado na ponte. Geralmente
	 * será chamado pelas classes Produtoras de dados.
	 * 
	 * marcas:
	 * param - informa os parametros sendo utilizados
	 * throws - informa os tipos de exceções que podem ser lançadas pelo metodo
	 * 
	 * @param value
	 * @throws InterruptedException
	 */
	public void set(int value) throws InterruptedException;
	
	//recupera a informação que foi commpartilhada
	/**
	 * Recupera a informação armazenada na ponte. Esse
	 * metedo será chamado pelas consumidoras de dados.
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;

}
