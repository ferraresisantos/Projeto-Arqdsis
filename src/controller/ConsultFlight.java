package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to.FlightTO;
import to.PassengerTO;
import model.Flight;
import model.Passenger;
import model.Specialist;

/**
 * Servlet implementation class ConsultFlight
 */
@WebServlet("/consultFlight.do")
public class ConsultFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		Flight flight = new Flight();
		Flight consult = new Flight();
		
		flight.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		
		int consulId = Integer.parseInt(request.getParameter("codigo"));
		consult.setCodigo(consulId);
		FlightTO flightTO = null;
		int codigo = Integer.parseInt(request.getParameter("codigo"));

		Specialist spe = new Specialist();
		try {
			flightTO = spe.consultarVoo(consult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("lista", flightTO.getLista());
		RequestDispatcher view = request
				.getRequestDispatcher("consultFlight.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
