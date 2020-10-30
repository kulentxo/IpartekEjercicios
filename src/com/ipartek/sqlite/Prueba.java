package com.ipartek.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prueba {

	public static void main(String[] args) throws SQLException {
		String sql = "SELECT * from tbl1;";
		String url = "jdbc:sqlite:ddbb/test.db";

		try (Connection connect = DriverManager.getConnection(url);
				PreparedStatement pst = connect.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			while (rs.next()) {
				System.out.println(rs.getString("one") + rs.getInt("two"));
			}
		}

	}

}
