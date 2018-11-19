package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class MyQuery {
	
	String url = "jdbc:mysql://127.0.0.1/quanlybaixe";
    String user = "root";
    String pass = "123456";
	
	Connection conn;
	
	public MyQuery(){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            
            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }
            
		} catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
	}
	
	public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL){
        try {
            java.sql.Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            System.out.println("Truy vấn thành công!");
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
    //Thực thi INSERT, DELETE, UPDATE
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){
       
        try {
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
            System.out.println("Update thành công!");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
