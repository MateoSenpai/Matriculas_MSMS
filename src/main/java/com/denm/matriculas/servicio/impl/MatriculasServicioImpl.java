package com.denm.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.denm.matriculas.modelo.entidad.Matricula;
import com.denm.matriculas.repositorio.IMatriculaRepositorio;
import com.denm.matriculas.servicio.IMatriculaservicio.IMatriculasServicio;

import lombok.Data;

@Service
@Data

public class MatriculasServicioImpl implements IMatriculasServicio {

	@Autowired
	public IMatriculaRepositorio repoIMatriculaRepositorio;
	
	
	@Override
	public Matricula insertarMatricula(Matricula nuevoMatricula) {
		// TODO Auto-generated method stub
		return nuevoMatricula ;
	}

	@Override
	public Matricula editarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Matricula> ListarMatricula() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
