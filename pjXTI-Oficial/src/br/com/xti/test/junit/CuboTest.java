package br.com.xti.test.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.xti.poo.heranca.multipla.CuboHerancaMultipla;

public class CuboTest {

	CuboHerancaMultipla cubo;
	
	@Before
	public void setUp() throws Exception{
		cubo = new CuboHerancaMultipla(10);
	}
	
	@Test
	public void testCalculaVolume() {
		
		//fail("Not yet implemented");
		//assertEquals(600,  cubo.calculaVolume());//depreciado
		//o novo deve ser informada a variação do resultado
		//neste caso nenhuma variação 0
		assertEquals(600,  cubo.calculaVolume(), 0);
	}

	@Test
	public void testCalculaArea() {
		//fail("Not yet implemented");
		assertEquals(1000, cubo.calculaArea(),0);
	}

}
