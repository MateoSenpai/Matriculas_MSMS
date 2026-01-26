package com.msms.matriculas.servicio;

import java.util.List;

import com.msms.matriculas.modelo.entidad.Curso;


public interface ICursoServicio {
	   Curso insertarCurso(Curso nuevoCurso);

	   Curso editarCurso(int idCurso);

	   void eliminarCurso(int idCurso);

	   List<Curso> listarCurso();
	}
