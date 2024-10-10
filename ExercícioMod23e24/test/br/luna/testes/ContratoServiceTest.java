package testes;

import org.junit.Assert;
import org.junit.Test;
import dao.IContratoDAO;
import mock.ContratoDAOMock;
import dao.ContratoDAO;
import service.ContratoService;
import service.IContratoService;
public class ContratoServiceTest {
    
	@Test
	public void salvarTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	
}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarComBancoDeDadosTest() {
		IContratoDAO dao = new ContratoDAO();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	
}
	
	@Test
	public void buscarTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Sucesso", retorno);
	
}
	
	@Test
	public void excluirTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Sucesso", retorno);
	
}
	
	@Test
	public void atualizarTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Sucesso", retorno);
	
}
	
	
}

