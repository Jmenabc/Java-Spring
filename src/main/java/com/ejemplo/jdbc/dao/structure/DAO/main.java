package com.ejemplo.jdbc.dao.structure.DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// Creamos una instancia de la clase
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		AlumnoInterface psi = (AlumnoInterface) context.getBean("pedidoDao");
		// Ejecutamos el insert
		psi.insertar(
				"INSERT INTO \"EjemploRutas\".\"ejemploAlumno\" (alumno_nombre,alumno_apellido,alumno_apellido2)"
						+ "VALUES('Paco','Fernández','Herrera')");

	}

}
