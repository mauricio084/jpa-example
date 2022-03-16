package com.example.jpa.student.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author USER
 */
@Entity
@Getter
@Setter
public class Materia {

    @Id
    @GeneratedValue
    private Long id;
    
    @Basic
    private String codigo;

    @Basic
    private String nombre;

}