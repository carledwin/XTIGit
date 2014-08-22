package br.com.xti.logica.fluxosrepeticao;
public class FluxoSwitch{

	public static void main(String[] args){
	
	
		//'' para caracter
		char sexo = 'M';
		switch(sexo){
			case 'M':
				System.out.println("Macho");
				break;
			case 'F':
				System.out.println("Femea");
				break; //opcional
			default:
			System.out.println("Outro");
		}
		
		
		//"" para String
		//String tecnologia = "postgresql";
		String tecnologia = "Hemily";
		switch(tecnologia){
			case "java":
			case "c++":
			case "cobol":
				System.out.println("Linguagem de Programacao");
				break;
				
			case "oracle":
			case "sqlserver":
			case "postgresql":
				System.out.println("Banco de Dados");
				break; //opcional
				
			default:
			System.out.println("Tecnologia Desconhecida");
	}
	}

}