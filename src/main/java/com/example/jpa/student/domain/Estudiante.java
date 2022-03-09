package com.example.jpa.student.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author USER
 */
@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        if (materias == null) {
            materias = new ArrayList<>();
        }
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void addMateria(Materia materia) {
        getMaterias().add(materia);
    }

    public void removeMateria(Materia materia) {
        getMaterias().remove(materia);
    }

}