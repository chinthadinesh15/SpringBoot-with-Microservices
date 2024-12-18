package in.Dinesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.Dinesh.binding.Passenger;
import in.Dinesh.binding.Ticket;
import in.Dinesh.service.MakeMyTripService;
import reactor.core.publisher.Mono;

@Controller
public class MakeMyTripController 
{

	@Autowired
	private MakeMyTripService service;
	
	
	@PostMapping("/ticket")
	public Mono<String> ticketBooking(@ModelAttribute("p") Passenger p, Model model) {
	    return service.bookTicket(p)
	                  .map(ticket -> {
	                      model.addAttribute("msg", "Your Ticket is Booked...! ID is: " + ticket.getTicketNum());
	                      return "bookTicket";
	                  });
	}

	
	@GetMapping("/book-ticket")
	public String bookTicket(Model model)
	{
		model.addAttribute("p",new Passenger());
		
		return "bookTicket";
	}
	
	@GetMapping("/")
	public String index(Model model)
	{
		Mono<Ticket[]> allTickets = service.getAllTickets();
		
		model.addAttribute("tickets",allTickets);
		
		return "index";
	}

}
