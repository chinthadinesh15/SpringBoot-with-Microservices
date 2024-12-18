package in.Dinesh.service;

import java.util.List;

import in.Dinesh.bindings.Passenger;
import in.Dinesh.bindings.Ticket;

public interface MakeMyTripService 
{
	public Ticket bookTicket(Passenger p);
	
	public List<Ticket> getAllTickets();

}
