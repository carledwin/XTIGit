package br.com.xti.systemruntime;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	
	public static void main(String[] args) {
		
		
		//Class SYSTEM
		
		//como recuperar as propriedades/informaçoes do sistema operacional
		//Properties - coleção do tipo Map -  extends Hashtable<Object,Object>
		Properties p = System.getProperties();
		
		
		//capturar a versao do java
		System.out.println(p.getProperty("java.version"));
		
		//definir - criar uma nova propriedades no sistema
		p.setProperty("xti.curso.java.version", "1.0.0");
		System.out.println(p.getProperty("xti.curso.java.version"));
		
		
		//coleção Set sem duplicidade das chaves
		//Consultar todas as (chaves) propriedades  do Sistema 
		Set<Object> pk = p.keySet();
		
		
		//exibir todas as propriedades do sistema utilizando as chaves retornadas 
		for(Object key : pk){
			System.out.println(key + " = " + p.get(key));
		}
		
		
		//recuperar um objeto do tipo CONSOLE
		Console c = System.console();// reperar uma senha de um usuario, por
									//exemplo- sem que exponha a mesma, o que não é possível com a classe Scanner
									//nem todo o sistema operacional disponibiliza o console, ou algumas regras de 
									//segurança podem bloquear o console também
		
		//ler uma linha de informação do sistema
		System.out.println("Entre com as informações solicitadas:");
		System.out.println("Usuario: ");
		String user = c.readLine();
		System.out.println("Senha: ");
		char[] pass = c.readPassword();//retorna um char[] array de char
		System.out.println("Usuario= " + user + "  Senha= " + new String(pass));
		
		
		//teste via prompt de comando
		//acessar a pasta bin o projeto
		//java
		//nome da classe
		//C:\xti\kepler\pjXTI-Oficial\bin>java br.com.xti.systemruntime.Sistemas
		
		//o teste será pedir um usuario que será visto via console -  c.readLine()
		//será solicitada uma senha que não será exibida na hora que 
		//estiver sendo digitada - o que é a grande vantagem do CONSOLE - c.readPassword()
		
		
		
		
		
		//Class RUNTIME
		
		//permite que você execute um programa diretamente no sistema operacional
		
		try {
			//Runtime.getRuntime().exec(""); //este metodo permite executar um programa da mesma forma 
											//como é realizado via CMD prompt de comando
			
			Runtime.getRuntime().exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
