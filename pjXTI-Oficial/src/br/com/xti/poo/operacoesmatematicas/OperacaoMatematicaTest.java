package br.com.xti.poo.operacoesmatematicas;


public class OperacaoMatematicaTest {

	
	public static void calcule(OperacaoMatematicaSp operacao, double x, double y){
		
		System.out.println(operacao.calcular(x, y));
	}
	
	public static void calculeSemPolimorfismo(String operacao, double x, double y){
		
		if(operacao.equals("Soma")){
			System.out.println(x + y);
		}else if(operacao.equals("Multiplicacao")){
			System.out.println(x * y);
		}
		
	}
	
	public static void main(String[] args) {
		
		calcule(new SomaSb(), 5, 5);
		calcule(new MultiplicacaoSb(), 6, 6);
		calculeSemPolimorfismo("Soma", 5, 5);
		calculeSemPolimorfismo("Multiplicacao", 6, 6);
	}

}
