package br.com.xti.test.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.xti.refinado.Recursividade;

public class RecursividadeTest {

	//não precisa inicializar um objeto para realizar este teste
	/*@Before
	public void setUp() throws Exception {
	}
*/
	@Test
	public void testSoma() {
		//fail("Not yet implemented");
		//somar numeros de 0 a 10 com resultado final de 55
		assertEquals(55,Recursividade.soma(10));
	}

	@Test
	public void testPotencia() {
		//fail("Not yet implemented");
		assertEquals(81, Recursividade.potencia(3, 4));
	}

}
