package br.com.xti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//extends JFrame - para fazer da classe uma janela
//implements ActionListener - para a classe se tornar controladora dos botoes
//formato 01
//public class ControlesTest extends JFrame implements ActionListener{
public class ControlesTest extends JFrame{

	//variavies em escopo de classe
	private JButton        ok, cancel;
	private JTextField     login;
	private JPasswordField senha;
	
	//formato 01
	//este metodo pode tornar a manutenção trabalhosa com varios botoes, 
	//sendo mais indicado criar uma classe para tratar eventos 
	/*@Override
	public void actionPerformed(ActionEvent event) {
		
		//captura qual objeto deu origem ao evento
		if(event.getSource() == ok){
			
			//apresentar o login 
			
			String s = "login: " + login.getText()
				   + "\n senha: " + new String(senha.getPassword()); //retorna um array de char
			
			//apresentar o conteudo
			JOptionPane.showMessageDialog(null, s);
			System.out.println("Clicou em Ok");
		}else if(event.getSource() == cancel){
			login.setText("");
			senha.setText("");
			//limpar os campos
			System.out.println("Clicou em Cancel");
	
		}	
		
	}
	*/
	
	
	//classe interna, para tratamento de botao Ok
	class BotaoOkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
		//apresentar o login 
			
			String s = "login: " + login.getText()
				   + "\n senha: " + new String(senha.getPassword()); //retorna um array de char
			
			//apresentar o conteudo
			JOptionPane.showMessageDialog(null, s);
			System.out.println("Clicou em Ok");
		
			
		}
		
	}
	
	//classe interna, para tratamento de botao Ok
	class BotaoCancelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			login.setText("");
			senha.setText("");
			//limpar os campos
			System.out.println("Clicou em Cancel");
		}
	}
	
	
	public ControlesTest(){
	
		super("Textos e Senhas");
		
		//iniciando controles
		ok     = new JButton("Ok");
		cancel = new JButton("Cancel");
		login  = new JTextField();
		senha  = new JPasswordField();
		
		
		//Definir a interface ouvinte dos botoes, coloca-los em escopo e classe
		
		//formato 01
		//vincular os botoes ao actionListener
		/*ok.addActionListener(this);//informa que o controlador é a propria classe
		cancel.addActionListener(this);*/
		
		//eventos sendo tratados por classes especialistas em tratar eventos de botoes
		ok.addActionListener(new BotaoOkListener());
		cancel.addActionListener(new BotaoCancelListener());
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		c.add(new JLabel("Login"));
		c.add(login);
		c.add(new JLabel("Senha"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new ControlesTest();
	}



}
