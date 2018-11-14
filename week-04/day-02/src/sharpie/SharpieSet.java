package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
//    Reuse your Sharpie class
//    Create SharpieSet class
//    it contains a list of Sharpie
//            countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies
  List<Sharpie> listOfSharpie = new ArrayList<>();

  public SharpieSet(){
    for (int i = 0; i < 10; i++){
      this.listOfSharpie.add(i, new Sharpie());
    }
  }

  public int countUsable() {
    int numOfUsable = 0;
    for (Sharpie elements : listOfSharpie) {
      if (elements.inkAmount > 0) {
        numOfUsable++;
      }
    }
    return numOfUsable;
  }

  public void removeTrash(){
    for (int i = 0; i < listOfSharpie.size(); i++) {
      if (listOfSharpie.get(i).inkAmount == 0) {
        listOfSharpie.remove(i);
      }
    }
  }
}
