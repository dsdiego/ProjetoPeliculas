package DAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

public EntityManager geEntityManager(){
	return emf.createEntityManager();
}

public void close(EntityManager em){
	em.close();
}
}
