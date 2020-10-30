package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOBBDD implements PerroDao {

	private static final String PATH = "jdbc:sqlite:ddbb/perrera.db";

	@Override
	public ArrayList<Perro> listar() throws SQLException {
		String sql = "SELECT * from perro;";
		ArrayList<Perro> perros = new ArrayList<>();

		try (Connection connect = DriverManager.getConnection(PATH);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return perros;
	}

	/**
	 * @throws SQLException
	 *
	 */
	@Override
	public Perro recuperar(int id) throws SQLException {
		Perro perro = null;
		String sql = "SELECT * from perro WHERE id = ?;";
		try (Connection connect = DriverManager.getConnection(PATH);
				PreparedStatement pst = connect.prepareStatement(sql);) {
			pst.setInt(1, id);
			try (ResultSet rs = pst.executeQuery();) {
				while (rs.next()) {
					perro = new Perro();
					perro.setId(rs.getInt("id"));
					perro.setNombre(rs.getString("nombre"));
					perro.setRaza(rs.getString("raza"));
					perro.setPeso(rs.getFloat("peso"));
					perro.setHistoria(rs.getString("historia"));
					perro.setVacunado(rs.getBoolean("vacunado"));
				}
			}
		}
		return perro;
	}

	/**
	 *
	 */
	@Override
	public Perro crear(Perro p) throws Exception {
		Perro perro = null;
		String sql = "INSERT INTO perro (nombre, raza) VALUES (?, ?);";
		try (Connection connect = DriverManager.getConnection(PATH);
				PreparedStatement pst = connect.prepareStatement(sql);) {
			pst.setString(1, p.getNombre());
			pst.setString(2, p.getRaza());

			pst.executeUpdate();
		}
		return perro;
	}

	/**
	 *
	 */
	@Override
	public Perro modificar(Perro p) throws Exception {
		Perro perro = null;
		final String sql = "UPDATE perro SET nombre = ? , raza = ? WHERE id = ?;";
		try (Connection connect = DriverManager.getConnection(PATH);
				PreparedStatement pst = connect.prepareStatement(sql);) {

			pst.setString(1, p.getNombre());
			pst.setString(2, p.getRaza());
			pst.setInt(3, p.getId());

			pst.executeUpdate(); // CUIDADO no usar executeQuery

		}

		return perro;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		boolean resul = false;
		final String sql = "DELETE FROM perro WHERE id = ?;";
		try (Connection conn = DriverManager.getConnection(PATH); PreparedStatement pst = conn.prepareStatement(sql);) {

			pst.setInt(1, id);

			if (1 == pst.executeUpdate()) {
				resul = true;
			}

		}
		return resul;
	}

	@Override
	public Perro vacunar(Perro p) throws SQLException {
		Perro perro = null;
		final String sql = "UPDATE perro SET vacunado = ? WHERE id = ?;";
		try (Connection connect = DriverManager.getConnection(PATH);
				PreparedStatement pst = connect.prepareStatement(sql);) {

			pst.setBoolean(1, p.isVacunado());
			pst.setInt(2, p.getId());

			pst.executeUpdate(); // CUIDADO no usar executeQuery

		}

		return perro;
	}

}
