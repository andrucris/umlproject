package umlplayeritemclass.adventure;

import java.util.List;
/**
 * the humanities student class is an extension for Human class and Player and it will
 * implement the interact methods
 *
 */
public class HumanitiesStudent extends Human {

	public HumanitiesStudent(World w, String name, Location location, int health, List<Thing> things, Thing goal) {
		super(w, name, location, health, things, goal);
	}

	/**
	 * the human will take a thing
	 */
	@Override
	public void interact(Thing t) {
		this.getThings().add(t);
		//increase health
		this.setHealth(this.getHealth()+1);
		
	}

	/**
	 * this method will call interact with all things and all the  players from the room
	 */
	@Override
	public void interact() {
		//search things in the actual player room and interact with things
		List<Thing> thingList = this.getWorld().getRoom(this.getLocation()).getThings();
		if(thingList!=null && thingList.size()>0) {
			for(Thing thing : thingList) {
				this.interact(thing);
			}
		}
		List<IPlayer> playerList = this.getWorld().getRoom(this.getLocation()).getPlayers();
		if(playerList!=null && playerList.size()>0) {
			for(IPlayer player : playerList) {
				this.interact(player);
			}
		}
	}

	/**
	 * the human will take the things of the players he interacts with
	 */
	@Override
	public void interact(IPlayer p) {
		for(Thing thing :p.getThings()){
			this.getThings().add(thing);
			//decrease health
			int health=p.getHealth()-1;
			p.setHealth(health);
		}
		}
	  

}
