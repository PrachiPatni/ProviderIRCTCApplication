package in.prachi.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.prachi.bindings.Passengers;
import in.prachi.bindings.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	//because I am not using a database here I am taking map to store our tickets here 
Map<Integer,Ticket>db= new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passengers p) {
		Ticket t= new Ticket();
		Random r= new Random(100000);
		int id= r.nextInt();
		t.setTicketNum(null);
		BeanUtils.copyProperties(p, t);//to copy the properties from passengers to ticket
		t.setStatus("CONFIRMED");
		//maintaining the tickets in the map concept
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
	 return db.values();
	
		
	}

}
