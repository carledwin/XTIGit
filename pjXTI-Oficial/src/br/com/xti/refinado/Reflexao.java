package br.com.xti.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {

	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//Reflexao-Reflection é utilizada em varios frameworks de pesistencia, camadas, integração...
		//um recurso muito utilizado por programadores proffisionais
		
		
		//reflexao para analizar a classe conta
		
		//recuperar o tipo de uma classe
		String nome = "br.com.xti.poo.classes.modelos.Conta";
		
		//construir uma classe a partir deste nome
		//o nome da classe que se deseja carregar aqui
		//lançará uma exception caso a classe seja encontrada
		Class classe = Class.forName(nome);
		
		//capturar o nome da classe
		System.out.println(classe.getSimpleName());
		
		//capturar os campos publicos da classe, retornará um array de fields
		Field[] f = classe.getFields();
		
		//exibindo os campos
		for (Field field : f) {
			System.out.println(field);
		}
		
		
		//analizar os metodos da classe, retornará todos metodos com qualquer tipo de modificador,
		//retornará um arrray de metodos.
		Method[] m = classe.getDeclaredMethods();
		
		for (Method method : m) {
			System.out.println(method.getName());
		}
		
		//recupera os construtores
		Constructor[] c = classe.getConstructors();
		
		for (Constructor constructor : c) {
			System.out.println(constructor.getName());
			
		}
		
		
		//criar objetos com reflexoes
		Object o = classe.newInstance();
		
		//recuperar metodo da classe - metodo que será utilizado, o tipo de retorno do metodo
		Method md = classe.getMethod("deposita", double.class);
		
		Method me = classe.getMethod("exibeSaldo");
		
		//invocar o metodo da classe
		md.invoke(o, 120);//objeto que irá utilizar para invocar o metodo e o argumento para o metodo
		me.invoke(o);//objeto que irá utilizar para invocar o metodo e o argumento para o metodo
		
		
		//gerear o construtor
		Constructor co = classe.getConstructor(String.class, double.class); //parametros string e double, que são os parametros do construtor de Conta
		
		//retornará uma nova instancia de objeto
		Object o2 = co.newInstance("Ricardo", 123_456_789);
		
		//invocar o metodo do objeto classe para exibir o saldo
		me.invoke(o2);
		
		
	}
}
