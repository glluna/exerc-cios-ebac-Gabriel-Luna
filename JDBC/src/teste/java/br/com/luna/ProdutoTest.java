package br.com.luna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import br.com.luna.dao.IProdutoDAO;
import br.com.luna.dao.ProdutoDAO;

import br.com.luna.domain.Produto;
public class ProdutoTest {

	@Test
	public void CadastrarTest() throws Exception {
			IProdutoDAO dao = new ProdutoDAO();
			
			Produto produto = new Produto();
			produto.setCodigo("01");
			produto.setNome("samsung galaxy A 53");
			Integer qtd = dao.cadastrar(produto);
			assertTrue(qtd == 1);
			
			Produto produtoBD = dao.buscar("01");
			assertNotNull(produtoBD);
			assertNotNull(produtoBD.getId());
			assertEquals(produto.getCodigo(), produtoBD.getCodigo());
			assertEquals(produto.getNome(), produtoBD.getNome());
		
		
	}
	
	@Test
	public void BuscarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("samsung galaxy A 53");
		Integer qtd = dao.cadastrar(produto);
		assertTrue(qtd == 1);
		
		Produto produtoBD = dao.buscar("01");
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		
	}
	
	@Test
	public void AtualizarTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("samsung galaxy A 53");
		Integer qtd = dao.cadastrar(produto);
		assertTrue(qtd == 1);
		
		Produto produtoBD = dao.buscar("01");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		produtoBD.setCodigo("20");
		produtoBD.setNome("Outro nome");
		Integer countUpdate = dao.atualizar(produtoBD);
		assertTrue(countUpdate == 1);
		
		Produto produtoBD2 = dao.buscar("20");
		assertNotNull(produtoBD2);
		assertEquals(produtoBD.getId(), produtoBD2.getId());
		assertEquals("20", produtoBD2.getCodigo());
		assertEquals("Outro nome", produtoBD2.getNome());
		
		
		
		}
	
	@Test
	public void ExcluirTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("20");
		produto.setNome("Outro nome");
		Integer qtd = dao.cadastrar(produto);
		assertTrue(qtd == 1);
		
		Produto produtoBD = dao.buscar("20");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
	
		
		
	}
	
		@Test
		public void buscarTodosTest() throws Exception {
            IProdutoDAO dao = new ProdutoDAO();
			
			Produto produto = new Produto();
			produto.setCodigo("01");
			produto.setNome("samsung galaxy A 53");
			Integer countCad = dao.cadastrar(produto);
			assertTrue(countCad == 1);
			
			Produto produtos = new Produto();
			produtos.setCodigo("20");
			produtos.setNome("Outro nome");
			Integer countCad2 = dao.cadastrar(produtos);
			assertTrue(countCad2 == 1);
				
			}
    	
	}

