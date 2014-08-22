package br.com.xti.redes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws Exception  {
		
	
		/*
		 * SOCKET - � um objeto que representa uma conexao de rede entre duas maquinas, 
		 * a conexeao � um relacionamento relacionamento entre duas maquinas 
		 * e sabem se conectar entre si.

			IP - 127.0.0.1 
			Porta TCP - 5000 identificador exclusivo
			
			por padr�o as portas s�o:
			80 servidor
			25 servidor de email
			
			0 a 1023 - n�o devem ser usadas, resevadas para servi�os como, internet, email, tcpip....
			
			65000 portas...
		 * */
		
		//criar conexao de socket - Cliente
		
		//criar objeto socket
		Socket socket = new Socket("127.0.0.1",3000);
		
		Scanner s = new Scanner(socket.getInputStream());
		
		System.out.println("Mensagem: " + s.nextLine());
		s.close();
		
		
	}
}
