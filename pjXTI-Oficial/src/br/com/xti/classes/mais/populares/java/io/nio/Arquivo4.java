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
		System.out.println(Files.isDirectory(path));//É um diretorio?
		System.out.println(Files.isRegularFile(path));//É um arquivo regular (texto, imagem...)?
		System.out.println(Files.isReadable(path));////Pode ser lido pelo usuario?
		System.out.println(Files.isExecutable(path));//Pode ser executado?
		System.out.println(Files.size(path));//O tamanho do arquivo
		System.out.println(Files.getLastModifiedTime(path));//ultima vez que o arquivo foi modificado
		System.out.println(Files.getOwner(path));//o dono do arquivo, adminstrador do computador
		System.out.println(Files.probeContentType(path));//retorna o tipo do arquivo, texto, flash...
		
		
		/*DELETE FILE*/
		//Tenta excluir mesmo que o arquivo não exista e caso não encontre ou o diretorio não estiver vazio, lança exceções:
		/*NoSuchFileException -> se o arquivo não exist
		DirectoryNotEmptyException -> diretorio não está vazio*/
		//Files.delete(path);
		/*
		//Exclui o arquivo somente se o mesmo existir - caso não exista não lança exception
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
		//caso o arquivo exista será excluido
		Files.deleteIfExists(newFilePath);
		System.out.println("Arquivo já existe, será excluido!");
		System.out.println("Arquivo excluido com suceso e será recriado!");
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
