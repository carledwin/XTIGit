package br.com.xti.redes;


import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(String[] args) throws Exception {
		
			//criar objeto servidor
			//não é necessario informar a URL do servidor, pois se trata da própria maquina 127.0.0.1, 
			//somente a porta neste caso 5000
			ServerSocket serverSocket = new ServerSocket(3000);
			  while(true) {
			   Socket socket = serverSocket.accept();
			   
			   try(PrintWriter w = new PrintWriter(socket.getOutputStream())){
			   
			 
			   w.println("Aprenda Java e seja Contratado");
			   }catch(Exception e){
				   e.printStackTrace();
			   }
			  }
		
		
	/*	//verificar conexoes ativas netstat -nab
		//C:\>netstat -ano | find "8080"
		//
		
		ServerSocket server = new ServerSocket(3000);//porta que receberá as requisições
		
		System.out.println("Servidor criado na maquina local 127.0.0.1 porta 3000, com sucesso!");
		
		//rodará eternamente, 
		while(true){
		Socket cliente = server.accept(); //aguardando a chegada de novos clientes
		System.out.println("Capturou um socket");
		
		try {
		
			PrintWriter w = new PrintWriter(cliente.getOutputStream());
			System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
			System.out.println("Preparando para imprimir uma mensagem de resposta...");
				w.println("Aprenda Java e seja Contratado.");
			System.out.println("Mensagem de resposta gerada com sucesso!");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		cliente.close();
		}
		*/
		
		
		
	  }
}    
 		