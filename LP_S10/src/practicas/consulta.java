package practicas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root","mysql");
			Statement stm= co.createStatement();
			ResultSet res= stm.executeQuery("select*from producto");
			
			while (res.next()) {
				System.out.println( res.getString("categoria")+", "+res.getString("nombres"));			 
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
