package br.com.tradutor.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TradutorTest {

	private Tradutor t;

	@Before
	public void criarTradutor() {
		t = new Tradutor();
		System.out.println("before");
	}
	
	@Test
	public void tradutorSemPalavra() {
		assertTrue(t.estaVazio());
		System.out.println("test 01");
	}

	@Test
	public void umaTraducao() {
		t.adicionaTraducao("bom", "good");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom"));
		System.out.println("test 02");
	}
	

}
