package in.dinesh.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	@Bean
	public InMemoryUserDetailsManager inMemoryUsers()
	{
		UserDetails userDetails = User.withDefaultPasswordEncoder()
										.username("dinesh")
										.password("123")
										.authorities("ADMIN")
										.build();
		
		UserDetails userDetails1 = User.withDefaultPasswordEncoder()
										.username("bhavya")
										.password("1234")
										.authorities("USER")
										.build();
		
		return new InMemoryUserDetailsManager(userDetails,userDetails1);
		
		
	}
	
	
	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception 
	{
		
		http.authorizeHttpRequests((request) -> request
				.requestMatchers("/contact" , "/welcome","/swagger-ui.html").permitAll()
				.anyRequest().authenticated() ).formLogin();
		
		return http.build();
		
	}

}
