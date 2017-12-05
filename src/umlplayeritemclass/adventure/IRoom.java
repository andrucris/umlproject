package umlplayeritemclass.adventure;

import java.util.List;
/**
 * interface with main methods necessary for Room class 
 * @author 
 *
 */
public interface IRoom {

	/* getters */
	Location getLocation();

	List<Location> getAdjacentRooms();

	List<IPlayer> getPlayers();

	List<Thing> getThings();

	/* behaviours*/
	/**
	 * have an overview of the room
	 * @return
	 */
	String look();
	/**
	 * add player
	 * @param p
	 */
	void addPlayer(IPlayer p);
	/**
	 * remove player
	 * @param p
	 */
	void removePlayer(IPlayer p);

	/** add a thing t to the current room */
	void addThing(Thing t);



}