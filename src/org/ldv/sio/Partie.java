package org.ldv.sio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partie {
  private Map<String, List> playersByLevel;

  public Partie() {
    this.playersByLevel = new HashMap<>();
    this.initialize("jaune", 23);
    this.initialize("rouge", 13);
  }

  private void initialize(String level, int max) {
    playersByLevel.put(level,new ArrayList());
    List players = playersByLevel.get(level);
    for (int i = 0; i<max; i++) players.add(level.charAt(0) + String.valueOf(i));
  }

  private void printPlayersByLevel(String level) {
    System.out.println("Les joueurs " + level);
    System.out.println(playersByLevel.get(level));
  }

  public Map<String, List<List>> getPartiesOf(String level) {
  /*  Map<String, List> parties = new HashMap<>();
    parties.put(level, new ArrayList(List));
    List players = playersByLevel.get(level);

    //List<List> parties = parties.get(level);
    List partie = new ArrayList <String>();
   // partie.add()
   */

    return null;// parties;
  }

  public static void main(String[] args) {
    Partie test = new Partie();
    test.printPlayersByLevel("jaune");
    test.printPlayersByLevel("rouge");
  }
}
