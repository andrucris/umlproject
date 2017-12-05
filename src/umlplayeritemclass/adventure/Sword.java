package umlplayeritemclass.adventure;

import java.util.List;

/**
 * the sword class is an extension for Thing class and will implement interact methods
 * @author
 *
 */
public class Sword extends Thing{

	public Sword(String name, Location location, int value) {
		super(name, location, value);
		
	}
	public Sword(String name, Location location, int value, int e) {
		super(name,location, value,e);
	}

	/**
	 * the sword will start to interact with all the players from the room
	 */
	@Override
	public void interact() {
		
		List<IPlayer> playerList = this.getLocation().getWorld().getRoom(this.getLocation()).getPlayers();
		if(playerList!=null && playerList.size()>0) {
			for(IPlayer player : playerList) {
				this.interact(player);
			}
		}
	}

	/**
	 * the sword will interact with the player
	 * once the player touch it its health will 
	 * increase twice
	 */
	@Override
	public void interact(IPlayer p) {
		int initialHealth = p.getHealth();
		p.setHealth(initialHealth * 2);

	}

}
