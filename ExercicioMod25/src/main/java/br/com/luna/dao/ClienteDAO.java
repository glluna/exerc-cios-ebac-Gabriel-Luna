package br.com.luna.dao;

import br.com.luna.dao.generics.GenericDAO;
import br.com.luna.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long>implements IClienteDAO {
   
	public ClienteDAO() {
		super();
	}
	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTel(entity.getTel());
		
	}
	@Override
	public Cliente buscarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
