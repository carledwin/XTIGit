package br.com.xti.classes.mais.populares.java.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import br.com.xti.poo.classes.modelos.Conta;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		Quando se trabalha com serialização, o que é serializado são as variaveis do objeto, 
		ou seja variveis com codificador static não serão serializados pois pertencem a classe e
		não ao objeto.
		Existe ainda a possibilidade de não armazenar a variavel de um objeto, exemplo senha..., para
		isto utilize o modificador transient*/
		
		
		//Serialização perimite que o programa salve o objeto e todas as variáveis de intancia
		
		//Serialização só pode ser feita em objetos serializados que implementam Serializable
		
		//Serializar Contas
		//Caso a classe nao implemente serializable será lançada a exception java.io.NotSerializableException
		Conta conta1 = new Conta("XTI", 111_222_333.444);
		Conta conta2 = new Conta("BIR", 111_222_333.444);
		
		//Array é um objeto serializado
		String[] nomes = {"Ricardo","Beatriz","Sandra"};
		
		Path path = Paths.get("C:/xti/XTI/files/serializados/objeto.ser");
		
		Path path1 = Paths.get("C:/xti/XTI/files/serializados/conta.ser");
		
		Files.createDirectories(path.getParent());
		
		/*ESCRITA DE OBJETO COM MANIPULAÇÃO DE BYTES*/
		//recebe o endereco do arquivo para a escrita do arquivo
		FileOutputStream  fos = new FileOutputStream(path.toString());
		FileOutputStream  fos1 = new FileOutputStream(path1.toString());
		
		/*utiliza o FileOutputStream para gravar*/
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		
		//grava o objeto serializavel
		oos.writeObject(nomes);//converte as informaçoes em byte code
		
		//para gravar mais de um objeto basta chamar o metodo writeObject varias vezes
		oos1.writeObject(conta1);//converte as informaçoes em byte code
		oos1.writeObject(conta2);//converte as informaçoes em byte code
		
		
		System.out.println("Serialização realizada com sucesso!");
		
		//fecha a conexao
		oos.close();
		oos1.close();
		
		
		/*LEITURA DE OBJETO SERIALIZADO*/
		FileInputStream fis = new FileInputStream(path.toString());
		FileInputStream fis1 = new FileInputStream(path1.toString());
		
		/*le o objeto serializado*/
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		
		String[] nomes1 = (String[]) ois.readObject();
		
		//enquanto tiver objeto para ser lido, chame o metodo readObject
		Conta c1 = (Conta) ois1.readObject();
		Conta c2 = (Conta) ois1.readObject();
		
		ois.close();
		
		ois1.close();
		
		System.out.println(Arrays.toString(nomes1));
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		

	}

}
