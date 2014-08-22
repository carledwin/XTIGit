package br.com.xti.generic;

public class Generico_Antigo_Sem_Generico {

	//Anticamente os elementos eram tratados como Object, 
	//para trabalhar com tipos genericos
	Object elemento;
	public void setElemento(Object elemento){
		this.elemento = elemento;
	}
	public Object getElemento(){
		return elemento;
	}
	
	public static void main(String[] args) {
		
		Generico_Antigo_Sem_Generico g = new Generico_Antigo_Sem_Generico();
		
		g.setElemento("Lago Paranoá");
		System.out.println(g.getElemento());
		
		//desvantagem, não é possivel acessar diretamente os metodos do tipo,
		//como o caso de String que é o retornado acima, não é possível
		//acessar o .toUPPERCASE
		//g.getElemento()
		
		//Para isto é necessário realizar um CAST
		String e = (String) g.getElemento().toString();
		
		System.out.println(e.toUpperCase());
		
		
		g.setElemento(123456);
		System.out.println(g.getElemento());
		
	}

}
