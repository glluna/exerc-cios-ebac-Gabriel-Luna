/**
 * 
 */
package br.com.luna.dao;

import java.util.List;

import br.com.luna.domain.Cliente;

/**
 * @author Gabriel Luna
 */
public interface IClienteDAO {

	public Integer cadastrar(Cliente cliente) throws Exception;
	
	public Integer atualizar(Cliente cliente) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;
	
	public Cliente buscar(String codigo) throws Exception;
	
	public List<Cliente> buscarTodos() throws Exception;
	
}
