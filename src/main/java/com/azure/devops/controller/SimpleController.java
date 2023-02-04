package com.azure.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/satyajeet")
	  public String hello() {
	    return "Hello Satyajeet buy ADANI STOCKS !";
	  }

}
