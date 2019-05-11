package com.express.vistaprinting.vistaprint;

import javax.ws.rs.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@Path("/AppDashboard")/

public class VistaprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(VistaprintApplication.class, args);
	}

	@RequestMapping(value="/")
	//@Path("/print")
	public String hello() {
		return "Hello World.. !";
	}
}
