package com.example.jpa.publish.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Author {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	@Transient
	Integer cantidadLibros;
	
	@Temporal(TemporalType.DATE)
	Date fechaLanzamiento;
	
	LocalDate fecha;
	
	@Enumerated(EnumType.ORDINAL)
	Genero genero;
	
	@OneToMany(mappedBy = "author")
	List<Publication> publicaciones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Publication> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publication> publicaciones) {
		this.publicaciones = publicaciones;
	}
}
