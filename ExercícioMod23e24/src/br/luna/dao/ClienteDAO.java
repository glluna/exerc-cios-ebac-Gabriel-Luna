package dao;

public class ClienteDAO implements IClienteDAO{

	public String salvar() {
		
		throw new UnsupportedOperationException("Não funciona sem config de banco");
		//return "Sucesso";
	}

	@Override
	public String buscar() {
		throw new UnsupportedOperationException("Não funciona sem config de banco");
	}

	@Override
	public String excluir() {
		throw new UnsupportedOperationException("Não funciona sem config de banco");
	}

	@Override
	public String atualizar() {
		throw new UnsupportedOperationException("Não funciona sem config de banco");
	}
}
