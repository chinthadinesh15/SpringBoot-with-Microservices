package in.Dinesh.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.Dinesh.binding.Passenger;
import in.Dinesh.binding.Ticket;
import reactor.core.publisher.Mono;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Mono<Ticket> bookTicket(Passenger p) 
	{
		String apiUrl="http://localhost:8080/ticket";
		
		
		WebClient webClient = WebClient.create();
		
		Mono<Ticket> bodyToMono = webClient.post()
					.uri(apiUrl)
					.body(BodyInserters.fromValue(p))
					.retrieve()
					.bodyToMono(Ticket.class);
		
		
		return bodyToMono ;
	}

	@Override
	public Mono<Ticket[]> getAllTickets() 
	{
		String apiUrl="http://localhost:8080/tickets";
		
		WebClient webClient = WebClient.create();
		
		Mono<Ticket[]> bodyToMono = webClient.get()
					.uri(apiUrl)
					.retrieve()
					.bodyToMono(Ticket[].class);
		return bodyToMono;
		
		
		
		
	}

}
