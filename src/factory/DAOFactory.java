package factory;

import dao.AirplaneDAO;
import dao.FlightDAO;
import dao.PassengerDAO;
import dao.TicketDAO;

public class DAOFactory {

	public static final int MY_SQL = 0; // banco default
	public static final int POSTGRE = 1;
	public static final int SQL_SERVER = 2;
	public static int banco;

	public static AirplaneDAO getAirplaneDAO() {
		return AirplaneDAOFactory.getAirplaneDAO();
	}

	public static PassengerDAO getPassengerDAO() {
		return PassengerDAOFactory.getPassengerDAO();
	}
	
	public static FlightDAO getFlightDAO() {
		return FlightDAOFactory.getFlightDAO();
	}
	
	public static TicketDAO getTicketDAO() {
		return TicketDAOFactory.getTicketDAO();
	}

}
