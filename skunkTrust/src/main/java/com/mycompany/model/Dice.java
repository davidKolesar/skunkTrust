package com.mycompany.model;

import java.util.Random;

public class Dice {
	Random r = new Random();
	private int low;
	private int high;
	private int result;
	
	public Dice(int low, int high) {
	this.low = low;
	this.high = high;
	this.result = r.nextInt(high-low)+low;
	}

	public int getResult() {
		return result;
	}

	public int roll(int low, int high) {
		this.result = r.nextInt(high-low)+low;
		return result;
	}

}
