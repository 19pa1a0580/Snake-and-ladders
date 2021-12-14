import java.util.*;
import java.io.*;

public interface Dice{
   public int throwDice();
}

class NormalDice implements Dice{
  Random rand=new Random();
  public int throwDice(){
    return rand.nextInt(6)+1;
  }
}
