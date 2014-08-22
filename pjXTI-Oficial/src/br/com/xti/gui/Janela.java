package br.com.xti.gui;

import javax.swing.JButton;
import javax.swing.JFrame;


//esta classe é a representa a janela do sistema, podendo extends a JFrame
/*public class Janela {*/
public class Janela extends JFrame{

	
	public Janela(){
		
		//não é necessario instanciar esta classe, pois a classe Janela 
		//extends a JFrame e é a propria JFrame
		//JFrame jFrame = new JFrame();
		
		//o mais indicado é chamar o metodo da super classe e passar um titulo
		super("Minha Janela");
		
		
		//Criar controles
		JButton botao = new JButton("Clique");
		
		//recuperar o container da janela, onde irá armazenar os controles
		// e adicionar controles caso queira
		//jFrame.getContentPane().add(botao);
		getContentPane().add(botao);
		
		
		//define a operação padrão, para quando o usuario clicar no X
		//existe o parametro que finaliza a aplicação ao fechar a janela, 
		//definido pela opção EXIT_ON_CLOSE
		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//define o tamanho da janela sendo largura e altura
		//jFrame.setSize(300, 300);
		setSize(300,300);
		
		//define a visibilidade
		//jFrame.setVisible(true);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		/*
		 * GUI - GRAPHICAL USER INTERFACE
		 * INTERFACE GRAFICA COM O USUARIO
		 * 
		 * Pacote javax.swing
		 * 
		 * Janela (JFrame
		 * 
		 * Container - serve para colocar componentes
		 * 
		 * Componentes(Controles) - são botoes, campos de textos, imagens, combobox
		 * 
		 * 
		 * */
		
		
		new Janela();

	}

}
