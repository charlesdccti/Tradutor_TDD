package br.com.tradutor.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TradutorTest {

	private Tradutor t;

	@Before
	public void criarTradutor() {
		t = new Tradutor();
	}
	
	@Test
	public void tradutorSemPalavra() {
		assertTrue(t.estaVazio());
	}

	@Test
	public void umaTraducao() {
		t.adicionaTraducao("bom", "good");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom"));
	}
	
	@Test
	public void duasTraducoes() {
		t.adicionaTraducao("bom", "good");
		t.adicionaTraducao("mau", "bad");
		assertEquals("good", t.traduzir("bom"));
		assertEquals("bad", t.traduzir("mau"));
	}
	
	@Test
	public void duasTraducoesMesmaPalavra() {
		t.adicionaTraducao("bom", "good");
		t.adicionaTraducao("bom", "nice");
		assertEquals("good, nice", t.traduzir("bom"));
	}	
	
	/* Achou que não necessário Refatoracao para o Test duas traducoes para a mesma palavra [Chapéu Azul do TDD] */
	
	
}
