package br.com.xti.refinado;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//classe envolvente
public class Aninhamento extends JFrame{

	JButton botao;
	
	public Aninhamento() {
		super("Aninhamento");
		
		botao = new JButton("ok");
		botao.addActionListener(new ListenerAninhado());
		
		//classe anônima
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe Anônima executa " + botao.getText());	
				
			}
		});
		
		
		Container c = getContentPane();
		
		c.add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
	}
	
	

	//classe aninhada
	//pode acessar atributos da classe envolvente
	public class ListenerAninhado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe aninhada executa " + botao.getText());
		}
	}
	
	public static void main(String[] args) {
		Aninhamento janela = 	new Aninhamento();
		
		//criar listener aninhado
		//o tipo dele é o nome da classe envolvente
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();
		
	}
}
