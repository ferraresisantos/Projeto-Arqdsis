package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AirplaneDAOSqlServer extends AirplaneDAO {
	
	//se n�o for acessar localmente mude localhost pelo nome do servidor
		private static String URL ="jdbc:sqlserver://192.168.10.48:1433;" +"databaseName=AccountsManager;";  
		private static String usuario = "rgdias17";
		//esse usu�rio � um sysadmin ele tem todos os poderes, � bom que se crie um login e usu�rio a parte  
		private static String password = "#Rgdias.prtd17'";
		//Esse � o nome do driver, que na internet voc� vai encontrar de varias maneiras, mas s� esse resolveu meus problemas  
		private static String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
		
		public Connection conectar() throws SQLException{  
			try {  

				Class.forName(driver);  
				Connection con = DriverManager.getConnection(URL,usuario,password);  
				return con;  

			} catch (ClassNotFoundException e) {  
				throw new SQLException(e.getMessage());  
			}   
		}
}

