package factory;

import dao.AirplaneDAO;
import dao.AirplaneDAOMySQL;
import dao.AirplaneDAOPOSTGRE;
import dao.AirplaneDAOSqlServer;

public class AirplaneDAOFactory {

	public static AirplaneDAO getAirplaneDAO() {
		switch (DAOFactory.banco) {

		case DAOFactory.MY_SQL:
			return new AirplaneDAOMySQL();
		case DAOFactory.POSTGRE:
			return new AirplaneDAOPOSTGRE();
		case DAOFactory.SQL_SERVER:
			return new AirplaneDAOSqlServer();

		}
		return null;
	}

}
