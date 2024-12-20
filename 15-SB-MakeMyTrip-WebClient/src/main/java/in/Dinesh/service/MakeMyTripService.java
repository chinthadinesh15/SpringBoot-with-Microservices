package in.Dinesh.service;

import java.util.List;

import in.Dinesh.binding.Passenger;
import in.Dinesh.binding.Ticket;
import reactor.core.publisher.Mono;


public interface MakeMyTripService 
{
	public Mono<Ticket> bookTicket(Passenger p);

	public Mono<Ticket[]> getAllTickets();
}
