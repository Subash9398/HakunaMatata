package Ecom;

import java.sql.*;

public class Ecomm {
	public static void main(String args[])
	{
	try {
		//Class.forName("org.sqlite.JDBC");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://106.51.1.63;databaseName={fresher_ecom_task};","ecomfresher","Change@Fresher");
		Statement s1 = c.createStatement();
		 s1.executeUpdate("ALTER TABLE ProductsDetails MODIFY COLUMN S_No AUTOINCREMENT PRIMARY KEY");
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
