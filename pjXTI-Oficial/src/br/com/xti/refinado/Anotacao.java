package br.com.xti.refinado;

import java.io.Serializable;

/*
 *Modelo tradicional de documentação 
 *cabeçalho tipico das empresas 
 *esta forma de comentario gera uma serie de 
 *dificuldades para ferramentas de processamento automatico
 *
 * maneira mais inteligente de documentar dados que serão 
 * processados automaticamente é utilizando Anotações annotations
 * 
 *   As anotações apresentam as informações de maneira organizada
 *   e estruturada, que é mais acessivel ao processamento automatico 
 *   por ferramentas 
 * 
 * Isntituição: 	Universidade XTI
 * Projeto: 		Sistema de Avaliações
 * data de Criação: 08/10/2011
 * Criador: 		Ricardo Lopes Soares
 * Revisão: 		2
 * 
 */

//maneira mais indicada de criar o cabecalho padrao com anotation criada por nós

@Cabecalho(instituicao =	"Universidade XTI",
			projeto = 		"Sistema de Avaliações", 
			dataCriacao = 	"08/10/2011",
			criador = 		"Ricardo Lopes Costa", 
			revisao= 		2)
@ErrosCorrigidos(erros = {"0001","0002"}) //caso seja somente um erro, é possível suprimir as chaves e colocar somente um String erros = "0001"
@ErrosCorrigidosValue("0001")//não há a necessidade de informar o atributo por utilizar o value
//@SuppressWarnings("serial")//suprimir o erro serial, para o compilado
@SuppressWarnings({"serial","unused"})//suprimir o erro serial, e de variaveis não utilizadas
public class Anotacao implements Serializable{
	
	//esta anotação pode ser colocada na variavel direto ou na classe
	//@SuppressWarnings("unused")//suprime o erro de variavel não utilizada
	private int x; //o compilador gera erro de variavel não utilizada
	
	
	//a implementação de Serializable obriga a implementação do id abaixo
	//private static final long serialVersionUID = 5278237143242957641L;
	
	//caso eu não o implemente(numero serial), o compilador retornará um erro

	//anotações especificas da linguagem java
	//este metodo não deve ser mais utilizado, será depreciado, nas proximas versoes do seu programa ele será eliminado
	@Deprecated//deprecando o metodo
	public void anotar(){}
	
	
	@Override // o metodo da classe pai, neste caso Object está sendo sobreescrito
	public String  toString(){
		return null;
	}
	
	
	
	
	//

}
