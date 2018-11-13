package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static Connection con = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/quanlybaixe";
			String user = "baixe";
			String password = "123456";
			con = DriverManager.getConnection(url, user, password);
		}
		return con;
	}
}
