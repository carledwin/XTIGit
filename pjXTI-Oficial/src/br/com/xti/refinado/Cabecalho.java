package br.com.xti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//representará a estrutura padrão do cabeçalho
//@interface - indica que Cabecalho é uma anotação
@Documented // a anotação precisa ser documentada pelo javadoc, ou seja apareça na documentação do javadoc
@Target(ElementType.TYPE)//o unico elemento que pode receber este tipo de anotação é TYPE-Classe, ou seja os metodos não poderão utilizar este tipo de anotação
public @interface Cabecalho {
	
	//criar os atributos da anotação
	//dentro da anotação não podem ser 
	//utilizados tipos que não sejam primitivos de dados
	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1; //definindo valor padrão
	
	
	

}
