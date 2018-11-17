package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class MyQuery {
	
	public static ResultSet excuteQuery(String sql) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1/quanlybaixe";
		String user = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection complete");
		
		PreparedStatement stmt = null;
		stmt = con.prepareStatement(sql);
		System.out.println("CreateStatement complete");
		
		ResultSet rs = stmt.executeQuery();
		System.out.println("ResultSet complete");
		
		return rs;
	}
}
