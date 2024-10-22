package br.com.luna.generic.service;
import java.io.Serializable;
import java.util.Collection;
import br.com.luna.domain.Persistencia;
import br.com.luna.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistencia, E extends Serializable> {
	
public  Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
	
    public void excluir(E valor);
    
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;
    
    public T consultar(E valor);
    
    public Collection<T> buscarTodos();

}
