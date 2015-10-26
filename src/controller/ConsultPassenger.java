package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to.AirplaneTO;
import to.PassengerTO;
import model.Airplane;
import model.Passenger;
import model.Specialist;

/**
 * Servlet implementation class ConsultPassenger
 */
@WebServlet("/consultPassenger.do")
public class ConsultPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		Passenger passenger = new Passenger();
		Passenger consult = new Passenger();
		
		passenger.setCpf(Integer.parseInt(request.getParameter("cpf")));
		
		int consulId = Integer.parseInt(request.getParameter("cpf"));
		consult.setCpf(consulId);
		PassengerTO passengerTO = null;
		int cpf = Integer.parseInt(request.getParameter("cpf"));

		Specialist spe = new Specialist();
		try {
			passengerTO = spe.consultarPassageiro(consult);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("21321");
		request.setAttribute("lista", passengerTO.getLista());
		RequestDispatcher view = request
				.getRequestDispatcher("consultPassenger.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
