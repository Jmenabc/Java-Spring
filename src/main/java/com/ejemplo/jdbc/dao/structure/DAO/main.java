package com.ejemplo.jdbc.dao.structure.DAO;

public class main {

	public static void main(String[] args) {
		
		// TODO ("INSERT INTO \"proyectoEclipse\".\"alumnos\" (id_alumno,nombre,apellidos,email)+ "VALUES(23,'Paco','Fernández','pf@altair.es')", conexionGenerada);"
		//Creamos una instancia de la clase
		EclToPostgreImpl consulta = new EclToPostgreImpl();
		//Ejecutamos el insert
		consulta.insertar("");
		
	}

}
