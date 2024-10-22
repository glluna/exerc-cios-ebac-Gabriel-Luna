package br.com.luna;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.luna.dao.ClienteDAO;
import br.com.luna.dao.ClienteDaoMock;
import br.com.luna.dao.IClienteDAO;
import br.com.luna.domain.Cliente;
import br.com.luna.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
	    cliente = new Cliente();
		cliente.setCpf(12345678900L);
		cliente.setNome("Gabriel");
		cliente.setCidade("Recife");
		cliente.setEnd("End");
		cliente.setEstado("PE");
		cliente.setTel(81999999999L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		
Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException{
		cliente.setNome("Gabriel Luna");
		clienteDao.alterar(cliente);
		
		Assert.assertEquals("Gabriel Luna", cliente.getNome());
	}
	
	

}
