package br.com.xti.gui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ControleCombo extends JFrame implements ItemListener{

	
	//comboBox recebe todos os tipos de objeto, desde que seja definido
	JComboBox<String> combo;
	
	//para exibir as imagens
	JLabel label;
	
	//array de imagens, pois serão trazidas varias
	//criar as imagens - encontrar um arquivo que esteja 
	//relativo a esta classe, neste endereço
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/1.jpg")),
			new ImageIcon(getClass().getResource("fotos/2.jpg")),
			new ImageIcon(getClass().getResource("fotos/3.jpg")),
			new ImageIcon(getClass().getResource("fotos/4.jpg")) };
	
	ControleCombo(){
		super("Album de Fotos");
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("Familia 1");
		combo.addItem("Familia 2");
		combo.addItem("Familia 3");
		combo.addItem("Familia 4");
		
		//ouvinte para tratar os eventos agora 
		//na classe que será a responsavel por 
		//imoplementar i itemListener
		//this se refere a propria classe como ouvinte 
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		
		setVisible(true);
		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//verificar se o combo foi alterado, 
		//e qual o tipo de alteração no caso selected
		//e seta de acordo com o index de itens do combo
		if(e.getStateChange() == ItemEvent.SELECTED){
			//indice do item selecionado no combo
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
	}
	
	public static void main(String[] args) {
		new ControleCombo();
	}



}
