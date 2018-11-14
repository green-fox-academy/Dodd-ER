package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
//  Create a Farm class
//          it has list of Animals
//          it has slots which defines the number of free places for animals
//          breed() -> creates a new animal if there's place for it
//          slaughter() -> removes the least hungry animal
  List<Animal> listOfAnimal = new ArrayList<>();
  private int places = 15;
  int freePlaces;

  public Farm(){
    for (int i = 0; i < 9; i++){
      this.listOfAnimal.add(i, new Animal());
    }
    this.freePlaces = places - listOfAnimal.size();
  }

  public void breed(){
    if (freePlaces > 0) {
      listOfAnimal.add(new Animal());
      this.freePlaces--;
    }
  }

  public void slaughter(){
    for (int i = 0; i < listOfAnimal.size(); i++){
      if (i < listOfAnimal.size() - 1) {
        if (listOfAnimal.get(i).hunger < listOfAnimal.get(i + 1).hunger) {
          listOfAnimal.remove(i);
          this.freePlaces++;
        }
      }else if (listOfAnimal.get(i - 1).hunger > listOfAnimal.get(i).hunger) {
        listOfAnimal.remove(i);
        this.freePlaces++;
      }
    }
  }
}
