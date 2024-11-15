/**
 * 
 */
package br.com.luna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import br.com.luna.dao.*;
import br.com.luna.domain.Cliente;
/**
 * @author Gabriel Luna
 */
public class ClienteTest  {

	@Test
	public void cadastrarTest() throws Exception{
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Gabriel Luna");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.buscar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}
	
	@Test
	public void buscarTest() throws Exception{
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Gabriel Luna");
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
    	Cliente clienteBD = dao.buscar("01");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer countDel = dao.excluir(clienteBD);
		assertTrue(countDel == 1);
	}
	
	@Test
	public void atualizarTest() throws Exception{
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Gabriel Luna");
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.buscar("01");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		clienteBD.setCodigo("20");
		clienteBD.setNome("Outro nome");
		Integer countUpdate = dao.atualizar(clienteBD);
		assertTrue(countUpdate == 1);
		
		Cliente clienteBD2 = dao.buscar("20");
		assertNotNull(clienteBD2);
		assertEquals(clienteBD.getId(), clienteBD2.getId());
		assertEquals("20", clienteBD2.getCodigo());
		assertEquals("Outro nome", clienteBD2.getNome());
		
		
		dao.excluir(clienteBD2);
		
		
	}
	
	@Test
	public void excluirTest() throws Exception{
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("20");
		cliente.setNome("Outro Nome");
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.buscar("20");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer countDel = dao.excluir(clienteBD);
		assertTrue(countDel == 1);
	}
	
	@Test
	public void buscartodosTest() throws Exception{
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
  	    cliente.setCodigo("01");
	    cliente.setNome("Gabriel Luna");
		Integer countCad = dao.cadastrar(cliente);
		assertTrue(countCad == 1);
		
		Cliente clientes = new Cliente();
		clientes.setCodigo("02");
		clientes.setNome("Teste");
		Integer countCad2 = dao.cadastrar(clientes);
		assertTrue(countCad2 == 1);
		
	    
    	
    	
	}
	
	@Before
	public void limparTabela() throws Exception {
	    IClienteDAO dao = new ClienteDAO();
	    List<Cliente> clientes = dao.buscarTodos();
	    for (Cliente cliente : clientes) {
	        dao.excluir(cliente);
	    }
	}

}
