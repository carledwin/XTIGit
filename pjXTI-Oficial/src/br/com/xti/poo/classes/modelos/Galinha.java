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
	//será criada somente uma vez e pertence a classe galinha e não ao objeto galinha
	//variavel static possui o símbolo circulo verde com S em vermilho 
	//static 
	public static int ovosDaGalinha;
	
	//final para que o valor nunca seja modificado
	//static para que seja a única referencia
	public final static int OVOS_CONSTANTE = 5;
	
	
	public int ovos; //total de ovos do objeto galinha
	
	public void botar(){
		 this.ovos++;
	}
	
	public Galinha botarComRetornoDoObjeto(){
		 this.ovos++;
		 // não é permitido o acesso a partir de this pois não pertence ao objeto e sim a classe
		//this.ovosDaGalinha; 
		 
		 //para acessar é necessário chamar diretamente a classe galinha seguido da variável ou método static
		 //neste caso está sendo incrementado um ovo a esta variável 
		 Galinha.ovosDaGalinha++;
		 return this;
	}
	
	
	//métodos statics não podem acessar variáveis locais  
	public static double mediaDeOvos(int galinhas){
		
		
		//this.ovos; // não é permitido, pois this representa uma instancia de um objeto e
		// os métodos statics não conhecem instancias de objetos
		
		//também não é permitido, será indicado que altere a variável para static para conseguir acessá-la
		//ovos;
		
		//é permitido acessar diretamente as variáveis statics sem a necessidade de chamar o nome da classe
		return ovosDaGalinha / galinhas;
		
	}

}
