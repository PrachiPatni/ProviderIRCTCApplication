package in.prachi.service;

import java.util.Collection;
import java.util.List;

import in.prachi.bindings.Passengers;
import in.prachi.bindings.Ticket;

public interface TicketService {

	//ticket booking 
	public Ticket bookTicket(Passengers p);
	
	//getting the ticket
	public Collection<Ticket> getAllTickets();
}
