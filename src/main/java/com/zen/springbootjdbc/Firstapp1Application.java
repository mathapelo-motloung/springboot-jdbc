package com.zen.springbootjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Firstapp1Application  implements CommandLineRunner{
	
	@Autowired
	private CustomerDao customerDAO;

	public static void main(String[] args) {
		SpringApplication.run(Firstapp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Customer> customers = customerDAO.findAll();
		for (Customer c : customers) {
		System.out.println(c.getName() + " : " +  c.getCity());	
		}
		
	}

}
