package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PassengerDAOSqlServer extends PassengerDAO {
	static {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public  Connection conectar() throws SQLException {
		return DriverManager
				.getConnection("jdbc:");
	}
}

