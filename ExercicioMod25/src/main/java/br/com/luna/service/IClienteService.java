package br.com.luna.service;


import br.com.luna.domain.Cliente;
import br.com.luna.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
	
	public Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	public Cliente buscarPorCPF(Long cpf);

	public void excluir(Long cpf);

	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	

}
