package br.com.xti.poo.polimorfismo;

public class InterfacesJavaPolimorfismo {

	/*DIFERENCAS ENTRE INTERFACES X CLASSES ABSTRATAS(100% ABSTRATO)
	 * interface:
	 * 		é semelhante a uma classe - utiliza a palavra chave interface
	 * 		as interfaces são 100% abstratas
	 * 		São utilizadas para padronizar as interações das aplicações
	 * 		Exemplo - controle de um rádio - interface
	 * 
	 * 
	 * PADRONIZAÇÃO DE INTERAÇOES(CONTROLE DE RÁDIO)
	 * 		o mesmo permite que o usuario realize somente algums ações, interações, faz a interface
	 * 		entre o radio e o usuario para mudar estação, ajuste de volume...
	 * 		Os diferentes radios podem implementar os controles do radio (tipo radio) de maneira diferente
	 * 		atraves de um contrato (interface) que define quais controles existem em um radio, e todos 
	 * 		que implementarem radio deverão implementar no minimo os controles defindos na interface - radio, 
	 * 		mas não define como deverão ser implementados estes controles (metodos).
	 * 
	 * 		Todos os métodos serão implementados pela classe que implementar aquela classe
	 * 
	 * metodos:
	 * 		dentro de uma interface só podem ser declarados metodos abstratos
	 * 		somente metodos abstratos são permitidos
	 *		não existe a necessidade de declarar estes metodos como public abstract seria redundante, pois 
	 *		todos os metodos declarados dentro de uma interface são public abstract
	 *		public abstract double calculaArea();
	 *		é declarada somente a assinatura do metodo
	 *
	 * HERANCA MULTIPLA X HERANÇA SIMPLES
	 * 		com interface é permitido implementar varias interfaces, herdado de todas as interfaces
	 * 		variaveis e metodos
	 * 		ver exemplo: CuboHerancaMultipla 
	 * 
	 * RELACIONAMENTO DE TIPOS DISPARES(FORMAS E ANIMAIS)
	 *		uma interface é utilizada quando classes dispares(não relacionadas entre sí) precisam compartilhar
	 *		métodos e constantes comuns.
	 *		Permite que objetos de classes não relacionadas sejam processadas POLIMORFICAMENTE
	 *		INTERFACE TEM MUITO MAIS FLEXIBILIDADE QUE CLASSE ABSTRATA
	 *		Ex: GalinhaConcreta pode implementar AreaCalculavel para calcular a area de uma galinha ao 
	 *		desenvolver um jogo em java
	 *
	 *
	 *
	 *classes abstratas:
	 *		pode ter metodos abstratos, mas também implementar alguns metodos
	 * 		ao utilizar uma classe abstrata vc extends aquela classe, porém só é permitido estender uma classe,
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
	 * VARIAVEIS DE INTERFACES SÃO CONSTANTES
	 * 
	 */
	
}
