package in.Dinesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.Dinesh.bindings.Passenger;
import in.Dinesh.bindings.Ticket;
import in.Dinesh.service.MakeMyTripService;


@Controller
public class MakeMyTripController 
{
	@Autowired
	private MakeMyTripService service;
	
	
	@PostMapping("/ticket")
	public String ticketBooking( @ModelAttribute("p")Passenger p,Model model)
	{
		Ticket bookTicket = service.bookTicket(p);
		model.addAttribute("msg","Your Ticket is Booked...! ID is: "+bookTicket.getTicketNum());
		
		return"bookTicket";
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
		List<Ticket> allTickets = service.getAllTickets();
		
		model.addAttribute("tickets",allTickets);
		
		return "index";
	}

}
