package br.com.xti.logica.desafios;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JogoDeDados{

	public static void main(String[] args){

	
		Random r = new Random();
	
		//int valorDoDado = r.nextInt(6);
		
		int valorDoDado = r.nextInt(6)+1;
		
		/*switch (valorDoDado){
		
			case 0:
			valorDoDado = 1;
			break;
			case 1:
			valorDoDado = 2;
			break;
			case 2:
			valorDoDado = 3;
			break;
			case 3:
			valorDoDado = 4;
			break;
			case 4:
			valorDoDado = 5;
			break;
			case 5:
			valorDoDado = 6;
			break;
			
			default: 
			valorDoDado = 0;
		}
		*/
		
		
		System.out.println("Ola!");
		System.out.println("******* Bem vindo ao jogo de dados *******");
		System.out.println("Vamos jogar");
		System.out.println("Vamos ver se voce acerta o valor do que saiu no dado");
		
		String msg1 = "Pressione ok para comecar a jogar";
		JOptionPane.showMessageDialog(null, msg1);
		
		Scanner s = new Scanner(System.in);
		//usado somente via prompt
		//int palpitew = s.nextInt();
		
		String valorUsuario = JOptionPane.showInputDialog(null,"Entre com o seu palpite");
		
		//System.out.println("O valor informado pelo usuario foi: >> \t " + valorUsuario);
		
		if(Integer.parseInt(valorUsuario) == valorDoDado){
			JOptionPane.showMessageDialog(null,"Acertou! \n Palpite:" + valorUsuario + "\n Valor do dado:" + valorDoDado);
		}else{
			JOptionPane.showMessageDialog(null,"Voce errou! \n Palpite:" + valorUsuario + "\n Valor do dado:" + valorDoDado);
		}
		
		//System.out.println("O valor que saiu no dado eh: >> \t " + valorDoDado);
	
	
	}

}