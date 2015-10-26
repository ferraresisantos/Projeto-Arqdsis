package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PassengerDAOMySQL extends PassengerDAO {
	
//	//se não for acessar localmente mude localhost pelo nome do servidor
//	private static String URL ="jdbc:sqlserver://192.168.10.48:1433;" +"databaseName=AccountsManager;";  
//	private static String usuario = "rgdias17";
//	//esse usuário é um sysadmin ele tem todos os poderes, é bom que se crie um login e usuário a parte  
//	private static String password = "#Rgdias.prtd17'";
//	//Esse é o nome do driver, que na internet você vai encontrar de varias maneiras, mas só esse resolveu meus problemas  
//	private static String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
//	
//	public Connection conectar() throws SQLException{  
//		try {  
//
//			Class.forName(driver);  
//			Connection con = DriverManager.getConnection(URL,usuario,password);  
//			return con;  
//
//		} catch (ClassNotFoundException e) {  
//			throw new SQLException(e.getMessage());  
//		}   
//	}
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
