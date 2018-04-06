package jtables;

import java.sql.Statement;
import java.sql.Connection ;
import java.sql.ResultSet;
import java.sql.SQLException;

public class modelclass {

	private static Connection con = null;
	private Statement  stmt = null;
	private static ResultSet result = null;
	private Dbconnection connobj = new Dbconnection();
	
	public void select() throws SQLException {
		con = connobj.connect();
		stmt =  con.createStatement();
		result = stmt.executeQuery("SELECT * FROM etudiantb");
		Object[] obj = new Object[5];
		int i = 0;
		while(result.next()) {
		
			System.out.println(result.getInt("id"));
			
		}
		
	connobj.Closeconnection();
		
	}
}
