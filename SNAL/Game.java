import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Game{
  private Queue<Player> playerQueue=new LinkedList<Player>();
  public Game(Queue<Player> playerQueue){
    this.playerQueue=playerQueue;
  }
  public void startGame(Board board){
    Dice dice=new NormalDice();
    int finalDestination=board.getDestination();
    HashMap<Integer,Snakes> snakes=board.getSnakes();
    HashMap<Integer,Ladders> ladders=board.getLadders();
    while(playerQueue.size() > 1){
      Player p=playerQueue.poll();
      int currpos=p.getLocation();
      int move=dice.throwDice();
      while(move%6==0){
        move+=dice.throwDice();
        if(move==18){
          move=0;
          break;
        }
      }
      if(currpos+move<=finalDestination){
        int nextpos;
        if(snakes.containsKey(currpos+move)){
          Snakes s=snakes.get(currpos+move);
          nextpos=s.getEnd();
        }
        else if(ladders.containsKey(currpos+move)){
          Ladders l=ladders.get(currpos+move);
          nextpos=l.getEnd();
        }
        else{
          nextpos=currpos+move;
        }
        p.setLocation(nextpos);
        p.setPath(nextpos);
      }
      if(p.getLocation()==finalDestination){
          System.out.println(p.getName()+" won the match.");
          p.getPath();
      }
      else{
          playerQueue.add(p);
      }
    }
  }
}
