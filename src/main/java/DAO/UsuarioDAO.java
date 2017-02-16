package DAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public  class UsuarioDAO implements DAO{
	
	Usuario usuario = new Usuario();

	public EntityManager getEntityManager() {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		try{
			//Obtem o factory a partir da unidade de persistencia.
			factory = Persistence.createEntityManagerFactory("Persistencia");
			//Cria um entity  manager.
			entityManager = factory.createEntityManager();
			//Fecha o factory para liberar os recursos utilizado.
			
		}finally{
			factory.close();
		}
		return entityManager;
		
	}
	
	@Override
	public Usuario salvar(Usuario usuario) throws Exception {
		EntityManager entityManager = getEntityManager();
		try {
			//inicia uma transacao com o banco de dados.
			entityManager.getTransaction().begin();
			System.out.println("Salvando o Usuario.");
			/*Verifica se a pessoa aunda nao esta salva no banco.*/
			if (usuario.getId() == null){
				entityManager.persist(usuario);
			}else {
				usuario = entityManager.merge(usuario);
			}
			//finaliza a transacao.
			entityManager.getTransaction().commit();
		}finally{
			entityManager.close();
		}
		return usuario;
	}

	
	//Metodo que apaga a pessoa do banco de dados.
	@Override
	public void excluir(Long id) {
	EntityManager entityManager = getEntityManager();
	try{
		//inicia uma transacao com o banco de dados.
		entityManager.getTransaction().begin();
		//Consulta a pessoa na base de dados atraves do seu ID.
			Usuario usuario = (Usuario) consultarPorId(id);
		System.out.println("Excluindo o Usuario:");
		
		//Remove o Usuario da base de dados.
		entityManager.remove(usuario);
		//Finaliza a transacao.
		entityManager.getTransaction().commit();
		}finally{
			entityManager.close();
		}
		
	}

	@Override
	public Object consultarPorId(Long id) {
		
		EntityManager entityManager = getEntityManager();
		Usuario usuario = null;
		try{
			usuario = entityManager.find(Usuario.class, id);
		}finally{
			entityManager.close();
	
		}
		return usuario;
		
	}

	

}
