package com.ub.service.webboot.cicdbasicweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	
	@RequestMapping("/")
	public String homecontext() {
	return "Its working now. Small Rest service , Stepped in Home Context";
	}

}
