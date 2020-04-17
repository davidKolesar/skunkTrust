package com.mycompany.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.view.IntroductionScreen;
import com.mycompany.view.WebFacingConsoleIO;

@RestController
@RequestMapping("/skunktrust")
public class GameController {

	private WebFacingConsoleIO consoleIo = new WebFacingConsoleIO();
	private IntroductionScreen introductionScreen = new IntroductionScreen();
	private boolean gameStarted = false;
	private String output = "";

	@PostMapping(value = "/gameController")
	public String takeInput(@RequestBody String input) {

		// fixing marshaling (hacky way)
		input = input.replace("=", "");
		input = input.replace("+", " ");
		input = input.replace("%", " ");

		// sanitize data
		String sanitizedResponse = consoleIo.sanitizeString(input);

		if (sanitizedResponse != input) {
			return sanitizedResponse;
		}
		
		// starting game
		if (!gameStarted) {
			if(input.contentEquals("start")) {				
				gameStarted = true;
				return introductionScreen.displayOptionScreen();	
			} else {
				return "Type 'start' to begin.";
			}
		}
		
		//beginning story
		
		
		return output;

	}
}