package br.com.xti.refinado;

import java.io.Serializable;

/*
 *Modelo tradicional de documenta��o 
 *cabe�alho tipico das empresas 
 *esta forma de comentario gera uma serie de 
 *dificuldades para ferramentas de processamento automatico
 *
 * maneira mais inteligente de documentar dados que ser�o 
 * processados automaticamente � utilizando Anota��es annotations
 * 
 *   As anota��es apresentam as informa��es de maneira organizada
 *   e estruturada, que � mais acessivel ao processamento automatico 
 *   por ferramentas 
 * 
 * Isntitui��o: 	Universidade XTI
 * Projeto: 		Sistema de Avalia��es
 * data de Cria��o: 08/10/2011
 * Criador: 		Ricardo Lopes Soares
 * Revis�o: 		2
 * 
 */

//maneira mais indicada de criar o cabecalho padrao com anotation criada por n�s

@Cabecalho(instituicao =	"Universidade XTI",
			projeto = 		"Sistema de Avalia��es", 
			dataCriacao = 	"08/10/2011",
			criador = 		"Ricardo Lopes Costa", 
			revisao= 		2)
@ErrosCorrigidos(erros = {"0001","0002"}) //caso seja somente um erro, � poss�vel suprimir as chaves e colocar somente um String erros = "0001"
@ErrosCorrigidosValue("0001")//n�o h� a necessidade de informar o atributo por utilizar o value
//@SuppressWarnings("serial")//suprimir o erro serial, para o compilado
@SuppressWarnings({"serial","unused"})//suprimir o erro serial, e de variaveis n�o utilizadas
public class Anotacao implements Serializable{
	
	//esta anota��o pode ser colocada na variavel direto ou na classe
	//@SuppressWarnings("unused")//suprime o erro de variavel n�o utilizada
	private int x; //o compilador gera erro de variavel n�o utilizada
	
	
	//a implementa��o de Serializable obriga a implementa��o do id abaixo
	//private static final long serialVersionUID = 5278237143242957641L;
	
	//caso eu n�o o implemente(numero serial), o compilador retornar� um erro

	//anota��es especificas da linguagem java
	//este metodo n�o deve ser mais utilizado, ser� depreciado, nas proximas versoes do seu programa ele ser� eliminado
	@Deprecated//deprecando o metodo
	public void anotar(){}
	
	
	@Override // o metodo da classe pai, neste caso Object est� sendo sobreescrito
	public String  toString(){
		return null;
	}
	
	
	
	
	//

}
