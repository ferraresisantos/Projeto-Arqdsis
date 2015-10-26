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
 * Servlet implementation class RegisterPassenger
 */
@WebServlet("/registerPassenger.do")
public class RegisterPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterPassenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String dataNasc = request.getParameter("dataNasc");
		String sobrenome = request.getParameter("sobrenome");
		String banco = request.getParameter("banco");
		String formtr = request.getParameter("formtr");
		String tipo = request.getParameter("tipo");
		int cpf = Integer.parseInt(request.getParameter("cpf"));
		int fone = Integer.parseInt(request.getParameter("fone"));
		System.out.println("1231");
		
		Specialist spe = new Specialist();

		try {
			spe.adicionarPassageiro(cpf, nome,
					dataNasc, sobrenome, banco,
					tipo, formtr, fone);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request
				.getRequestDispatcher("registerPassenger.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

	@Override
	public void init(ServletConfig config) {
		// todos os servlets do menu devem conter este metodo
		// ServiceLookup.setupDB();
	}

}
