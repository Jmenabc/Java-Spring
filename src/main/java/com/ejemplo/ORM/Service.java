package com.ejemplo.ORM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Service implements Mapper {

	@Autowired
	private Mapper mapper;

	public List<Alumno> selectAllAlumnos() {
		// TODO Auto-generated method stub
		return mapper.selectAllAlumnos();
	}

	public Alumno selectAlumnoById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectAlumnoById(id);
	}

	public int insertAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return mapper.insertAlumno(alumno);
	}

}
