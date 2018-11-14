package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
//  The place for the Pirates
//
//  Create a Ship class.
//  The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
//  When a ship is created it doesn't have a crew or a captain.
//  The ship can be filled with pirates and a captain via fillShip() method.
//  Filling the ship with a captain and random number of pirates.
//  Ships should be represented in a nice way on command line including information about
//  captains consumed rum, state (passed out / died)
//  number of alive pirates in the crew
//  Ships should have a method to battle other ships: ship.battle(otherShip)
//  should return true if the actual ship (this) wins
//  the ship should win if its calculated score is higher
//  calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//  The loser crew has a random number of losses (deaths).
//  The winner captain and crew has a party, including a random number of rum :)
  Pirate captain;
  List<Pirate> crew;

  public Ship() {

  }

  public void fillShip() {
    List<Pirate> listOfPirates = new ArrayList<>();
    int randomNum = (int)Math.random() * 100;
    for (int i = 0; i < randomNum; i++) {
      if (i == 0) {
        listOfPirates.add(this.captain);
      } else {
        listOfPirates.add(i, new Pirate());
      }
    }
    this.crew = listOfPirates;
  }

  public String report() {
    String answer;
//  Ships should be represented in a nice way on command line including information about
//  captains consumed rum, state (passed out / died)
//  number of alive pirates in the crew
    int passedOut = 0;
    int deads = 0;
    int alives = 0;

    for (Pirate pirates : this.crew) {
      if (pirates.state == "passed out") {
        passedOut++;
      } else if (pirates.state == "dead") {
        deads++;
      } else {
        alives++;
      }
    }
    return "Captain consumed rum: " + captain.amountOfRum +
        " \nMembers of the crew: " +
        " \n\tNumber of passed out pirates: " + passedOut +
        " \n\tNumber of deads: " + deads +
        " \n\tNumber of alive pirates: " + alives;
  }

  public boolean battle(Ship othership) {
//    Ships should have a method to battle other ships: ship.battle(otherShip)
//  should return true if the actual ship (this) wins
//  the ship should win if its calculated score is higher
//  calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//  The loser crew has a random number of losses (deaths).
//  The winner captain and crew has a party, including a random number of rum :)
    if (score(this) > score(othership)) {
      return true;
    } else {
      return false;
    }
  }

  public int score(Ship ship) {
    int score = 0;
    for (Pirate pirates : ship.crew) {
      if (pirates.state == "alive") {
        score++;
      }
    }
    return score - this.captain.amountOfRum;
  }
}
