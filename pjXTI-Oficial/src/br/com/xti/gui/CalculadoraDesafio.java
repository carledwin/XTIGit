package br.com.xti.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculadoraDesafio extends JFrame{

	//variaveis em escopo de classe
	private JButton sete, 	oito, 	nove, 	barra,
					quatro, cinco, 	seis, 	asterisco,	
					um, 	dois, 	tres, 	menos, 	
					zero, 	ponto,	igual, 	mais;
	
	
	private Font 		 fonte_visor;
	private Font 		 fonte_teclas;
	private JTextField  	 visor;
	private GridLayout 	 layout_gridLayout;
	private BorderLayout layout_borderLayout_principal;
	
	
	
	
	public CalculadoraDesafio(){
		super("Calculadora");

		layout_gridLayout 			  = new GridLayout(4,4);
		layout_borderLayout_principal = new BorderLayout();
		
		layout_gridLayout.setHgap(5);
		layout_gridLayout.setVgap(5);

		Container cCalc   = getContentPane();
		Container cTeclas = new JPanel();
		
		cCalc.setLayout(layout_borderLayout_principal);
		cTeclas.setLayout(layout_gridLayout);
		cTeclas.setPreferredSize(new Dimension(200, 230));
		
		//iniciando controles
		sete   = new JButton("7"); 	oito  = new JButton("8"); 	nove  = new JButton("9"); 	barra     = new JButton("/");
		quatro = new JButton("4");  cinco = new JButton("5"); 	seis  = new JButton("6"); 	asterisco = new JButton("*");	
		um 	   = new JButton("1"); 	dois  = new JButton("2"); 	tres  = new JButton("3"); 	menos     = new JButton("-"); 	
		zero   = new JButton("0"); 	ponto = new JButton(".");	igual = new JButton("="); 	mais      = new JButton("+");
		
		fonte_visor  = new Font("lucida console", Font.BOLD, 20);
		fonte_teclas = new Font("arial", Font.BOLD, 15);
		
		visor  = new JTextField("0,");
			visor.setFont(fonte_visor);
				visor.setEditable(false);
					visor.setForeground(Color.BLACK);
						visor.setBackground(Color.WHITE);
						visor.setHorizontalAlignment(JTextField.RIGHT);
							visor.setPreferredSize(new Dimension(290, 35));
					

		cTeclas.add(sete); 		cTeclas.add(oito);	cTeclas.add(nove);	cTeclas.add(barra);
		cTeclas.add(quatro); 	cTeclas.add(cinco);	cTeclas.add(seis);	cTeclas.add(asterisco);
		cTeclas.add(um); 		cTeclas.add(dois);	cTeclas.add(tres);	cTeclas.add(menos);
		cTeclas.add(zero); 		cTeclas.add(ponto);	cTeclas.add(igual);	cTeclas.add(mais);
		
		//cTeclas.setFont(fonte_teclas); não funciona
		//sete.setForeground(Color.RED); funciona
		
		//unindo dois layouts 
		cCalc.add(BorderLayout.NORTH, visor);
		cCalc.add(BorderLayout.SOUTH, cTeclas);
		
		//propriedades da JFrame
			setVisible(true);
			setSize(300, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new CalculadoraDesafio();

	}

}
