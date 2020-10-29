package com.ipartek.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prueba {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:sqlite:C:/Users/kulen/Desktop/SQL/test.db";
		Connection connect = DriverManager.getConnection(url);
		String sql = "SELECT * from tbl1;";
		PreparedStatement pst = connect.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString("one") + rs.getInt("two"));
		}

	}

}
