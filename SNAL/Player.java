import java.util.*;
import java.io.*;

public class Player{
  private String name;
  private List<Integer> path=new ArrayList<>();
  private int playerLocation=0;
  public Player(String name){
    this.name=name;
  }
  public void setPath(int n){
    path.add(n);
  }
  public void getPath(){
    for(int i:path){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public String getName(){
    return name;
  }
  public void setLocation(int n){
    this.playerLocation=n;
  }
  public int getLocation(){
    return playerLocation;
  }
}
