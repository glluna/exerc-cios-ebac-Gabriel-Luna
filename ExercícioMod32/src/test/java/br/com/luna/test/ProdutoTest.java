package br.com.luna.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.luna.dao.IProdutoDao;
import br.com.luna.dao.ProdutoDao;
import br.com.luna.domain.Produto;

public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("A1");
		prod.setValor(15d);
		prod = produtoDao.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}
}
