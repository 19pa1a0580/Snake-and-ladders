import java.util.*;
import java.io.*;

public class Board{
  HashMap<Integer,Snakes> snakes=new HashMap<Integer,Snakes>();
  HashMap<Integer,Ladders> ladders=new HashMap<Integer,Ladders>();
  private int destination=100;
  public Board(HashMap<Integer,Snakes> snakes,HashMap<Integer,Ladders> ladders){
    this.snakes=snakes;
    this.ladders=ladders;
  }
  public int getDestination(){
    return destination;
  }
  public HashMap<Integer,Snakes> getSnakes(){
    return snakes;
  }
  public HashMap<Integer,Ladders> getLadders(){
    return ladders;
  }
}
