package br.com.xti.gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {
	
	public Layouts(){
		
		super("Layouts");
		
		/*getContentPane().add(new JButton("1"));
		getContentPane().add(new JButton("2"));//exibirá somente o segundo
*/		
		
		//recuperar o container, 
		//são varios os tipos de layouts disponíveis na biblioteca awt
		//o padrão é o BorderLayout, que define algumas posições onde os
		//controles podem ser colocados, podendo ser ao norte, leste, sul, oeste
		Container container = getContentPane();

		//layout 01
		/*//é possivel também criar seu proprio layout
		BorderLayout border = new BorderLayout();
		
		//atribuir o seu layout ao container
		container.setLayout(border);
		
		container.add(BorderLayout.NORTH,  new JButton("1"));
		container.add(BorderLayout.SOUTH,  new JButton("2"));
		container.add(BorderLayout.CENTER, new JButton("3"));
		container.add(BorderLayout.EAST,   new JButton("4"));
		container.add(BorderLayout.WEST,   new JButton("5"));
		*/
		
		
		//layout 02
		//é possivel atribuir outros layouts
		//o layout mais simples da biblioteca awt que é o FlowLayout
		container.setLayout(new FlowLayout());
		
		//adicionar os componentes, sem a necessidade de definir a posição para
		//os componentes, pois os mesmos serão distribuidos de acordo com a ordem 
		//de chegada de cada elemento layout
		container.add(new JButton("1"));
		container.add(new JButton("2"));
		container.add(new JButton("3"));
		container.add(new JButton("4"));
		container.add(new JButton("5"));
		
		
		//informa a posicao onde se deseja colocar cada componente
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		
		new Layouts(); 
	}

}
