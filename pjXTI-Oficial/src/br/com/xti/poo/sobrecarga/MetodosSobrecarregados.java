package br.com.xti.poo.sobrecarga;

public class MetodosSobrecarregados {

	public static void main(String[] args) {
		// tem os mesmos nomes, com assinaturas diferentes

		// METODOS SOBRECARREGADOS OU SOBRECARGA DE METODOS

		MetodosSobrecarregados m = new MetodosSobrecarregados();

		// o JVM identifica o tipo e quantidade de parametro passado e decide
		// por qual método utilizar
		System.out.println(m.media(5, 3));
		System.out.println(m.media("53", "43"));
		System.out.println(m.media(7));
		System.out.println(m.media(5, 3, 34, 56));

	}

	// soma e divide pela quantidade de numeros somados
	double media(int x, int y) {
		System.out.println("media(int x, int y)");
		return (x + y) / 2;
	}

	// exibe o numero
	double media(int x) {
		System.out.println("media(int x)");
		return x;
	}

	// soma e divide pela quantidade de numeros somados
	double media(double... x) {
		System.out.println("media(double ... x)");
		double ixl = x.length;
		double ixs = 0;
		double ixm = 0;
		for (double i : x) {
			ixs += i;
		}
		return ixm = ixs / ixl;
	}

	// Realiza o parse antes de somar e divider pela quantidade de numeros
	// somados
	double media(String x, String y) {
		System.out.println("media(String x, String y)");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;

	}
}
