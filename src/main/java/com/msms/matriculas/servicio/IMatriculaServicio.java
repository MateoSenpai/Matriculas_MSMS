package com.msms.matriculas.servicio;

import java.util.List;

import com.msms.matriculas.modelo.entidad.Matricula;



public interface IMatriculaServicio {
	   Matricula insertarMatricula(Matricula nuevaMatricula);

	   Matricula editarMatricula(int idMatricula);

	   void eliminarMatricula(int idMatricula);

	   List<Matricula> listarMatricula();
	}