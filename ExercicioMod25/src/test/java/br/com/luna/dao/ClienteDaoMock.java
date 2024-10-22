package br.com.luna.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.luna.domain.Cliente;
import br.com.luna.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDaoMock implements IClienteDAO{

	private Map<Long, Cliente> clienteMap = new HashMap<>();
	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		clienteMap.put(entity.getCpf(), entity);
		return true;
	}

	@Override
	public void excluir(Long valor) {
		clienteMap.remove(valor);
		
	}

	@Override
	public void alterar(Cliente entity) {
		 clienteMap.put(entity.getCpf(), entity);
		
	}

	@Override
	public Cliente consultar(Long valor) {
		return clienteMap.get(valor);
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return clienteMap.values();
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return clienteMap.get(cpf);
	}

	

}
