package DAO;

import model.Usuario;

public class Teste {

	public static void main(String[] args) throws Exception {
		Usuario user = new Usuario();
		
		 user.setNome("Diego");
		user.setEndereco("Calle los mangos");
		user.setSobrenome("Da Rocha");
		
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println("Salvando a pessoa"+user.getNome());
		user = (Usuario) dao.salvar(user);
		
		user.setNome("Rafaelito");
		user= (Usuario) dao.salvar(user);
		System.out.println("Älterando a pessoa"+user.getNome());
	
		Usuario user2 = (Usuario) dao.consultarPorId(user.getId());
		System.out.println("Consultando:"+user2.getNome());
		
		System.out.println("Removendo a pessoa:"+ user.getNome());
		dao.excluir(user.getId());

	}

}
