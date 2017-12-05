package umlplayeritemclass.adventure;

public class Adventure{
  
  public static void main(String[] args){
    World world = new World();
    
    IPlayer human = new HumanitiesStudent(world, "cat", world.getEntrance(), 100,
                              new java.util.ArrayList<Thing>(), 
                              world.getGoal() );
    world.getRoom(world.getEntrance()).addPlayer(human);
    while(true){
      human.play();
    }
  }
}