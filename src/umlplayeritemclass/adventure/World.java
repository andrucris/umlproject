package umlplayeritemclass.adventure;

public class World{
  protected IRoom[][] rooms;
  protected Location entrance;
  protected Thing    goal;
  
  public World(){
    IRoom r1 = new Room("the entrance", new Location(this,0,0), 
                      new java.util.ArrayList<Location>(),
                      new java.util.ArrayList<IPlayer>(),
                      new java.util.ArrayList<Thing>());
    IRoom r2 = new Room("a dark room", new Location(this,0,1), 
                      new java.util.ArrayList<Location>(),
                      new java.util.ArrayList<IPlayer>(),
                      new java.util.ArrayList<Thing>());
    r1.getAdjacentRooms().add(r2.getLocation());
    r2.getAdjacentRooms().add(r1.getLocation());
  
    rooms = new IRoom[1][2];
    rooms[0][0] = r1;
    rooms[0][1] = r2;
    entrance = r1.getLocation();
    goal = new Sword("thing", r2.getLocation(), 1, 7);
    r2.addThing(goal);
  }
  
  public World(String worldFileName){
    // create world described in file worldFileName   
  }
  
  public Location getEntrance(){
    return entrance;
  }
  
  public Thing getGoal(){ return goal;}
  
  /** returns room of spcified Player */
  public IRoom getRoom(IPlayer p){
    int r = p.getLocation().getRow();
    int c = p.getLocation().getCol();
    return rooms[r][c];
  }
  /** returns room of specified location 
    * 
    * @return the room that this is at this location in this world. 
    *         Returns null if there is no such room.
    */
  public IRoom getRoom(Location location){
    return rooms[location.getRow()][location.getCol()];
  }
}