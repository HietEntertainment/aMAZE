package com.amaze.game;

import com.badlogic.gdx.graphics.Texture;
/**
 * TriggerObject is a class which holds different values for an object that triggers an event within the game. 
 * @author Bjørn
 *
 */
public class TriggerObject {
	
	private int xPos, yPos;
	private Texture triggerImage;
	
	/**
	 * A type defining what kind of event the object triggers.
	 * If more events are needed add it here.
	 * @author Bjørn
	 */
	public enum TriggerType{
		ENDEVENT, KEYEVENT;
	}
	
	/**
	 * Empty constructor.
	 */
	public TriggerObject() {
		
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

	public Texture getTriggerImage() {
		return triggerImage;
	}

	public void setTriggerImage(Texture triggerImage) {
		this.triggerImage = triggerImage;
	}
	
}
