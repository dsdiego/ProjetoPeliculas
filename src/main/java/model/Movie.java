package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE")
public class Movie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID_MOVIE")
	private Long id;
	
	@Column(name = "NOME_FILM" )
	private String nomeFilm;
	
	@Column(name = "DATA_LANCAMENTO")
	private LocalDate dataLancamento;
	
	@Column(name = "GENERO")
	private String genero;


	
	@ManyToMany
@JoinTable(name = "Movie_Ator",
		joinColumns= @JoinColumn(name = "ID_MOVIE"),
		inverseJoinColumns = @JoinColumn(name = "ID_ATORES"))
private Collection<Atores> atores = new ArrayList<>();
	
	
	//construtor vacio
	public Movie(){
		
	}
	
	//setter
	public void setId(Long id){
		this.id = id;
	}
	
	public void setNomeFilm(String nomeFilm){
		this.nomeFilm = nomeFilm;
	}
	
	public void setDataLancamento(LocalDate dataLancamento){
		this.dataLancamento = dataLancamento;
		}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	//public void setAtores(Atores atores) {
		//this.atores = atores;
	//}
	
	//getter
	
	public Long getId(){
		return id;
	}
	
	public String getNomeFilm(){
		return nomeFilm;
	}

	public LocalDate getDataLancamento(){
		return dataLancamento;
	}
	
	public String getGenero(){
		return genero;
	}
	
	//public Atores getAtores() {
		//return atores;
//}

	public Movie(Long id, String nomeFilm, LocalDate dataLancamento, String genero, Atores atores) {
		
		this.id = id;
		this.nomeFilm = nomeFilm;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		//this.atores = atores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atores == null) ? 0 : atores.hashCode());
		result = prime * result + ((dataLancamento == null) ? 0 : dataLancamento.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeFilm == null) ? 0 : nomeFilm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (atores == null) {
			if (other.atores != null)
				return false;
		} else if (!atores.equals(other.atores))
			return false;
		if (dataLancamento == null) {
			if (other.dataLancamento != null)
				return false;
		} else if (!dataLancamento.equals(other.dataLancamento))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeFilm == null) {
			if (other.nomeFilm != null)
				return false;
		} else if (!nomeFilm.equals(other.nomeFilm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", nomeFilm=" + nomeFilm + ", dataLancamento=" + dataLancamento + ", genero="
				+ genero + ", atores=" + atores + "]";
	}
	
	
	
	
}
