package to;

import java.util.ArrayList;

import model.Ticket;

public class TicketTO {
	private ArrayList<Ticket> listarPassagem;
	private ArrayList<FlightTO> listarVoo;
	private ArrayList<PassengerTO>listarPassageiro;
	
	
	public TicketTO(){
		listarPassagem = new ArrayList<Ticket>();
		listarVoo = new ArrayList<FlightTO>();
		listarPassageiro = new ArrayList<PassengerTO>();
	}
	
	public void add(Ticket passagem){
		listarPassagem.add(passagem);
	}
	
	public boolean deletar(Ticket passagem){
		return(listarPassagem.remove(passagem));
	}
	
	public ArrayList<Ticket> getLista(){
		return listarPassagem;
	}
	
}
