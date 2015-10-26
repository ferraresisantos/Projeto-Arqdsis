package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Ticket;
import model.Specialist;
import to.AirplaneTO;
import to.TicketTO;

/**
 * Servlet implementation class TicketReport
 */
@WebServlet("/consultTicket.do")
public class TicketReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Ticket ticket = new Ticket();
		Ticket consult = new Ticket();
		
		ticket.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		
		int consulId = Integer.parseInt(request.getParameter("codigo"));
		consult.setCodigo(consulId);
		Specialist spe = new Specialist();
		TicketTO ticketTO = null;
		try {
			ticketTO = spe.consultarPassagem(consult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("lista", ticketTO.getLista());
		RequestDispatcher view = request
				.getRequestDispatcher("consultTicket.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
