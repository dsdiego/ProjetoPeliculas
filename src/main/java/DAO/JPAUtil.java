package DAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class JPAUtil {
	
	
	@PersistenceContext(unitName = "Persistence")
	protected EntityManager em;
	
	private EntityManager getEntityManager(){
		return em;
	}
	
	
	
	
	
	
/////////////////////////////////////////
	
//private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

//public EntityManager geEntityManager(){
	//return emf.createEntityManager();
//}

//public void close(EntityManager em){
	//em.close();
//}
}
