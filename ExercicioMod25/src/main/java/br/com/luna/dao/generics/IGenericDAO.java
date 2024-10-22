package br.com.luna.dao.generics;

import java.util.Collection;
import java.io.Serializable;

import br.com.luna.domain.Cliente;
import br.com.luna.domain.Persistencia;
import br.com.luna.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistencia, E extends Serializable>{
	
public  Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
	
    public void excluir(E valor);
    
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;
    
    public T consultar(E valor);
    
    public Collection<T> buscarTodos();

	public Cliente buscarPorCPF(Long cpf);



}
