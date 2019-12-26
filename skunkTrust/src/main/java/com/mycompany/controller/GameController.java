package com.mycompany.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.view.WebFacingConsoleIO;

@RestController
@RequestMapping("/skunktrust")
public class GameController {

	private WebFacingConsoleIO consoleIo = new WebFacingConsoleIO();
		    
	@PostMapping("/gameController")
	public String takeInput(String input) {
		
		//sanitize data
		String sanitizedResponse = consoleIo.sanitizeString(input);
		
		if(sanitizedResponse != input) 
		{
			return sanitizedResponse;
		}
		
		return "Hello front-end!";
  }

  
}