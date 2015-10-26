package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to.AirplaneTO;
import model.Airplane;
import model.Specialist;

/**
 * Servlet implementation class ConsultAirplane
 */
@WebServlet("/consultAirplane.do")
public class ConsultAirplane extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

//		int codigo = Integer.parseInt(request.getParameter("codigo"));
//
//		Specialist spe = new Specialist();
//		try {
//			spe.listarAeronaves(codigo);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Airplane airplane = new Airplane();
		Airplane consult = new Airplane();
		
		airplane.setCodigoAeronave(Integer.parseInt(request.getParameter("codigo")));
		
		int consulId = Integer.parseInt(request.getParameter("codigo"));
		consult.setCodigoAeronave(consulId);
		Specialist spe = new Specialist();
		AirplaneTO aeronaveTO = null;
		try {
			aeronaveTO = spe.consultarAeronave(consult);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		List<Airplane> lista = new ArrayList<>();
//		airplane.setNome("TEste");
//		airplane.setQtdAssentos(123);
//		airplane.setTipo("coisa");
//		lista.add(airplane); 
		request.setAttribute("lista", aeronaveTO.getLista());
		RequestDispatcher view = request
				.getRequestDispatcher("consultAirplane.jsp");
		view.forward(request, response);
	}

	@Override
	public void init(ServletConfig config) {
		// todos os servlets do menu devem conter este metodo
		// ServiceLookup.setupDB();
	}

}
