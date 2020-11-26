package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;


public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals(1, 1);
		
		//double usando delta
		Assert.assertEquals(0.07, 0.07, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		//Box e unboxing
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		//String
		Assert.assertNotEquals("Bola", "ola");
		Assert.assertEquals("Bola", "Bola");
		Assert.assertTrue("Bola".equalsIgnoreCase("bola"));
		Assert.assertTrue("Bola".startsWith("Bo"));
		
		//Comparacao de objetos
		
		Usuario usuario1 = new Usuario("Usuario1");
		Usuario usuario2 = new Usuario("Usuario1");
		Usuario usuario3 = null;
		Assert.assertEquals(usuario1, usuario2);
		
		//Comparando a mesma instancia
		Assert.assertSame(usuario1, usuario1);
		Assert.assertNull(usuario3);
	}

}
