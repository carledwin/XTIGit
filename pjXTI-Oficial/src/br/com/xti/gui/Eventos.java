package br.com.xti.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//public class Eventos extends JFrame{

//trasformar a classe em tratadora dos eventos do botão
public class Eventos extends JFrame implements ActionListener{

	private JButton botao;
	
	public Eventos(){
		super("Eventos");//chamar o construtor JFrame
		
		
		//JButton botao = new JButton("Clique Aqui");
		botao = new JButton("Clique Aqui");// para alterar o texto do botao
		
		botao.addActionListener(this);//espera um objeto que implementa a interface ActionListener
									  //this - para informar que esta classe é a tratadora oficial
									  //o metodo actionPerformed(ActionEvent) será acionado no click do botao
		getContentPane().add(botao);
		
		//informar ao botao os quem recebera os eventos
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println("Clicou");
		
		//ira alterar o texto do botao
		botao.setText("FOI CLICADO");
	}

	
	
	public static void main(String[] args) {

		new Eventos();
	}


}
