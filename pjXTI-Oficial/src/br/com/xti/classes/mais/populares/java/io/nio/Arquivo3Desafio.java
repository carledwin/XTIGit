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
import java.util.List;

import br.com.xti.poo.classes.modelos.Conta;

public class Arquivo3Desafio {

	
	/*
	 * 	Desafio
		Criar programa com 2 metodos
		um que grava uma lista de contas, em arquivo sequencial
		outro que lê esse arquivo, carregando os objetos do tipo conta novamente
	 * 
	 * */
	
	public static void main(String[] args) {
		Path path = Paths.get("C:/xti/XTI/files/contas.txt");
		Charset charset = StandardCharsets.UTF_8;
		
		
		List<Conta> listaDeContas = new ArrayList<>();

		listaDeContas.add(new Conta("Ricardo", 10000_01));
		listaDeContas.add(new Conta("Lawrence", 24000_03));
		listaDeContas.add(new Conta("Beatriz", 32000_01));
		listaDeContas.add(new Conta("Sandra", 27050_01));
		
		
		gravarContasNoArquivo(listaDeContas, path, charset);
		
		System.out.println("Gravação do arquivo realizada com sucesso"); 
		
		
		lerArquivoDeContas(path, charset);
		
		System.out.println("Leitura do arquivo realizada com sucesso");
	}
	
	private static void gravarContasNoArquivo(List<Conta> listaDeContas, Path path, Charset charset){
		
		
		
		try(BufferedWriter writer = Files.newBufferedWriter(path,charset);) {
			
			for (Conta conta : listaDeContas) {
				//writer.append(conta.getCliente() + "," + conta.getSaldo() + ".\n");
				writer.write(conta.getCliente() + "," + conta.getSaldo() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void lerArquivoDeContas(Path path, Charset charset){
		
		try(BufferedReader reader = Files.newBufferedReader(path, charset)) {
			
			String line = null;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
