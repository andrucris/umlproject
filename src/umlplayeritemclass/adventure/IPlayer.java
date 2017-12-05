package umlplayeritemclass.adventure;

import java.util.List;

public interface IPlayer {

	/**getters**/
	
	/** Getter for a player's world */
	World getWorld();

	/** Getter for a player's name */
	String getName();

	/** Getter for a player's location */
	Location getLocation();

	/** Getter for a player's health */
	int getHealth();

	/** Getter for a player's list of things */
	List<Thing> getThings();

	/** Getter for a player's goal */
	Thing getGoal();

	/** behaviours*/
	
	/**
	 * the player will start to play
	 */
	void play();

	/**
	 * the player will move to new location
	 * @param newLocation
	 * @return true if the move is done , false otherwise
	 */
	boolean move(Location newLocation);

	/**
	 * set location
	 * @param location
	 */
	void setLocation(Location location);

	/**
	 * set the health
	 * @param h
	 */
	void setHealth(int h);

	/**
	 * add thing
	 * @param t
	 */
	void addThing(Thing t);

	/**
	 * remove thing
	 * @param t
	 * @return
	 */
	boolean removeThing(Thing t);

	/**
	 * set a new goal 
	 * @param g
	 * @return
	 */
	Thing newGoal(Thing g);

	
	

}