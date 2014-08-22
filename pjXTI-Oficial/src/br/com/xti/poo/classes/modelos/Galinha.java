package br.com.xti.poo.classes.modelos;

import br.com.xti.poo.classes.superr.AnimalSuperClasse;
import br.com.xti.poo.interfaces.AreaCalculavel;

public class Galinha extends AnimalSuperClasse  implements AreaCalculavel{

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Galinha(double peso, String comida) {
		super(peso, comida);
		// TODO Auto-generated constructor stub
	}


	//variavel global com o modificador static
	//ser� criada somente uma vez e pertence a classe galinha e n�o ao objeto galinha
	//variavel static possui o s�mbolo circulo verde com S em vermilho 
	//static 
	public static int ovosDaGalinha;
	
	//final para que o valor nunca seja modificado
	//static para que seja a �nica referencia
	public final static int OVOS_CONSTANTE = 5;
	
	
	public int ovos; //total de ovos do objeto galinha
	
	public void botar(){
		 this.ovos++;
	}
	
	public Galinha botarComRetornoDoObjeto(){
		 this.ovos++;
		 // n�o � permitido o acesso a partir de this pois n�o pertence ao objeto e sim a classe
		//this.ovosDaGalinha; 
		 
		 //para acessar � necess�rio chamar diretamente a classe galinha seguido da vari�vel ou m�todo static
		 //neste caso est� sendo incrementado um ovo a esta vari�vel 
		 Galinha.ovosDaGalinha++;
		 return this;
	}
	
	
	//m�todos statics n�o podem acessar vari�veis locais  
	public static double mediaDeOvos(int galinhas){
		
		
		//this.ovos; // n�o � permitido, pois this representa uma instancia de um objeto e
		// os m�todos statics n�o conhecem instancias de objetos
		
		//tamb�m n�o � permitido, ser� indicado que altere a vari�vel para static para conseguir acess�-la
		//ovos;
		
		//� permitido acessar diretamente as vari�veis statics sem a necessidade de chamar o nome da classe
		return ovosDaGalinha / galinhas;
		
	}

}
