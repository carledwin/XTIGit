package br.com.xti.classes.mais.populares.java.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException{
		
		//todas as classes citadas abaixo extends de Object
		
		//Paths
		
		//define os caminhos
		//Paths - cria o caminho - chamada ao arquivo mesmo que n�o exista
		//a manipula��o � realizada no java.nio antigamente no java.io
		//Path incluida no java 7 antigamente era feita com a classe File
		//no linux a raiz come�a com / e n�o C:
		Path path = Paths.get("C:/xti/XTI/files/texto.txt");

		//retorna o caminho absoluto do arquivo
		System.out.println(path.toAbsolutePath());
		
		//Caminho pai do arquivo
		System.out.println(path.getParent());
		
		//retorna a raiz do sistema
		System.out.println(path.getRoot());
		
		//retorna o nome do arquivo
		System.out.println(path.getFileName());
		
		

		//Files
		
		/* CRIA��O DO DIRETORIO PARA GERAR O ARQUIVO*/
		//para manipula��o de arquivos
		Files.createDirectories(path.getParent());

		//Para arquivos curtos - Caracteres		
		/*CRIAR / ESCREVER E LER ARQUIVOS*/
		byte[] bytes = "Meu Texto".getBytes();
		Files.write(path, bytes);//.write -> cria o arquivo caso ele n�o exista, abre, limpa, escreve e fecha o mesmo,
								//indicado para arquivos pequenos
		
		System.out.println("Arquivo criado com sucesso!");
		
		//Para arquivos curtos - Caracteres
		/*LER ARQUIVOS*/
		byte[] retorno = Files.readAllBytes(path);//readAllBytes -> retorna um conjunto de bytes
		System.out.println("Sistema preparando para ler o arquivo...\n");
		System.out.println("Arquivo: >>>**************************************************   \n");
		System.out.println(new String(retorno));
		System.out.println("\nFim do Arquivo: >>>*****************************************   ");
		System.out.println("\n Arquivo lido com sucesso!");
		
		
		
		
		//Streams - sequencias ordenadas de dados que possuem uma origem ou um destino
		
				//Streams para manipula��o de Bytes - para arquivos n�o legiveis por ser humano ex: video, imagens..., 
				//precisam ser processados 
					//InputStream
						//FileInputStream
						//FilterInputStream
					//OutputStream
						//FileOutputStream
						//FilterOutputStream
				
				//Streams para manipula��o de Caracteres - para arquivos legiveis por ser humano ex: texto, codigo fonte...
					//Reader
						//BufferedReader
						//InputStreamReader
					//Writer
						//BufferedWriter
						//PrintWriter
						//OutputStreamWriter
				
		
	}

}
