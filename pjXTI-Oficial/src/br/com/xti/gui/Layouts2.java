package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame{

	public Layouts2(){
		super("Layouts 2");//chamada ao metodo construtor de JFrame e definir o titulo da janela
		
		//recuperar o container para trabalhar com os componentes
		Container c = getContentPane(); //o padrão é BorderLayout
		
		c.setLayout(new BorderLayout());
		
		
		//layout 01 Default
		/*
		//definir e criar o layout
		//c.setLayout(new BorderLayout());
		
		//define o espaçamento entre os componentes
		c.setLayout(new BorderLayout(15,15));
		
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.WEST, new JButton("W"));
		*/
		
		
		
		//layout 2 - GRIDLAYOUT - definindo a quantidade de linhas e colunas
		/*c.setLayout(new GridLayout(2,3));
		
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		
		//layout 3 - com dois tipos diferentes de layouts
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));

		//juntando os dois layouts
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, c2);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new Layouts2();
	}
}
