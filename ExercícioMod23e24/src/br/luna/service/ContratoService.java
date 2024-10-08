package service;

import dao.IContratoDAO;

public class ContratoService implements IContratoService{
	
	private IContratoDAO contratoDAO;

	public ContratoService(IContratoDAO dao) {
		this.contratoDAO = dao;
	}

	@Override
	public String salvar() {
		contratoDAO.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar() {
		contratoDAO.buscar();
		return "Sucesso";
	}

	@Override
	public String excluir() {
		contratoDAO.excluir();
		return "Sucesso";
	}

	@Override
	public String atualizar() {
		contratoDAO.atualizar();
		return "Sucesso";
	}
    
}
