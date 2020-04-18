package com.mycompany.view;

import com.mycompany.model.Item;
import com.mycompany.model.Room;

public class CreateRooms {

	public String returnOpeningScene() {

		return "You awaken to the sound of your alarm radio. The familair guitar riff queing the introduction "
				+ "to the Bob and Tom show echoes in the darkness of the small bedroom. Rubbing sleep from your "
				+ "groggy eyes, you remember today is the day of your big math final.";
	}

	public String returnLightsAreOff() {
		return "You can't really see very well. You should turn on the lights..";
	}
	

	public Room createMikesRoom() {
		// create room
		//Room mikesRoom = new Room(null, null, null, null, null, null, null, null);

		Room mikesRoom = new Room();
		
		// create bordering rooms?

		// create Items in room
		Item cdPlayer = new Item();
		Item backpack = new Item();

		// add items too room
		mikesRoom.addItems(cdPlayer);

		String mikesRoomDescription = "The small room houses three computer monitors resting on makdeshift desk "
				+ "crafted from an old wooden door. The door is squeezed against the eastern wall, which boasts"
				+ "tacky wallpaper striped with patterns of flowers. The desk is littered with papers"
				+ "and other debris, while a large colorful poster hangs above it The off-grey enamel of the "
				+ "computer towers rest comfortably on the beige, messy carpet. Three office chairs are scattared"
				+ "haphazardly in front of the desk. " + "/n"
				+ "The north eastern wall has a small table housing an original Playstation that is"
				+ " hooked up to a small television." + "/n"
				+ "The southern wall has matress with disheveled, green bedsheets thrown on top of it. It rests against "
				+ "an oversized window which seems to consume the entire wall." + "/n"
				+ "The floor is rife with old school assignments and overturned books. The westerly wall is "
				+ "decorated with a black and white, metalic street sign reading 'SPEED LIMIIT 45 MPH' and a "
				+ "buzz saw with a cat's face drawn on it." + "/n"
				+ "A door leading to the hallway is on the northern wall. There is a backpack near it.";

		mikesRoom.setDescription(mikesRoomDescription);

		// return created room
		return mikesRoom;

	}

}
