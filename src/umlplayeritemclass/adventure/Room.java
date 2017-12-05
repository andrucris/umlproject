package umlplayeritemclass.adventure;

import java.util.List;

public class Room implements IRoom{
  protected String         description;
  protected Location       location;
  protected List<Location> adjacent;
  protected List<IPlayer>   people;
  protected List<Thing>    things;
  
  public Room(String description, Location location, List<Location> adjacent, 
              List<IPlayer> people, List<Thing> things)
  {
    this.description = description;
    this.location = location;
    this.adjacent = adjacent;
    this.people = people; 
    this.things = things;
  }
  
  /* getters */
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#getLocation()
 */
@Override
public Location       getLocation(){ return location; }
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#getAdjacentRooms()
 */
@Override
public List<Location> getAdjacentRooms(){ return adjacent; }
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#getPlayers()
 */
@Override
public List<IPlayer>   getPlayers(){ return people; }
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#getThings()
 */
@Override
public List<Thing>    getThings(){ return things; }
  
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#look()
 */
@Override
public String look(){
    // return a string describing the room 
    // (what is in it, what exits you have, etc)
    return this.toString();
  }
  
  
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#addPlayer(umlplayeritemclass.adventure.Player)
 */
@Override
public void addPlayer(IPlayer p){
    this.people.add(p);
  }
  
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#removePlayer(umlplayeritemclass.adventure.IPlayer)
 */
@Override
public void removePlayer(IPlayer p){
    this.people.remove(p);
  }
  
  /* (non-Javadoc)
 * @see umlplayeritemclass.adventure.IRoom#addThing(umlplayeritemclass.adventure.Thing)
 */
  @Override
public void addThing(Thing t){
    this.things.add(t);
  }
  
  
  
 
@Override
  public String toString(){
    return description;
  }
}