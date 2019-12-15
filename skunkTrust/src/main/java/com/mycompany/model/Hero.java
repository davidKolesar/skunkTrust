package com.mycompany.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hero {

	private String name;
	private int hitPoints;
	private int armor;
	private Map<String, Integer> weapon = new HashMap<String, Integer>();
	private ArrayList<Item> items;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getArmor() {
		return armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public Map<String, Integer> getWeapon() {
		return weapon;
	}

	/**
	 * @param name
	 * @param damage
	 */
	public void setWeapon(String name, Integer damage) {
		weapon.put(name, damage);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
}
