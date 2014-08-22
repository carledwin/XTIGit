package br.com.xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame{

	
	public ControleLabel(){
		super("Label");
		
		Container c = getContentPane();
		
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu Tooltip");
		
		//Font fonte = new Font("serif",Font.BOLD | Font.ITALIC,0); //não funcionou
		Font fonte = new Font("serif",Font.BOLD, 20);
		JLabel labelStyle = new JLabel("Label Simples");	
			labelStyle.setFont(fonte);
				labelStyle.setForeground(Color.BLUE);
			
										//getClass()recupera a classe
										//recupera o diretorio -> a url relativa do objeto que 
										//se deseja recuperar
										//url a posição relativa da imagem em relação a classe
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/images.jpg")); 		
		JLabel imagem = new JLabel(icon);
		
			c.setLayout(new FlowLayout());
				c.add(simples);
					c.add(labelStyle);
						c.add(imagem);
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new ControleLabel();

	}

}
