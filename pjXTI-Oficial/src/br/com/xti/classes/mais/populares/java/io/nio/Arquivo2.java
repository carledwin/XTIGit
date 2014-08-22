package br.com.xti.classes.mais.populares.java.io.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Arquivo2 {
	
	public static void main(String[] args) throws IOException{
		
		
		Path path = Paths.get("C:/xti/XTI/files/texto2.txt");
		
		//escritor de arquivos writer / caminho -path e char-set- codificação
		Charset charSet = StandardCharsets.UTF_8;
		BufferedWriter writer = null;
		
		//Antes do java 7
		/*try{
		//Stream para manipulação de arquivos - Writer->escritor e Buffer->repositorio de dados
		writer = Files.newBufferedWriter(path, charSet);
		writer.write("Texto ");//o arquivo se mantem aberto 
		writer.write("incluido ");//e varias partes do texto podem
		writer.write("em varias linhas.");//ser incluidas
		writer.flush();//flush -> captura os dados do arquivo em memoria e salva o arquivo em disco
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(writer != null){
				writer.close();//fecha o arquivo
			}
		}*/
	
		
		//Para arquivos longos - Caracteres
		/*ESCRITA EM ARQUIVOS*/
		//A partir do java 7
		//inicialização das variaveis dentro do try
		//Stream para manipulação de arquivos - Writer->escritor e Buffer->repositorio de dados
		try(BufferedWriter writer_7 = Files.newBufferedWriter(path, charSet)){
		
		writer_7.write("Texto2 ");//o arquivo se mantem aberto 
		writer_7.write("incluido ");//e varias partes do texto podem
		writer_7.write("em varias linhas.");//ser incluidas
		//o flush é executado automaticamente e o metodo .close automaticamente chama o .flush
		//writer.flush();//flush -> captura os dados do arquivo em memoria e salva o arquivo em disco
		}catch(IOException e){
			e.printStackTrace();
			
		//todas as classes que implementam Closable	são automaticamente fechados, por ser inicializado no try
		//o compilador cria este finally
		//este bloco não é mais necessario, pois ao terminar a execução deste bloco o arquivo é fechado
/*		}finally{
			if(writer != null){
				writer.close();//fecha o arquivo
			}
		}
*/		}

		//Para arquivos longos - Caracteres
		/*LEITURA*/
		try(BufferedReader reader_7 = Files.newBufferedReader(path, charSet)){
			
			String line = null;
			//le linha por linha
			while((line = reader_7.readLine()) != null){
			System.out.println(line);	
			}
		}catch(IOException e){
				e.printStackTrace();
			}
			
		}

}
