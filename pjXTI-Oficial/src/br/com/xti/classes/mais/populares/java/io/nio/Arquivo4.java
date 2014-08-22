package br.com.xti.classes.mais.populares.java.io.nio;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/xti/XTI/files/texto.txt");
		
		System.out.println(Files.exists(path)); //Caminho existe?
		System.out.println(Files.isDirectory(path));//� um diretorio?
		System.out.println(Files.isRegularFile(path));//� um arquivo regular (texto, imagem...)?
		System.out.println(Files.isReadable(path));////Pode ser lido pelo usuario?
		System.out.println(Files.isExecutable(path));//Pode ser executado?
		System.out.println(Files.size(path));//O tamanho do arquivo
		System.out.println(Files.getLastModifiedTime(path));//ultima vez que o arquivo foi modificado
		System.out.println(Files.getOwner(path));//o dono do arquivo, adminstrador do computador
		System.out.println(Files.probeContentType(path));//retorna o tipo do arquivo, texto, flash...
		
		
		/*DELETE FILE*/
		//Tenta excluir mesmo que o arquivo n�o exista e caso n�o encontre ou o diretorio n�o estiver vazio, lan�a exce��es:
		/*NoSuchFileException -> se o arquivo n�o exist
		DirectoryNotEmptyException -> diretorio n�o est� vazio*/
		//Files.delete(path);
		/*
		//Exclui o arquivo somente se o mesmo existir - caso n�o exista n�o lan�a exception
		try{
			Files.deleteIfExists(path);
			System.out.println("arquivo excluido com sucesso.");
			
		} catch (Exception e) {
			System.out.println("Erro ao tentar excluir arquivo");
			e.printStackTrace();
		}
		 */
		
		/*CREATE FILE*/
		
		//new file
		Path newFilePath = Paths.get("C:/xti/XTI/files/fonte.txt");
		/*
		try{
		//caso o arquivo exista ser� excluido
		Files.deleteIfExists(newFilePath);
		System.out.println("Arquivo j� existe, ser� excluido!");
		System.out.println("Arquivo excluido com suceso e ser� recriado!");
		Files.createFile(newFilePath);
		System.out.println("Arquivo criado com sucesso!");
		
		//somente para textos curtos
		Files.write(newFilePath, "Meu texto curto".getBytes());
		System.out.println("Escrita no Arquivo realizada com sucesso!");
		
		}catch(Exception e){
			//java.nio.file.FileAlreadyExistsException
			System.out.println("Erro ao tentar criar arquivo");
			e.printStackTrace();
		}
	 */
		
	/*COPY FILE*/
	Path copyFilePath = Paths.get("C:/xti/XTI/files/copia2.txt");
	/*System.out.println("Preparando para efetuar a Copia do Arquivo...");
	Files.copy(newFilePath, copyFilePath, StandardCopyOption.REPLACE_EXISTING);//substitui a copia do arquivo caso ele exista
	System.out.println("Copia do Arquivo realizada com sucesso!");
	*/
	
	
	/*MOVER FILE*/
	Path moveFilePath = Paths.get("C:/xti/XTI/files/move/copia2.txt");
	
	/*CREATE DIRECTORY*/
	System.out.println("Preparando para criar o diretorio...");
	Files.createDirectories(moveFilePath.getParent());
	System.out.println("Diretorio criado com sucesso!");
	
	/*MOVE*/
	System.out.println("Preparando para mover o Arquivo para outro diretorio...");
	Files.move(copyFilePath, moveFilePath, StandardCopyOption.REPLACE_EXISTING);//substitui a copia do arquivo caso ele exista
	System.out.println("Arquivo movido para outro diretorio com sucesso!");
	
	
	
	}

}
