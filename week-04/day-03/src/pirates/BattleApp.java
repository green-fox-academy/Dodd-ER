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

    if (hollandier.battle(inHollyness)) {
      hollandier.report();
    } else {
      inHollyness.report();
    }

  }
}
