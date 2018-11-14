package pirates;

public class BattleApp {
//  Create a BattleApp class with a main method
//      Create 2 ships, fill them with pirates
//  Have a battle!
  public static void main(String[] args) {
    Ship hollandier = new Ship();
    Ship inHollyness = new Ship();

    hollandier.fillShip();
    inHollyness.fillShip();
    piratesLife(hollandier);
    piratesLife(inHollyness);


    if (hollandier.battle(inHollyness)) {
      System.out.println(hollandier.report());
    } else {
      System.out.println(inHollyness.report());
    }
  }

  public static void piratesLife(Ship ship){
    for (int i = 1; i < (Math.random() * 30); i++) {
      ship.crew.get(i - 1).brawl(ship.crew.get(i));
    }
    for (int j = 1; j < (Math.random() * 4); j++) {
      for (int k = 1; k < (Math.random() * 100); k++) {
        ship.crew.get(j).howsItGoingMate();
      }
    }
  }
}
