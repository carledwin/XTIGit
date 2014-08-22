package br.com.xti.classes.mais.populares.java.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.classes.modelos.Conta;

public class Serializa2 {

	
	/*
	 * 	Desafio
		Criar programa com 2 metodos
		um que grava uma lista de contas, em arquivo sequencial
		outro que lê esse arquivo, carregando os objetos do tipo conta novamente
	 * 
	 * */
	
	//antes
	//private Path path = Paths.get("C:/xti/XTI/files/contasEx.txt");
	//private Charset utf8 = StandardCharsets.UTF_8;
	
	private Path path1 = Paths.get("C:/xti/XTI/files/serializados/contas3.ser");
	
	public void armazenarContas(ArrayList<Conta> listaDeContas) throws IOException{
		
		/*ESCRITA DE OBJETO COM MANIPULAÇÃO DE BYTES*/
		//recebe o endereco do arquivo para a escrita do arquivo
		try(FileOutputStream  fos = new FileOutputStream(path1.toString())){
		
			/*utiliza o FileOutputStream para gravar*/
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(listaDeContas);
			}
		}
		

		//antes
		/*try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			
			for (Conta conta : listaDeContas) {
				writer.write(conta.getCliente()+ ";" + conta.getSaldo() + "\n");
			}
		}*/
	}
	
	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException{
		
		/*LEITURA DE OBJETO SERIALIZADO*/
		try(FileInputStream fis = new FileInputStream(path1.toString())){
			
			/*le o objeto serializado*/
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				return (ArrayList<Conta>) ois.readObject();//pode ser lancada a exception na hora de tentar realizar oi cast ClassNotFoundException 
			}
		}
		
		
		//antes
		/*ArrayList<Conta> contas = new ArrayList<>();
		
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			
			String line = null;
			
			while((line = reader.readLine()) != null){
				String[] token =  line.split(";");//retornará um array de String
				
				contas.add(new Conta(token[0],Double.parseDouble(token[1])));
				
				//System.out.println(token[0]+token[1]);
				token[0] = 
				token[1] = 
			}
		}*/
		
		
		//return contas;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Serializa2 operacao = new Serializa2();
		
		ArrayList<Conta> listaDeContas = new ArrayList<>();

		listaDeContas.add(new Conta("Ricardo", 10000_01));
		listaDeContas.add(new Conta("Lawrence", 24000_03));
		listaDeContas.add(new Conta("Beatriz", 32000_01));
		listaDeContas.add(new Conta("Sandra", 27000_01));
		
		System.out.println("Iniciando a gravação do arquivo...");
		operacao.armazenarContas(listaDeContas);
		System.out.println("Gravação do arquivo realizada com sucesso!\n\n"); 
		
		
		System.out.println("Iniciando a leitura do arquivo...");
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		System.out.println("Iniciando a exibição do conteúdo do arquivo...");
		
		for (Conta conta : contas2) {
			/*System.out.print("Cliente: " + conta.getCliente());
			System.out.println(" | Saldo: " + conta.getSaldo());
			ou
			*/
			conta.exibeSaldo();
		}
		System.out.println("Leitura do arquivo realizada com sucesso!");
	}
	
	
}
