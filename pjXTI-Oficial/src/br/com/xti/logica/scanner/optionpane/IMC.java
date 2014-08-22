package br.com.xti.logica.scanner.optionpane;
/**
*Calcular o IMC
*IMC = pesoEmQuilogramas / (alturaEmMetros * alteraEmMetros)
*/

import javax.swing.JOptionPane;

public class IMC{

	public static void main(String[] args){
		
		String peso   = JOptionPane.showInputDialog("Qual o seu peso?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura?");
		
		//double pesoEmQuilogramas = 70;
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		
		//double alturaEmMetros = 1.76;
		double alturaEmMetros = Double.parseDouble(altura);
		
		double imc = pesoEmQuilogramas /(alturaEmMetros * alturaEmMetros);
		
		 //avaliacao ? valor : valor;
		 String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do Peso";
		 
		 System.out.println("IMC = " + imc);

//		 System.out.println(msg);

		msg = "IMC - " + imc + "\n " + msg;

		JOptionPane.showMessageDialog(null, msg);
		
		
		
		
		
		
	
	}
}