package DAO;

import javax.persistence.EntityManager;

import model.Usuario;



public interface DAO {
	
	EntityManager getEntityManager();

	public Usuario salvar (Usuario usuario) throws Exception;
	
	public void excluir (Long id);
	
	public Object consultarPorId(Long id);
	
	
	
}
