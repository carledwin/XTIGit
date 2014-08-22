package br.com.xti.poo.polimorfismo;

public class InterfacesJavaPolimorfismo {

	/*DIFERENCAS ENTRE INTERFACES X CLASSES ABSTRATAS(100% ABSTRATO)
	 * interface:
	 * 		� semelhante a uma classe - utiliza a palavra chave interface
	 * 		as interfaces s�o 100% abstratas
	 * 		S�o utilizadas para padronizar as intera��es das aplica��es
	 * 		Exemplo - controle de um r�dio - interface
	 * 
	 * 
	 * PADRONIZA��O DE INTERA�OES(CONTROLE DE R�DIO)
	 * 		o mesmo permite que o usuario realize somente algums a��es, intera��es, faz a interface
	 * 		entre o radio e o usuario para mudar esta��o, ajuste de volume...
	 * 		Os diferentes radios podem implementar os controles do radio (tipo radio) de maneira diferente
	 * 		atraves de um contrato (interface) que define quais controles existem em um radio, e todos 
	 * 		que implementarem radio dever�o implementar no minimo os controles defindos na interface - radio, 
	 * 		mas n�o define como dever�o ser implementados estes controles (metodos).
	 * 
	 * 		Todos os m�todos ser�o implementados pela classe que implementar aquela classe
	 * 
	 * metodos:
	 * 		dentro de uma interface s� podem ser declarados metodos abstratos
	 * 		somente metodos abstratos s�o permitidos
	 *		n�o existe a necessidade de declarar estes metodos como public abstract seria redundante, pois 
	 *		todos os metodos declarados dentro de uma interface s�o public abstract
	 *		public abstract double calculaArea();
	 *		� declarada somente a assinatura do metodo
	 *
	 * HERANCA MULTIPLA X HERAN�A SIMPLES
	 * 		com interface � permitido implementar varias interfaces, herdado de todas as interfaces
	 * 		variaveis e metodos
	 * 		ver exemplo: CuboHerancaMultipla 
	 * 
	 * RELACIONAMENTO DE TIPOS DISPARES(FORMAS E ANIMAIS)
	 *		uma interface � utilizada quando classes dispares(n�o relacionadas entre s�) precisam compartilhar
	 *		m�todos e constantes comuns.
	 *		Permite que objetos de classes n�o relacionadas sejam processadas POLIMORFICAMENTE
	 *		INTERFACE TEM MUITO MAIS FLEXIBILIDADE QUE CLASSE ABSTRATA
	 *		Ex: GalinhaConcreta pode implementar AreaCalculavel para calcular a area de uma galinha ao 
	 *		desenvolver um jogo em java
	 *
	 *
	 *
	 *classes abstratas:
	 *		pode ter metodos abstratos, mas tamb�m implementar alguns metodos
	 * 		ao utilizar uma classe abstrata vc extends aquela classe, por�m s� � permitido estender uma classe,
	 * 		ou seja vc vai herdar somente do pai desta classe a Super classe 
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * TIPO : UNIDADE FUNDAMENTAL DE PROJETO OO
	 * 
	 * 
	 * 
	 * VARIAVEIS DE INTERFACES S�O CONSTANTES
	 * 
	 */
	
}
