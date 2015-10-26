package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AirplaneDAOMySQL extends AirplaneDAO {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("succ");
		} catch (ClassNotFoundException e) {
			System.out.println("erro");
			throw new RuntimeException(e);
		}
	}

	public  Connection conectar() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost:3306/aeroporto?user=root&password=root");

	}
}
