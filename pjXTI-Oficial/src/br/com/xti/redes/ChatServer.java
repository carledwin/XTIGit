package br.com.xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

	List<PrintWriter> escritores = new ArrayList<>();
	
	
	public ChatServer(){

		System.out.println("Iniciando o servidor ...");
		//preparar o servidor para todos os clientes receberem os textos de todos eles
		//armazenar todas as classes responsaveis por enviar textos para eles, PrintWriters no caso
		
		//criar uma lista de PrintWriters/ cada cliente irá gerar uma printWriter nova
		
		ServerSocket server;
		Scanner leitor;
		try {
			server = new ServerSocket(5000);
			
			System.out.println("Servidor no ar...");
			//monitoramento constante e infinito
			//com fluxo de repetição while atraves do metodo accept
			while(true){
				//este metodo retorna um Socket para se comunicar com 
				//o cliente que fez a requisição
				Socket cliente = server.accept();
				
				System.out.println("Iniciando Chat ...");
				//cria threads para cada requisição do cliente, que conterá a escuta
				//do cliente com o socket criado-retornado
				new Thread(new EscutaCliente(cliente)).start();
				
				System.out.println("Chat no ar ...");
				
				//imprimir uma mensagem
				//leitura - captura informações
				//leitor = new Scanner(cliente.getInputStream());-teste sem thread
				
				//captura a proxima linha informada pelo cliente
				//System.out.println(leitor.nextLine()); - tete sem thread
				
				//inicializar um novo PrintWriter
				PrintWriter p = new PrintWriter(cliente.getOutputStream());
				
				//adiciona o printWriter a lista de escritores
				escritores.add(p);
				
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	private void EncaminharParaTodos(String texto){
		
	try {
		//percorre toda alista de escritores
		for (PrintWriter w : escritores) {
			//imprime o texto recebido
			w.println(texto);
			//para garantir que a informação foi enviada com sucesso
			w.flush();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	//classe/Runnable - Thread interna e privada para ficar escutando os clientes
	private class EscutaCliente implements Runnable{

		Scanner leitor;
		
		public EscutaCliente(Socket cliente) {
			
			try {
				//este scanner de leitura é exclusivo para cada cliente e cada
				//cliente terá seu proprio scanner de leitura
				leitor = new Scanner(cliente.getInputStream());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		//em run escreve todas as mensagens recebidas
		//o metodo run ficará monitorando a todo o momento o que está sendo escrito
		//por cada um dos clientes
		@Override
		public void run() {
			//receberá o socket do cliente se conectando com o servidor
			
			try {
				String texto;
				
				//ficará lendo as proximas linhas que forem digitadas pelos clientes/usuarios
				//ler todas as linhas, enquanto as linhas forem diferentes de NULL
				while((texto = leitor.nextLine()) != null){
					
					//chamar um metodo que encaminhará para todos os clientes este texto que ele recebeu
					EncaminharParaTodos(texto);
					
					//System.out.println("O servidor Recebeu: " + texto);
					System.out.println(texto);//imprime na tela do sistema
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
	
		new ChatServer();
		
		System.out.println("Servidor no ar...");
		
		
	}
}
