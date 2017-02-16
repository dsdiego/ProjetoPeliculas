package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "SOBRENOME")
	private String sobrenome;

	@Column(name = "ENDERECO")
	private String endereco;



	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ID_LOGIN")
	private Login login;
	// setters

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// get da Clase Login
	public void setLogin(Login login) {
		this.login = login;
	}

	// getters

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	// get da Classe Login

	public Login getLogin() {
		return login;
	}

	// metodo vacio

	public Usuario() {

	}

	// cosntrutor dos atributos

	public Usuario(Long id, String nome, String sobrenome, String endereco) {

		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
	}

	// toString para listar

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", endereco=" + endereco
				+ ", login=" + login + "]";
	}

}
