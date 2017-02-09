 package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;
import javassist.expr.NewArray;

@Entity
@Table(name = "ATORES")
public class Atores implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_ATORES")
	@GeneratedValue
	private Long id;
	
	@Column(name = "NOME_ATOR")
	private String nome;
	
	@Column(name = "NACIONALIDADE_ATOR")
	private String nacionalidade;
	
	@ManyToMany(mappedBy = "atores")
	private Collection<Movie> movie = new ArrayList<>();
	
	
	
	//construtor vacio
	public Atores(){
		
	}

//getters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}
	
	public Collection<Movie> getMovie() {
		return movie;
	}
	
	

//setters
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public void setMovie(Collection<Movie> movie) {
		this.movie = movie;
	}

	public Atores(Long id, String nome, String nacionalidade, Collection<Movie> movie) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.movie = movie;
	}
	
	
	

	
	
}
