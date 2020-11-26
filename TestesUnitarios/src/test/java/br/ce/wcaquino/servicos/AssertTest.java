package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;


public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals(1, 1);
		
		//double usando delta
		Assert.assertEquals(0.07, 0.07, 0.01);
	}

}
