package in.Dinesh.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.Dinesh.bindings.Passenger;
import in.Dinesh.bindings.Ticket;

@Service
public class MakeMyTripServiceImpl  implements MakeMyTripService
{

	@Override
	public Ticket bookTicket(Passenger p) 
	{
		String apiUrl="http://localhost:8080/ticket";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Ticket> forEntity = rt.postForEntity(apiUrl, p, Ticket.class);
		
		Ticket body = forEntity.getBody();
		
		return body;
	}

	@Override
	public List<Ticket> getAllTickets() 
	{
		String apiUrl="http://localhost:8080/tickets";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);
		
		Ticket[] body = forEntity.getBody();
		
		List<Ticket> asList = Arrays.asList(body);
		
		return asList;
	}

}
