package umlplayeritemclass.adventure;

import java.util.List;

/**
 * Players in the game
 * 
 * Each member of your team should implement their own unique Player subtype.
 * Your group should also have a human player.
 */

public abstract class Player implements IPlayer {
	protected World w; // world that player lives in
	protected String name;
	protected Location location;
	protected int health = 100;
	protected List<Thing> things;
	protected Thing goal;

	/**
	 * Creates a player in the game
	 * 
	 * @param w
	 *            is the world that the player lives in
	 * @param name
	 *            is the name of the player
	 * @param location
	 *            is where in the world the player is
	 * @param health
	 *            is the health of the player (which may or may not be relevant in
	 *            your game)
	 * @param things
	 *            is a list of Thing objects that the player initially possesses
	 * @param goal
	 *            is the Thing that the human player is trying to retrieve in the
	 *            game
	 */
	public Player(World w, String name, Location location, int health, List<Thing> things, Thing goal) {
		this.w = w;
		this.name = name;
		this.location = location;
		this.health = health;
		this.things = things;
		this.goal = goal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public World getWorld() {
		return w;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getHealth() {
		return health;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Thing> getThings() {
		return things;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Thing getGoal() {
		return goal;
	}
	/**
	 * player will start to play
	 */
	@Override
	public abstract void play();
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean move(Location newLocation) {
		// move from current location to new location
		// should only be allowed to move if the locations are connected
		// (with a door that can opened)
		return false;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setLocation(Location location) {
		this.location = location;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setHealth(int h) {
		this.health = h;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addThing(Thing t) {
		this.things.add(t);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean removeThing(Thing t) {
		return this.things.remove(t);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Thing newGoal(Thing g) {
		Thing old = this.goal;
		return old;
	}
	/**
	 * interact with a player from the room
	 * @param p
	 */
	public abstract void interact(IPlayer p); // allows for some interaction with a player
	/**
	 * interact with a thing from the room
	 * @param t
	 */
	public abstract void interact(Thing t); // allows for some interaction with a player
	/**
	 * interact with all the things and players from the room
	 */
	public abstract void interact(); // allows for some interaction with anything in the room

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Player) {
			return this.name.equals(((Player) o).name) && this.location.equals(((Player) o).location)
					&& this.health == ((Player) o).health;

		} else {
			return false;
		}
	}

}