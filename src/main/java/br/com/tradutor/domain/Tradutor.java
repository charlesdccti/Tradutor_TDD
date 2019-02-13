package br.com.tradutor.domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tradutor {
	
	private Map<String, String> traducoes = new HashMap<>();

	public boolean estaVazio() {
		return traducoes.isEmpty();
	}

	public void adicionaTraducao(String palavra, String traducao) {
		if(traducoes.containsKey(palavra)) {
			traducao = traduzir(palavra)+", "+traducao;
		}
		this.traducoes.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		return traducoes.get(palavra);
	}

	public String traduzirFrase(String frase) {
		String[] palavras = frase.split(" ");
		String fraseTraduzida = "";
		for (String palavra : palavras) {
			String traducao = traduzir(palavra);
			fraseTraduzida += " " + traducao;
		}
		return fraseTraduzida.trim();
	}

}
