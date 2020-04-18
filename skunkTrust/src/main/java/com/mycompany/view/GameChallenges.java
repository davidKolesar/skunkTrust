package com.mycompany.view;

import com.mycompany.model.Dice;
import com.mycompany.model.Hero;

public class GameChallenges {
	private Dice dice = new Dice(0, 3);

	public String damageFromLightsOff(Hero hero) {

		String damageReport = "";

		switch (dice.getResult()) {
		case 0:
			damageReport = "Stumbling in the darkness, you trip on some unseen clutter and are knocked unconscious. Your adventure ends early.";
			hero.setHeroDead(true);
			break;
		case 1:
			damageReport = "Wandering in the darkness, you get eaten by a grue! Your adventure ends here.";
			hero.setHeroDead(true);
			break;
		case 2:
			damageReport = "Fumbling in the dim room, you fall into the depths of a dirty laundry pile! You fumes render you unconscious. Your advaenture ends early.";
			hero.setHeroDead(true);
			break;
		case 3:
			damageReport = "Bumbling in the darkness, you stub your toe!";
			hero.takeDamage(dice.roll(1, 5));
			break;
		default:
			damageReport = "Bumbling in the darkness, you stub your toe!";
			hero.takeDamage(dice.roll(1, 5));
			break;
		}

		if (hero.isHeroDead() == true) {
			gameOverScreen(hero, damageReport);
		}
		return damageReport;

	}

	public boolean areLightsTurnedOn(String sanitizedResponse) {
		boolean isLightOn = false;

		if (sanitizedResponse.contains("on lights") || sanitizedResponse.contains("lights on")
				|| sanitizedResponse.contains("lightswitch") || sanitizedResponse.contains("light switch")
				|| sanitizedResponse.contains("turn lights")) {
			isLightOn = true;
		}

		return isLightOn;
	}

	public String gameOverScreen(Hero hero, String damageReport) {

		return damageReport + "/n" + "You have died. " + "/n" + "/n" + "Total Points :  " + hero.getTotalPoints() + "/n"
				+ "Play Again? " + "/n";

	}

}
