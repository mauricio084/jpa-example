package com.example.jpa.student.domain;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * @author USER
 */
@Entity
@Getter
@Setter
public class Estudiante {

    @Id
    @GeneratedValue
    private Long id;
    
    @Basic
    private String codigo;
    
    @Basic
    private String nombre;
    
    @ManyToMany
    private List<Materia> materias;

    public void addMateria(Materia materia) {
        getMaterias().add(materia);
    }

    public void removeMateria(Materia materia) {
        getMaterias().remove(materia);
    }

}