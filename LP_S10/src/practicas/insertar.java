package practicas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class insertar {
	
	public static void main (String[] args){
		
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root", "mysql");
			Statement st= co.createStatement();
			
			String sql="insert into producto "+"(id,categoria,nombres)"+"value('5','categoria 5 ','control')";
			
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Regsitrado correctamente");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
