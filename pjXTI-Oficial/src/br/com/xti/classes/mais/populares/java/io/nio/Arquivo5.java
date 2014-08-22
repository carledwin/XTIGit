package br.com.xti.classes.mais.populares.java.io.nio;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		
		
		/*LISTA DE DIRETORIOS RAIZ*/
		//retorna o fileSystem default do sistema operacional
		//para recuperar os diretorios raiz do computador
		/*Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories(); 
		for (Path path : dirs) {
			System.out.println(path);
		}*/

		/*LISTA DE CONTEUDO DE UM DIRETORIO*/
		Path dir = Paths.get("C:/xti/XTI/");
		
		//Recuperar Stream de directorios
		/*try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
			
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
			
		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}*/
		
		/*PARIÇÕES DO COMPUTADOR*/
		FileSystem fs = FileSystems.getDefault();
		
		//Recuperar as unidades de armazenamento
		
		for (FileStore store : fs.getFileStores()) {
			System.out.println("Unidade: " + store.toString());
			System.out.println("Total: " + store.getTotalSpace());
			System.out.println("Em Uso: " + (store.getTotalSpace() - store.getUsableSpace()));
			System.out.println("Disponível: " + store.getUsableSpace());
			System.out.println();
		}
		
		
		
	}

}
