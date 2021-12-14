import java.util.*;
import java.io.*;
public class Driver{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Snakes> snakes=new HashMap<Integer,Snakes>();
    HashMap<Integer,Ladders> ladders=new HashMap<Integer,Ladders>();
    Queue<Player> playerQueue=new LinkedList<Player>();
    System.out.println("Enter number of snakes: ");
    int noOfSnakes=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter starting and ending postions of snakes");
    for(int i=0;i<noOfSnakes;i++){
      int start=sc.nextInt();
      int end=sc.nextInt();
      Snakes snake=new Snakes(start,end);
      snakes.put(start,snake);
    }
    System.out.println("Enter number of ladders: ");
    int noOfLadders=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter starting and ending positions of ladders");
    for(int i=0;i<noOfLadders;i++){
      int start=sc.nextInt();
      int end=sc.nextInt();
      Ladders ladder=new Ladders(start,end);
      ladders.put(start,ladder);
    }
    Board board=new Board(snakes,ladders);
    System.out.println("Enter number of players: ");
    int noOfPlayers=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<noOfPlayers;i++){
      System.out.println("Enter player-"+i+"'s name:");
      String k=sc.nextLine();
      Player p=new Player(k);
      playerQueue.add(p);
    }
    Game game=new Game(playerQueue);
    game.startGame(board);
  }
}
