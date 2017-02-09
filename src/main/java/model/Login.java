package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class Login {

	@Id
	@GeneratedValue
	@Column(name = "ID_LOGIN")
	private Long id;

	@Column(name = "LOGIN")
	private String login;

	@Column(name = "SENHA")
	private String senha;

	public void setId(Long id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// construtor vacio
	Login() {

	}

	// construtor dos atributos

	public Login(Long id, String login, String senha) {
		this.id = id;
		this.login = login;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", login=" + login + ", senha=" + senha + "]";
	}

	

	
}
