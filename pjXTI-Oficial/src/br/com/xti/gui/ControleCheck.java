package br.com.xti.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame{

	JTextField texto ;
	JCheckBox bold;
	JCheckBox italic;
	
	ControleCheck(){
		super();

		texto = new JTextField("Veja a Fonte Mudar", 12);
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		//definir interface ouvinte - recebe um objeto que implementa o item listener
		//podendo criar uma classe interna ou a propria classe ser responsavel
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckBoxListener());
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckBoxListener());
		
		Container c = getContentPane();
			
		
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);
		
		
		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	class CheckBoxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()){
				texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
			}else if(bold.isSelected()){
				texto.setFont(new Font("Serif", Font.BOLD, 26));
			}else if(italic.isSelected()){
				texto.setFont(new Font("Serif", Font.ITALIC, 26));
			}else{
				texto.setFont(new Font("Serif", Font.PLAIN, 26));
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new ControleCheck();
	}
}
