package service;

import dao.ClienteDAO;
import dao.IClienteDAO;

public class ClienteService {
	
    private IClienteDAO clienteDAO;
    
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	
	public String salvar() {
		clienteDAO.salvar();
		return "Sucesso";
	}
	
	public String buscar() {
		clienteDAO.buscar();
		return "Sucesso";
	}
	
	public String excluir() {
		clienteDAO.excluir();
		return "Sucesso";
	}
	
	public String atualizar() {
		clienteDAO.atualizar();
		return "Sucesso";
	}
	
}
