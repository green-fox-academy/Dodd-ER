package pirates;

public class Pirate {
//  Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//
//  drinkSomeRum() - intoxicates the Pirate some
//  howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//    0 to 4 times, "Pour me anudder!"
//    else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//  If you manage to get this far, then you can try to do the following.
//
//  die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//  brawl(x) - where pirate fights another pirate (if that other pirate is alive)
//  and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//  And... if you get that far..
//  Add a parrot.

  int scaleOfDrunkennes;
  String state;
  Parrot parrot;
  int amountOfRum;

  public Pirate(){
    this.scaleOfDrunkennes = 0;
    this.state = "alive";
    this.parrot = new Parrot();
    this.amountOfRum = 0;
  }

  public void drinkSomeRum(){
    if (this.state == "alive") {
      this.scaleOfDrunkennes++;
      this.amountOfRum++;
    }
  }

  public String howsItGoingMate(){
    String answer;
    if (this.state == "dead") {
      answer = "He is dead!";
    } else if (this.scaleOfDrunkennes <= 4) {
      answer = "Pour me anudder!";
      drinkSomeRum();
    } else {
      answer = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      drinkSomeRum();
      this.state = "passed out";
    }
    return answer;
  }

  public void die(Pirate pirate){
    this.state = "dead";
  }

  public void brawl(Pirate defender){
    int num = (int)(Math.random() * 3);
    if (this.state == "passed out") {
      die(this);
    } else if (defender.state == "passed out") {
      die(defender);
    } else if (num == 1) {
      die(this);
    } else if (num == 2) {
      die(defender);
    } else {
      this.scaleOfDrunkennes = 0;
      this.state = "passed out";
      defender.scaleOfDrunkennes = 0;
      defender.state = "passed out";
    }
  }
}
