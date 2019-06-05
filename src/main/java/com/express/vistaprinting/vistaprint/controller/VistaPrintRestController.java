package com.express.vistaprinting.vistaprint.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VistaPrintRestController {

	@RequestMapping("/")
	public String index() 
	{
		return "Getting from spring boot";
	}
}
