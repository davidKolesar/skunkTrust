package com.mycompany.model;

import java.util.ArrayList;

public class Room {
	private String name;
	private int id;
	private String description;
	private ArrayList<Item> items;
	private ArrayList<Room> rooms;
	private Room north;
	private Room south;
	private Room east;
	private Room west;
	private Room northEast;
	private Room northWest;
	private Room southEast;
	private Room southWest;

	
	/*
	 * // constructor public Room(Room north, Room south, Room east, Room west, Room
	 * southEast, Room southWest, Room northEast, Room northWest) { this.north =
	 * north; this.south = south; this.east = east; this.west = west; this.southEast
	 * = southEast; this.southWest = southWest; this.northEast = northEast;
	 * this.northWest = northWest; }
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public void addItems(Item item) {
		this.items.add(item);
	}
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	public void addRooms(Room room) {
		this.rooms.add(room);
	}
	
	public Room getNorth() {
		if(north == null) {
			//handle cannot move
		} 
		
		return north;
	}


	public Room getSouth() {
		return south;
	}


	public Room getEast() {
		return east;
	}


	public Room getWest() {
		return west;
	}



	public Room getNorthEast() {
		return northEast;
	}


	public Room getNorthWest() {
		return northWest;
	}



	public Room getSouthEast() {
		return southEast;
	}


	public Room getSouthWest() {
		return southWest;
	}

}
