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
 * Servlet implementation class RegisterTicket
 */
@WebServlet("/registerTicket.do")
public class RegisterTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		int cpf = Integer.parseInt(request.getParameter("cpf"));
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String origem = request.getParameter("origem");
		String destino = request.getParameter("destino");
		String datavoo = request.getParameter("datavoo");
		String hora = request.getParameter("hora");
		double valor = Double.parseDouble(request.getParameter("valor"));
		double taxa = Double.parseDouble(request.getParameter("taxa"));
		Specialist spe = new Specialist();

		try {
			spe.adicionarPassagem(codigo, cpf,nome, sobrenome, origem, destino,  datavoo,  hora, valor,  taxa);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request
				.getRequestDispatcher("registerTicket.jsp");
		view.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
