package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Specialist;

/**
 * Servlet implementation class ExcludeFlight
 */
@WebServlet("/excludeFlight.do")
public class ExcludeFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int codigo = Integer.parseInt(request
				.getParameter("codigo"));

		Specialist spe = new Specialist();
		try {
			spe.excluirVoo(codigo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request
				.getRequestDispatcher("excludeFlight.jsp");
		view.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
