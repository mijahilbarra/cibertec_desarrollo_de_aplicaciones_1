package com.cibertec.clase1.servicios;

import com.cibertec.clase1.entidades.Alumno;
import com.cibertec.clase1.repositorios.AlumnoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServicios {
    private AlumnoRepository repositorio;

    public AlumnoServicios(AlumnoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Iterable<Alumno> findAll() {
        return repositorio.findAll();
    }
}
