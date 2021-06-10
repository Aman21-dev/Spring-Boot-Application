package com.azure.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/hello")
	  public String hello() {
	    return "Hello World i'm build in Azure Pipeline CICD!!";
	  }

}