package factory;

import to.AirplaneTO;
import to.FlightTO;
import to.PassengerTO;
import to.TicketTO;

public class TOFactory {

	public static AirplaneTO getAirplaneTO() {
		return new AirplaneTO();
	}

	public static PassengerTO getPassengerTO() {
		return new PassengerTO();
	}
	
	public static FlightTO getFlightTO() {
		return new FlightTO();
	}
	
	public static TicketTO getTicketTO(){
		return new TicketTO();
	}

}