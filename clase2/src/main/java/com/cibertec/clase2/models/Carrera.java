package com.cibertec.clase2.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCarrera;
    private String jefeCarrera;
    private Integer cantidadCiclos;
    @OneToMany(mappedBy = "carrera")
    private List<Alumno> alumno;

    public Carrera() {
    }

    public Carrera(Long id, String nombreCarrera, String jefeCarrera, Integer cantidadCiclos) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.jefeCarrera = jefeCarrera;
        this.cantidadCiclos = cantidadCiclos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getJefeCarrera() {
        return jefeCarrera;
    }

    public void setJefeCarrera(String jefeCarrera) {
        this.jefeCarrera = jefeCarrera;
    }

    public Integer getCantidadCiclos() {
        return cantidadCiclos;
    }

    public void setCantidadCiclos(Integer cantidadCiclos) {
        this.cantidadCiclos = cantidadCiclos;
    }
}
