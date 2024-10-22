package br.com.luna;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.luna.dao.IClienteDAO;
import br.com.luna.dao.ClienteDaoMock;
import br.com.luna.domain.Cliente;
import br.com.luna.exceptions.TipoChaveNaoEncontradaException;
import br.com.luna.service.ClienteService;
import br.com.luna.service.IClienteService;

public class ClienteServiceTest {
  
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
	    cliente = new Cliente();
		cliente.setCpf(12345678900L);
		cliente.setNome("Gabriel");
		cliente.setCidade("Recife");
		cliente.setEnd("End");
		cliente.setEstado("PE");
		cliente.setNumero(10);
		cliente.setTel(81999999999L);
		
	}
	
	@Test
	public void pesquisarCliente() throws TipoChaveNaoEncontradaException {
		clienteService.cadastrar(cliente);
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Gabriel Luna");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Gabriel Luna", cliente.getNome());
	}
	
}
