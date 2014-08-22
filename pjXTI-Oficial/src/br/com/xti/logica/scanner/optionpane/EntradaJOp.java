package br.com.xti.logica.scanner.optionpane;

import javax.swing.JOptionPane;

public class EntradaJOp{

	public static void main(String[] args){
	
	//janela de dialogo
	String nome = JOptionPane.showInputDialog("Qual o seu nome?");
	//System.out.println(nome);
	JOptionPane.showMessageDialog(null, nome);
	}
}