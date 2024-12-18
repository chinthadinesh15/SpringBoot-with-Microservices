package in.Dinesh;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dinesh.bindings.Ticket;
import in.Dinesh.service.MakeMyTripService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
			}

}
