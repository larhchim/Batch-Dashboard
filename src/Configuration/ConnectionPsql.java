package Configuration;

import java.sql.*;

public class ConnectionPsql {

	public static Connection PsqlConnexion() throws Exception{
		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/icn","postgres","LARHCHIM");
		return conn;
	}
}
