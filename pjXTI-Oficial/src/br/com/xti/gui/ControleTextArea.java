package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener{

	
	JTextArea texto;
	
	ControleTextArea(){
		super("Editor de Textos");
		
		
		
		texto = new JTextArea();
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("serif", Font.PLAIN, 14));
		
		
		//para abrir um arquivo 
		JButton botao = new JButton("Abrir arquivo");
		botao.setFont(new Font("Serif", Font.PLAIN, 20));
		botao.addActionListener(this);
		
		
		
		Container c = getContentPane();
		
		//adicionar um textarea direto no container
		//nao é uma boa forma de usar o editor, pois 
		//não é possivel criar uma barra de rolagem, o ideal é usar um painel.
		//JScrollPane que exibe/gera - automaticamente a barra de rolagem
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH , botao);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 700);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//recupera o arquivo do computador e exibe dentro
		//do editor de texto
		//JFileChooser - escolhedor de arquivos
		JFileChooser c = new JFileChooser();
		
		//metodos para exibição de arquivos
		//showSaveDialog - salvar o arquivo
		//showOpenDialog - abrir o arquivo
		c.showOpenDialog(this);
		//quem está fazendo a chamada - this a JANELA 
		
		//recuperar o arquivo selecinado ou uma lista de arquivos
		File file = c.getSelectedFile();
		
		try {
			Path path = Paths.get(file.getAbsolutePath());
			
			//ler todos os bytes do arquivo 
			String retorno = new String(Files.readAllBytes(path));
			texto.setText(retorno);
			path.getFileName();
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Não conseguimos carragar seu arquivo");
		}
		
	}
	
	public static void main(String[] args) {
		new ControleTextArea();

	}

}
