package br.com.xti.poo.operacoesmatematicas;

public interface VolumeCalculavel {
	
	//qualquer atributo dentro de uma interface � uma constante
	// ele sempre ter� inplicitamente os modificadores de acesso
	//public static final - � necessario declara-los, seria redundante
	//public static final int X = 1;
	int X = 1;
	
	double calculaVolume();

}
