package br.com.xti.poo.operacoesmatematicas;


public class SomaSb extends OperacaoMatematicaSp {
	

	//polimorfismo permite alterar o comportamento normal da herança do método da superclasse , mantendo a assinatura do método herdado,
		// e alterando o seu comportamento interno, de acordo com a necessidade da subclasse
		public double calcular(double x, double y){
			return x + y;
		}

}
