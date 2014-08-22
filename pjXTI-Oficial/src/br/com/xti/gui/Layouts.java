package br.com.xti.gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {
	
	public Layouts(){
		
		super("Layouts");
		
		/*getContentPane().add(new JButton("1"));
		getContentPane().add(new JButton("2"));//exibir� somente o segundo
*/		
		
		//recuperar o container, 
		//s�o varios os tipos de layouts dispon�veis na biblioteca awt
		//o padr�o � o BorderLayout, que define algumas posi��es onde os
		//controles podem ser colocados, podendo ser ao norte, leste, sul, oeste
		Container container = getContentPane();

		//layout 01
		/*//� possivel tamb�m criar seu proprio layout
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
		//� possivel atribuir outros layouts
		//o layout mais simples da biblioteca awt que � o FlowLayout
		container.setLayout(new FlowLayout());
		
		//adicionar os componentes, sem a necessidade de definir a posi��o para
		//os componentes, pois os mesmos ser�o distribuidos de acordo com a ordem 
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
