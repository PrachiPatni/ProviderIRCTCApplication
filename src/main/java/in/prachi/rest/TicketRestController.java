package in.prachi.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.prachi.bindings.Passengers;
import in.prachi.bindings.Ticket;
import in.prachi.service.TicketService;


@RestController
public class TicketRestController {
	@Autowired
	private TicketService service;
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passengers p){
		Ticket ticket = service.bookTicket(p);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	@GetMapping("/passengers")
	public ResponseEntity<Collection<Ticket>> getAllTickets(){
		Collection<Ticket> collection = service.getAllTickets();
		return new ResponseEntity<>(collection,HttpStatus.OK);
		
	}
	
}
