package com.ipartek.sqlite;

import java.sql.SQLException;

import com.ipartek.modelo.PerroDAOBBDD;
import com.ipartek.pojo.Perro;

public class Ejercicio1 {

	public static void main(String[] args) throws SQLException {
		PerroDAOBBDD dao = PerroDAOBBDD.getInstance();
		System.out.println(dao.recuperar(1));
		for (Perro perro : dao.listar()) {
			System.out.println(perro);
		}
	}

}
