package model;

import to.AirplaneTO;
import to.FlightTO;
import to.PassengerTO;
import to.TicketTO;
import factory.DAOFactory;

public class Specialist {

	public Specialist() {
	}

	public void adicionarAeronave(int codigo, int qtdassentos,
			String tipo, String nome) throws Exception {

		DAOFactory.getAirplaneDAO().inserirAeronave(codigo,
				qtdassentos, tipo, nome);
	}

	public void excluirAeronave(int codigo) throws Exception {

		DAOFactory.getAirplaneDAO().excluirAeronave(codigo);
	}

	public void alterarAeronave(int codigo, int qtdassentos,
			String tipo, String nome) throws Exception {

		DAOFactory.getAirplaneDAO().alterarAeronave(codigo,
				qtdassentos, tipo, nome);
	}

	public AirplaneTO listarAeronaves(int codigo) {

		return DAOFactory.getAirplaneDAO().listarAeronaves(codigo);
	}

	public void adicionarPassageiro(int cpf, String nome,
			String dataNasc, String sobrenome, String banco,
			String formtr, String tipo, int fone)
			throws Exception {

		DAOFactory.getPassengerDAO().inserirPassageiro(cpf, nome,
				dataNasc, sobrenome, banco,
				tipo, formtr, fone);
	}

	public void alterarPassageiro(int cpf, String nome,
			String dataNasc, String sobrenome, String banco,
			String formtr, String tipo, int fone) throws Exception {

		DAOFactory.getPassengerDAO().alterarPassageiro(cpf, nome,
				dataNasc, sobrenome, banco,
				tipo, formtr, fone);
	}

	public void excluirPassageiro(int cpf) throws Exception {

		DAOFactory.getPassengerDAO().excluirPassageiro(cpf);

	}

	public PassengerTO listarPassageiro(int cpf) {

		return DAOFactory.getPassengerDAO().listarPassageiro(cpf);
	}

	public void adicionarVoo(int codigo, String origem, String destino, String escala, String datavoo,
			String hora, String tipo, String situacao, double preco)
			throws Exception {
		DAOFactory.getFlightDAO().adicionarVoo(codigo, origem, destino, escala, datavoo, hora, tipo, situacao,
				preco);

	}

	public void alterarVoo(int codigo, String origem, String destino, String escala, String datavoo,
			String hora, String tipo, String situacao, double preco) throws Exception {

		DAOFactory.getFlightDAO().alterarVoo(codigo, origem, destino, escala, datavoo,
			 hora, tipo, situacao, preco);
	}

	public FlightTO consultarVoo(int idVoo) {

		return DAOFactory.getFlightDAO().consultarVoo(idVoo);
	}

	public void excluirVoo(int idVoo) throws Exception {

		DAOFactory.getFlightDAO().excluirVoo(idVoo);

	}

	public void adicionarPassagem(int codigo, int cpf,String nome, String sobrenome, String origem, String destino, String datavoo, String hora,
			double valor, double taxa) throws Exception{
		DAOFactory.getTicketDAO().adicionarPassagem(codigo, cpf,nome, sobrenome, origem, destino,  datavoo,  hora,
				 valor,  taxa);
	}
	
	public void alterarPassagem(int codigo, int cpf,String nome, String sobrenome, String origem, String destino, String datavoo, String hora,
			double valor, double taxa) throws Exception{
		DAOFactory.getTicketDAO().alterarPassagem(codigo, cpf,nome, sobrenome, origem, destino,  datavoo,  hora,
				 valor,  taxa);
		
	}
	
	public TicketTO consultarPassagem(int cpf) throws Exception{
		//String consul = ""+DAOFactory.getTicketDAO().consultarPassagem(cpf)+"\n" 
			//	+ DAOFactory.getPassengerDAO().listarPassageiro(cpf)+ "\n" 
				//+ DAOFactory.getFlightDAO().consultarVoo(idVoo);
		return  DAOFactory.getTicketDAO().consultarPassagem(cpf);
	}
	
	public void  excluirPassagem(int codigo) throws Exception{
		DAOFactory.getTicketDAO().excluirPassagem(codigo);
		
	}
	
	public AirplaneTO consultarAeronave(Airplane airplane) throws Exception {
		return DAOFactory.getAirplaneDAO().consultarAeronave(airplane);
	}
	public PassengerTO consultarPassageiro(Passenger passageiro)throws Exception{
		return DAOFactory.getPassengerDAO().consultarPassageiro(passageiro);
		
	}
	public FlightTO consultarVoo(Flight voo) throws Exception{
		return DAOFactory.getFlightDAO().consultarVoo(voo);
	}
	public TicketTO consultarPassagem(Ticket passagem) throws Exception{
		return  DAOFactory.getTicketDAO().consultarPassagem(passagem);
	}
}
