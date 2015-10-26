package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Specialist;

/**
 * Servlet implementation class RegisteringAirplane
 */
@WebServlet("/cadastrarAeronave.do")
public class RegisterAirplane extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int codigo = Integer.parseInt(request.getParameter("codigo"));
//		int codigo = 2;
		int qtdassentos = Integer.parseInt(request.getParameter("qtdassentos"));
		String tipo = request.getParameter("tipo");
		String nome = request.getParameter("nome");

		Specialist spe = new Specialist();
		try {
			spe.adicionarAeronave(codigo, qtdassentos, tipo,
					nome);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request
				.getRequestDispatcher("registeringAirplane.jsp");
		view.forward(request, response);
	}

	@Override
	public void init(ServletConfig config) {
		// todos os servlets do menu devem conter este metodo
		// ServiceLookup.setupDB();
	}

}
