package com.mycompany.view;

import com.mycompany.model.Dice;
import com.mycompany.model.Hero;

public class GameChallenges {
	private Dice dice = new Dice(0,2);
	
	
	public String dieFromLightsOff(Hero hero) {
	
        String deathReport = "";
        
        switch (dice.getResult()) {
            case 0:  deathReport = "Stumbling in the darkness, you trip on some unseen clutter and are knocked unconscious. Your adventure ends early.";
                     break;
            case 1:  deathReport = "Wandering in the darkness, you get eaten by a grue! Your adventure ends here.";
                     break;
            case 2:  deathReport = "Fumbling in the dim room, you fall into the depths of a dirty laundry pile! You fumes render you unconscious. Your advaenture ends early.";
                     break;
            default: deathReport= "Bumbling in the darkness, you stub your toe!";
            int damage = dice(1,5);		
            hero.takeDamagedamage();
                     break;
        }
		
	return deathReport;	
		
	}

	
	
	public String gameOverScreen(Hero hero) {
		
	return "You have died. ";	
		
	}
	
	
}
