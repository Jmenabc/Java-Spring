package com.ejemplo.ORM;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/*
 * Interfaz de consultas SQl
 * @author Jmenabc
 */
public interface Mapper {

	@Select("SELECT * FROM ejemploAlumno")
	public List<Alumno> selectAllAlumnos();

	@Select("SELECT * FROM ejemploAlumno WHERE id = #{id}")
	public Alumno selectAlumnoById(@Param("id") int id);

	@Insert("INSERT INTO ejemploAlumno (alumno_nombre, alumno_apellido, alumno_apellido2) VALUES (#{alumno_nombre}, #{alumno_apellido}, #{alumno_apellido2})")
	public int insertAlumno(Alumno alumno);

}
