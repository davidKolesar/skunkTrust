package com.mycompany.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.model.Hero;
import com.mycompany.model.Room;
import com.mycompany.view.CreateRooms;
import com.mycompany.view.GameChallenges;
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
	private GameChallenges gameChallenges = new GameChallenges();
	private boolean optionsScreen = false;
	private String skunkTrustResponse;
	private boolean isLightsOn;
	private Room mikesRoom;
	int lightsOffCount = 0;

	@PostMapping(value = "/gameController")
	public String takeInput(@RequestBody String input) {

		// fixing marshaling (hacky way)
		input = input.replace("=", "");
		input = input.replace("+", " ");
		input = input.replace("%", " ");

		// sanitize data
		String sanitizedResponse = consoleIo.sanitizeString(input);
		
		//checking for dection of errors
		//input = input.toLowerCase();
		if (!sanitizedResponse.contentEquals(input.toLowerCase())) {
			// Detects malicious queries in text field
			return sanitizedResponse;
		}

		// Entering SkunkTrust 
		if (!gameStarted) {
			if (sanitizedResponse.contentEquals("start")) {
				gameStarted = true;
				optionsScreen = true;
				return introductionScreen.displayOptionScreen();
			} else {
				return "Type 'start' to begin.";
			}
		}

		// allow user to select options
		if (optionsScreen) {

			switch (sanitizedResponse) {
			case "1":
				optionsScreen = false;
				mikesRoom = createRooms.createMikesRoom();
				isLightsOn = false;
				return createRooms.returnOpeningScene();
			case "2":
				skunkTrustResponse  = "Please insert game code :";
				optionsScreen = false;
				break;
			default:
				skunkTrustResponse  = "Please type either 1 or 2";
				break;
			}
		}

		// new game started
		newGame(sanitizedResponse);

		return skunkTrustResponse ;
	}

	public void newGame(String sanitizedResponse) {
		isLightsOn = gameChallenges.areLightsTurnedOn(sanitizedResponse);
		
		if (!isLightsOn) {
			skunkTrustResponse = createRooms.returnLightsAreOff();
			lightsOffCount++;
			if(lightsOffCount >= 3) {
				skunkTrustResponse = gameChallenges.damageFromLightsOff(hero);
			}
		} else {
			skunkTrustResponse = mikesRoom.getDescription();			
		}
	}

} 