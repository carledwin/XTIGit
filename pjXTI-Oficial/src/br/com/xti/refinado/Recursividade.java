package br.com.xti.refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	
	
	/*10 + (10-1)*/
	/*10 + (9 + (8 + (7 + (6 + 5...))))*/
	//metodo recursivo
	public static int soma(int x){
		
		if(x == 0){
		return 0;
		}else{
			System.out.println(x);
			return x + soma(x-1);//a soma de todos os numeros é 55 para x = 10
		}
	}
	
	
	//RETORNA A POTENCIA DE UM NUMERO
	/* potencia(3,4) = 3 * 3 * 3 * 3      */
	public static int potencia(int x, int e){
		
		
		
		//divir o problema em duas partes
		
		//1 que agente sabe resolver
		//elevação elevado a 1 o resultado é o proprio numero
		if(e == 1){
			System.out.println(x);
			return x;
		}else{
			int y = x * potencia(x, e - 1);
			System.out.println(y);
			return y;
		}
		
		//2 que agente não sabe resolver
		
	}
	
	
	//listar o conteudo do diretorio recursivamente
	public static void listar(Path path){
		
		//é um arquivo regular
		if(Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		}else{
			//System.err.println(path.toAbsolutePath());//caminho completo
			
			//ou 
			String s = "\n" + path.toAbsolutePath();
			System.err.println(s.toUpperCase());
			
			//recuperar um directory stream
			try{ 
				DirectoryStream <Path> stream = Files.newDirectoryStream(path);
				
				for (Path path2 : stream) {
					//System.out.println(path2.toAbsolutePath()); // sem recursividade
					listar(path2);//com recursividade
				}
				
			}catch(Exception e){}
			
		}
		
		
		/*//é um diretorio
		if(Files.isDirectory(path)){
			
		}*/
	}
	
	public static void main(String[] args) {
		
		//System.out.println(soma(10));
		System.out.println(potencia(3,4));
		listar(Paths.get("C:\\xti"));
	}
}
