package com.ejemplo.ORM;

import java.util.List;

import org.apache.ibatis.annotations.Select;

/*
 * 
 * @author Jmenabc
 */
public interface Mapper {
	
	@Select("")
	public List<Alumno> selectAllAlumnos();
	
}
