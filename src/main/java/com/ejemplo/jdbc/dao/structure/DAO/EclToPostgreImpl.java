package com.ejemplo.jdbc.dao.structure.DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
/*
 * Clase que contiene La implementación del datasource y el método insertar
 * @author Jmenabc
 */
public class EclToPostgreImpl implements AlumnoInterface {

	// Usamos el datasource
	DataSource dataSource;

	// Generamos sus getter y setter, para recoger y enviar la información de inicio
	// de sesión
	public DataSource getDatasource() {
		return dataSource;
	}

	public void setDatasource(DataSource datasource) {
		this.dataSource = datasource;
	}

	public void insertar(String consulta) {

		try {
			// Hacemos la conexion
			System.out.println("[EclToPostgreImpl.java]: Generando conexión");
			System.out.println(dataSource.getConnection());
			Connection cn = this.dataSource.getConnection();
			System.out.println(cn);

			// Preparamos el Statement
			System.out.println("[EclToPostgreImpl.java]: Preparamos el Statement");
			java.sql.Statement declaracionSQL = null;

			// Creamos la consulta
			declaracionSQL = cn.createStatement();
			System.out.println("[EclToPostgreImpl.java | Insert]: Creamos la consulta");
			// Ejecutamos la consulta
			declaracionSQL.execute(consulta);
			System.out.println("[EclToPostgreImpl.java | Insert]: Ejecutando consulta");
			// Cerramos la declaración SQL
			declaracionSQL.close();
			System.out.println("[EclToPostgreImpl.java | Insert]: Cerramos la declaración SQL");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[EclToPostgreImpl.java]: La conexión ha fallado (CONEXION == NULL)");

			e.printStackTrace();
		}
	}

}
