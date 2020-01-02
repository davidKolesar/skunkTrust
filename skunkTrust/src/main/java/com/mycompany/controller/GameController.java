package com.mycompany.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.view.WebFacingConsoleIO;

@RestController
@RequestMapping("/skunktrust")
public class GameController {

	private WebFacingConsoleIO consoleIo = new WebFacingConsoleIO();
		    
	@PostMapping(value = "/gameController")
	public String takeInput(@RequestBody String input)
	{
		
		//fixing marshaling 
		input = input.replace("=", "");
		input = input.replace("+", " ");
		
		//sanitize data
		String sanitizedResponse = consoleIo.sanitizeString(input);
		
		if(sanitizedResponse != input) 
		{
			return sanitizedResponse;
		}

		
		
		
		return input;
  }
  
}