package br.com.xti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//representar� a estrutura padr�o do cabe�alho
//@interface - indica que Cabecalho � uma anota��o
@Documented // a anota��o precisa ser documentada pelo javadoc, ou seja apare�a na documenta��o do javadoc
@Target(ElementType.TYPE)//o unico elemento que pode receber este tipo de anota��o � TYPE-Classe, ou seja os metodos n�o poder�o utilizar este tipo de anota��o
public @interface Cabecalho {
	
	//criar os atributos da anota��o
	//dentro da anota��o n�o podem ser 
	//utilizados tipos que n�o sejam primitivos de dados
	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1; //definindo valor padr�o
	
	
	

}
