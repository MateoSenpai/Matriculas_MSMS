package com.denm.matriculas.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.denm.matriculas.modelo.entidad.Estudiante;
import com.denm.matriculas.repositorio.IEstudianteRepositorio;
import com.denm.matriculas.servicio.IEstudianteServicio;

import lombok.Data;

@Service
@Data

public class EstudianteServicioImpl implements IEstudianteServicio{

    private final IEstudianteRepositorio IEstudianteRepositorio;

    EstudianteServicioImpl(IEstudianteRepositorio IEstudianteRepositorio) {
        this.IEstudianteRepositorio = IEstudianteRepositorio;
    }

	public Estudiante insertarEstudiante(Estudiante nuevoEstudiante) {
		// TODO Auto-generated method stub
		return IEstudianteRepositorio.save(nuevoEstudiante);
	}

	public Estudiante editarEstudiante(int idEstudiante) {
		// TODO Auto-generated method stub
		return IEstudianteRepositorio.findById(idEstudiante).get();
	}

	public void eliminarEstudiante(int idEstudiante) {
		// TODO Auto-generated method stub
		EstudianteServicioImpl.delete(editarEstudiante(idEstudiante));
		
	}

	private static void delete(Estudiante editarEstudiante) {
		// TODO Auto-generated method stub
		
	}

	public List<Estudiante> ListarEstudiante() {
		// TODO Auto-generated method stub
		return IEstudianteRepositorio.findAll();
	}
}
