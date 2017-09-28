package br.ufg.inf.tacs.palindromotdd;

import org.junit.Assert;
import org.junit.Test;

public class TestePalindromo {

	@Test
	public void testeEhPalindromo(){
		Palindromo palindromo = new Palindromo();
		String frase = "Socorram-me subi no onibus em Marrocos";
		Assert.assertTrue(palindromo.ehPalindromo(frase));
	}
	
	@Test
	public void testeNaoEhPalindromo(){
		Palindromo palindromo = new Palindromo();
		String frase = "Nao eh palindromo";
		Assert.assertFalse(palindromo.ehPalindromo(frase));
	}
	
}
