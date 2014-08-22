package br.com.xti.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame{
	
	//Texto enviado ao servidor
	JTextField textoParaEnviar;
	
	//conexao com o servidor
	Socket server;
	
	//output - saida de informação
	PrintWriter escritor;
	
	String nomeCliente;
	
	//Texto recebido do servidor
	JTextArea textoRecebido;
	
	//scanner de leitura
	Scanner leitor;
	
	//gerar thread de escuta para cada cliente
	private class EscutaServidor implements Runnable{

		//le do servidor as informações recebidas
		@Override
		public void run() {
			
			try {
				String texto;
				
				//acessar cada uma das linhas do servidor e imprimir 
				//enquanto elas forem diferentes de nulo
				while((texto = leitor.nextLine() )!= null){
					
					//atribui o texto recebido à textArea
					//textoRecebido.setText(texto + "\n"); adicionaria a ultima mensagem ao texto, sobreescrevendo
					//.append adicionará o texto ao final do texto que já existe
					textoRecebido.append(texto + "\n");
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	ChatCliente(String nomeCliente) throws UnknownHostException, IOException{
	
		//Cria interface grafica para inserir informações
		
		super("Chat: " + nomeCliente);
		this.nomeCliente = nomeCliente;
		
		Font fonte = new Font("Serif", Font.PLAIN, 26);
		
		textoParaEnviar = new JTextField();
			textoParaEnviar.setFont(fonte);
		
		JButton botao = new JButton("Enviar");
			botao.setFont(fonte);
			
			//definir listener para escutar/ouvir os clicks do botão
			//assionar o envio das mensagens que estarão dentro do campo texto para o servidor
			botao.addActionListener(new EnviarListener());//classe interna, anonima...
		
		//container secundario - Painel
		Container envio = new JPanel();
		
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER,textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);
		
		
		
		//iniciar area de texto recebido do servidor
		textoRecebido = new JTextArea();
		textoRecebido.setFont(fonte);
		//a JTextArea deve ser sempre utilizada em conjunto com o
		//JScrollPane para habilitar a barra de rolagem na area de texto
		//quando ela superar os limites da area de texto
		JScrollPane scroll = new JScrollPane(textoRecebido);
		
		//adiciona o scroll ao container
		getContentPane().add(BorderLayout.CENTER, scroll);
		
		//adicionar o container envio ao container principal da janela
		getContentPane().add(BorderLayout.SOUTH, envio);
		
		//chama a configuração de rede para se conectar ao servidor
		configurarRede();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}

	//classe interna - Ouvinte
	private class EnviarListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//capiturar a informação do campo texto para enviar para o servidor
			escritor.println(nomeCliente + " : " + textoParaEnviar.getText());
			
			//para garantir que a informação foi enviada com sucesso
			escritor.flush();
			
			//limpar o campo texto
			textoParaEnviar.setText("");
			
			//colocar o foco para o campo de texto novamente
			textoParaEnviar.requestFocus();
		}
	}
	
	
	private void configurarRede() throws UnknownHostException, IOException{

		
		//Se conecta com o servidor
		try {
			//criar socket apontando para o servidor da maquina local na porta 3000
			server = new Socket("127.0.0.1", 5000);
			
			//output
			escritor = new PrintWriter(server.getOutputStream());
			
			//inicializar o leitor da mensagem que vem do servidor
			leitor = new Scanner(server.getInputStream());
			
			
			//nova thread que fica escutando o servidor
			new Thread(new EscutaServidor()).start(); //recebe um Runnable como parametro
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new ChatCliente("Ricardo");
		new ChatCliente("Sandra");
	}
}
