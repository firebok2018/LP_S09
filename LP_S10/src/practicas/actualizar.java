package practicas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class actualizar {
	public static void main (String[] args){
		
		String url="jdbc:mysql://localhost:3306/tienda";
		String user="root";
		String psw="mysql";
		
		try {
			Connection co = DriverManager.getConnection(url,user,psw);
			
			Statement st = co.createStatement();
			
			String sql = "update producto"+" set nombres='control remoto'"+" where id=5";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Regsitrado actualizado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
