package com.msms.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.msms.matriculas.modelo.entidad.Profesor;

@Repository
@Component
public interface IProfesorRepositorio extends JpaRepository<Profesor, Integer>{
	Profesor findByEmailProfesor(String email);
}
