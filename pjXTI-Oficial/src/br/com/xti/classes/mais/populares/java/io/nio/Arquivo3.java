package br.com.xti.classes.mais.populares.java.io.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.classes.modelos.Conta;

public class Arquivo3 {

	
	/*
	 * 	Desafio
		Criar programa com 2 metodos
		um que grava uma lista de contas, em arquivo sequencial
		outro que lê esse arquivo, carregando os objetos do tipo conta novamente
	 * 
	 * */
	
	private Path path = Paths.get("C:/xti/XTI/files/contasEx.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void armazenarContas(ArrayList<Conta> listaDeContas) throws IOException{
		
		
		
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			
			for (Conta conta : listaDeContas) {
				writer.write(conta.getCliente()+ ";" + conta.getSaldo() + "\n");
			}
		}
	}
	
	public ArrayList<Conta> recuperarContas() throws IOException{
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			
			String line = null;
			
			while((line = reader.readLine()) != null){
				String[] token =  line.split(";");//retornará um array de String
				
				contas.add(new Conta(token[0],Double.parseDouble(token[1])));
				
				//System.out.println(token[0]+token[1]);
				/*token[0] = 
				token[1] =*/ 
			}
		}
		return contas;
	}
	
	public static void main(String[] args) throws IOException {
		
		Arquivo3 operacao = new Arquivo3();
		
		/*ArrayList<Conta> listaDeContas = new ArrayList<>();

		listaDeContas.add(new Conta("Ricardo", 10000_01));
		listaDeContas.add(new Conta("Lawrence", 24000_03));
		listaDeContas.add(new Conta("Beatriz", 32000_01));
		listaDeContas.add(new Conta("Sandra", 27000_01));
		
		System.out.println("Iniciando a gravação do arquivo...");
		operacao.armazenarContas(listaDeContas);
		System.out.println("Gravação do arquivo realizada com sucesso!\n\n"); 
*/		
		
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
