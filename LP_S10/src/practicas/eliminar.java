package practicas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/tienda";
		String user="root";
		String psw="mysql";
		
		try {
			Connection c = DriverManager.getConnection(url,user,psw);
			
			Statement s = c.createStatement();
			
			String sql="delete from producto where nombres='control remoto'";
			int filaafectada= s.executeUpdate(sql);
			
			System.out.println("filas afectadads: "+filaafectada);
			System.out.println("registro reliminado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
