package com.mycompany.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.model.Hero;
import com.mycompany.view.CreateRooms;
import com.mycompany.view.IntroductionScreen;
import com.mycompany.view.WebFacingConsoleIO;

@RestController
@RequestMapping("/skunktrust")
public class GameController {

	private WebFacingConsoleIO consoleIo = new WebFacingConsoleIO();
	private IntroductionScreen introductionScreen = new IntroductionScreen();
	private CreateRooms createRooms = new CreateRooms();
	private boolean gameStarted = false;
	private String output = "";
	private Hero hero = new Hero();

	
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
	
		startOpeningScene(sanitizedResponse);
		
		return output;
	}
	
	public void initHero() {
		
		hero.setHitPoints(10);
	}
	

	/**
	 * @param sanitizedResponse
	 */
	public String startOpeningScene(String sanitizedResponse) {
		boolean isFirstReading = true;
		boolean isLightsOff = true;
		int stepsInDark = 0;
		
	
		if(isFirstReading) {
			isFirstReading = false;
			return createRooms.returnOpeningScene();
		}
		
		if(isLightsOff) {
			stepsInDark++;
			return createRooms.returnLightsAreOff();
		}
		
		if(stepsInDark == 2) {
			
		}
		
		return null;		
	}
	
	
}