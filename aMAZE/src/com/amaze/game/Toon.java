package com.amaze.game;

import com.badlogic.gdx.graphics.Texture;

/**
 * Toon holds values for different moving objects in the game. 
 * Examples the player characters, and non-player characters.
 * @author Bjørn
 */
public class Toon {
	
	private int xPos, yPos, speed;
	private Texture toonImage;
	private boolean isPlayerControlled;
	
	/**
	 * Empty constructor currently doing nothing. 
	 */
	public Toon() {
		
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Texture getToonImage() {
		return toonImage;
	}

	public void setToonImage(Texture toonImage) {
		this.toonImage = toonImage;
	}

	public boolean isPlayerControlled() {
		return isPlayerControlled;
	}

	public void setPlayerControlled(boolean isPlayerControlled) {
		this.isPlayerControlled = isPlayerControlled;
	}
	
}
