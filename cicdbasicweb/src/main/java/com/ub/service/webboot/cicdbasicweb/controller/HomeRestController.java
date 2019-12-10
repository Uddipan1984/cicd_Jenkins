package com.ub.service.webboot.cicdbasicweb.controller;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	
	@RequestMapping("/")
	public String homecontext() {
	return "<h2>Its working now. Small Rest service , Stepped in Home Context</h2></br>"+ getHostDetails();
	}
	
	public static String getHostDetails () {
		
		InetAddress iAdress = null;
		String hostName     = null;
		
		try {
			iAdress = InetAddress.getLocalHost();
			hostName= iAdress.getHostName()  + " - " + iAdress.getHostAddress()   ;
		}catch (Throwable err) {
			hostName = "No Host";
			System.err.println("Error - "+ err.toString());
		}
		
		return hostName;
	}

}
