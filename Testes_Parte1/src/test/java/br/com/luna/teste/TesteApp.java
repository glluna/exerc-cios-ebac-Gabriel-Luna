package br.com.luna.teste;


import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import java.util.List;

import org.junit.Test;

import br.com.luna.App;

public class TesteApp {

	@Test
	public void TesteApptest() {
		List<String> lista = Arrays.asList("Gabriel-M", "Maria-F", "Ana-F", "João-M");
		
		List<String> listadeMulheres = App.filtrarMulheres(lista);
		
		assertTrue(listadeMulheres.contains("Maria"));
		assertTrue(listadeMulheres.contains("Ana"));
		
		assertTrue(!listadeMulheres.contains("Gabriel"));
		assertTrue(!listadeMulheres.contains("João"));
		
		
}
	
}
