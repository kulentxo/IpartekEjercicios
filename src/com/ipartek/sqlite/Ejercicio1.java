package com.ipartek.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class Ejercicio1 {

	public static void main(String[] args) throws SQLException {
		String sql = "SELECT * from perro;";
		String url = "jdbc:sqlite:ddbb/perrera.db";
		ArrayList<Perro> perros = new ArrayList<>();

		try (Connection connect = DriverManager.getConnection(url);
				PreparedStatement pst = connect.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			while (rs.next()) {
				Perro p = new Perro();
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setRaza(rs.getString("raza"));
				p.setPeso(rs.getFloat("peso"));
				p.setHistoria(rs.getString("historia"));
				p.setVacunado(rs.getBoolean("vacunado"));
				perros.add(p);
			}

			for (Perro perro : perros) {
				System.out.println(perro);
			}
		}

	}

}
