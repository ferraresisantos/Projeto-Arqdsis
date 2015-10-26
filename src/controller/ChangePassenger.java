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
 * Servlet implementation class ChangePassenger
 */
@WebServlet("/changePassenger.do")
public class ChangePassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String dataNasc = request.getParameter("dataNasc");
		String banco = request.getParameter("banco");
		String tipo = request.getParameter("tipo");
		int cpf = Integer.parseInt(request.getParameter("cpf"));
//		int rg = Integer.parseInt(request.getParameter("rg"));
		int fone = Integer.parseInt(request.getParameter("fone"));
		String formtr = request.getParameter("formtr");
		Specialist spe = new Specialist();
		try {
			spe.alterarPassageiro(cpf, nome, dataNasc, sobrenome,
					banco, formtr, tipo, fone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher view = request
				.getRequestDispatcher("changePassenger.jsp");
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

	@Override
	public void init(ServletConfig config) {
		// todos os servlets do menu devem conter este metodo
		// ServiceLookup.setupDB();
	}

}
