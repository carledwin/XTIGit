package br.com.xti.refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


//Representa erros corrigidos na classe
@Target({ElementType.TYPE, ElementType.METHOD})//esta anotation está restrita para ser utilizada em classes e metodos
public @interface ErrosCorrigidos {

	String[] erros();
}
