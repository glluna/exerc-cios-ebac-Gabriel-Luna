package br.com.luna.service;

import br.com.luna.dao.IClienteDAO;
import br.com.luna.domain.Cliente;
import br.com.luna.exceptions.TipoChaveNaoEncontradaException;
import br.com.luna.generic.service.GenericService;

public class ClienteService extends GenericService<Cliente, Long>implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}
//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.buscarPorCPF(cpf);
	}

//	@Override
//	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
//	}

//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}




