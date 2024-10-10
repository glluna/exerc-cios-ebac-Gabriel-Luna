package testes;

import org.junit.Assert;
import org.junit.Test;
import dao.IClienteDAO;
import dao.ClienteDAOMock;
import service.ClienteService;

public class ClienteServiceTest {
    @Test
	public void salvarTest() {
    	IClienteDAO mockDAO = new ClienteDAOMock();
		ClienteService service = new ClienteService(mockDAO);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
    
    @Test
	public void buscarTest() {
    	IClienteDAO mockDAO = new ClienteDAOMock();
		ClienteService service = new ClienteService(mockDAO);
		String retorno = service.buscar();
		Assert.assertEquals("Sucesso", retorno);
	}
    
    @Test
	public void excluirTest() {
    	IClienteDAO mockDAO = new ClienteDAOMock();
		ClienteService service = new ClienteService(mockDAO);
		String retorno = service.excluir();
		Assert.assertEquals("Sucesso", retorno);
	}
    
    @Test
	public void atualizarTest() {
    	IClienteDAO mockDAO = new ClienteDAOMock();
		ClienteService service = new ClienteService(mockDAO);
		String retorno = service.atualizar();
		Assert.assertEquals("Sucesso", retorno);
	}
 
}
