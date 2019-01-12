package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;

public class Helloworld {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		try {
			
			Class.forName("com.mysql.jdbc.Driver") ;
			String url = "";
			
			Connection conn = DriverManager.getConnection(url,"root","1234");
			
			
		} catch (Exception e) {
			
		}finally {
			
		}
	}

}
