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
 * Servlet implementation class RegisterFlight
 */
@WebServlet("/registerFlight.do")
public class RegisterFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		String origem = request.getParameter("origem");
		String destino = request.getParameter("destino");
		String escala = request.getParameter("escala");
		String datavoo = request.getParameter("datavoo");
		String hora = request.getParameter("hora");
		String tipo = request.getParameter("tipo");
		String situacao = request.getParameter("situacao");
		double preco = Double.parseDouble(request.getParameter("preco"));

		Specialist spe = new Specialist();
		try {
			spe.adicionarVoo(codigo, origem, destino, escala, datavoo, hora, tipo, situacao,
					preco);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request
				.getRequestDispatcher("registerFlight.jsp");
		view.forward(request, response);
	}

}
