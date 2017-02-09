package dao;

import javax.persistence.EntityManager;

public class DAO<T> {
	
	public final Class<T> classe;
	
	public DAO(Class<T> classe){
		this.classe = classe;
	} 
	
	public void adiciona(T t){
		
		// consegue a entity manager
		EntityManager em = new JPAUtil().geEntityManager();
		
		//abre trancacao
		em.getTransaction().begin();
		
		// persiste o objeto
		em.persist(t);
		
		//comita a transacao
		em.getTransaction().commit();
		
		// fecha a entity manager
		em.close();
		
	   
	}

	
}
