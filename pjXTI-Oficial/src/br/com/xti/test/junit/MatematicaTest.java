package br.com.xti.test.junit;

import static org.junit.Assert.fail;

//importação comum da classe
//import junit.framework.Assert;

//importação static para chamar diretamente os metodos statics sem chamar a classe
//transformando o import static
//importando todos os metodos statics da classe
import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.xti.poo.operacoesmatematicas.Matematica;

public class MatematicaTest {

	
	// para executar o teste Run As JUnit Test
	
	
	
	//como o teste será realizado na classe Matematica
	//será aproveitado o metodo setUp para inicializar a mesma
	Matematica m;
	
	//configura algo antes de iniciar o caso de teste
	//@Before para informar que será executado antes dos casos de teste
	@Before
	public void setUp() throws Exception{
		m = new Matematica();
	}
	
	
	//cada caso de teste virá com a anotação @Test
	@Test
	public void testMaior() {
		//fail("Not yet implemented");
		
		//ver qual é o numero maior 10 ou 20 resultado esperado 20 único possível
		assertEquals(20, m.maior(10, 20));
	}

	@Test
	public void testDivide() throws Exception {
		//fail("Not yet implemented");
		
		//dividir 50 por 2 resultado esperado 25 único possível
		assertEquals(25.0, m.divide(50, 2));
	}

	//criando outro teste para dividir por zero
	@Test
	public void testDividePorZero() throws Exception {
		//fail("Not yet implemented");
		
		/*Falha*///- resultado esperado é diferente do retorno
		//dividir 50 por 2 resultado esperado 25 único possível
		assertEquals(25.0, m.divide(50, 0));
	}
	
	
	@Test
	public void testRaiz() {
		
		//importação comum para utilizar os metodos statics da classe
		//verifica se o teste foi ou não bem sucedido
		//testa dois valores - o esperado na execução do metodo e o valor recebido
		//Assert.assertEquals(4, m.raiz(16));
		
		//raiz quadrada de 16 é 4 resultado esperado 4 único possível
		//importação static da classe
		assertEquals(4.0, m.raiz(16));
	
		//fail("Not yet implemented");
	}

}
