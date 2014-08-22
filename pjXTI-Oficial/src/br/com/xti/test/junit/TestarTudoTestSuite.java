package br.com.xti.test.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//@SuiteClasses define o conjunto de classes que serão testadas, recebendo um array de classes
//é possível adicionar novas classes de teste a esta anotação
@RunWith(Suite.class)
@SuiteClasses({ CuboTest.class, MatematicaTest.class, RecursividadeTest.class })
public class TestarTudoTestSuite {

	
	//Basta rodar esta classe e a mesma irá executar todas as classes de
	//teste adicionadas ao teste principal
	
	//Retornará um relatorio completo com os resultados dos testes realizados em todas as classes.
}
