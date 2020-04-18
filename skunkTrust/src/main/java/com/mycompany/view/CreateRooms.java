package com.mycompany.view;

import com.mycompany.model.Item;
import com.mycompany.model.Room;

public class CreateRooms {

	public Room createMikesRoom() {
		//create room
		Room mikesRoom = new Room(null, null, null, null, null, null, null, null);
		
		//create bordering rooms?
		
		
		//create Items in room
		Item cdPlayer = new Item();
		Item backpack= new Item();
		
		//add items too room
		mikesRoom.addItems(cdPlayer);
		
		//create / handle descriptions
		String mikesRoomDescription = "The small room houses three computer monitors resting on makdeshift desk "
				+ "crafted from an old wooden door. The door is squeezed against the eastern wall, which boasts"
				+ "tacky wallpaper striped with patterns of flowers. The desk is littered with papers"
				+ "and other debris, while a large colorful poster hangs above it The off-grey enamel of the "
				+ "computer towers rest comfortably on the beige, messy carpet. Three office chairs are scattared"
				+ "haphazardly in front of the desk. "
				+ "/n"
				+ "The southern wall has matress with disheveled, green bedsheets thrown on top of it."
				+ "/n"
				+ "The floor is rife with old school assignments and overturned books. The westerly wall is "
				+ "decorated with a black and white, metalic street sign reading 'SPEED LIMIIT 45 MPH' and a "
				+ "buzz saw with a cat's face drawn on it."
				+ "/n"
				+ "A door leading to the hallway is on the northern wall. There is a backpack near it.";
		
		String cdPlayer Description
		
		mikesRoom.setDescription(mikesRoomDescription);
		
		//return created room
		return mikesRoom;
		
	}
	
}
