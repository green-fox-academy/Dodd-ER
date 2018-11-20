package gardenapp;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ArrayList<Plant> zenGarden = new ArrayList<>();
    Garden myGarden = new Garden(zenGarden);

    zenGarden.add(new Flower("yellow"));
    zenGarden.add(new Flower("blue"));
    zenGarden.add(new Tree("purple"));
    zenGarden.add(new Tree("orange"));

    toWrite(zenGarden);

    System.out.println("\nWatering with 40: ");
    myGarden.watering(40);

    toWrite(zenGarden);

    System.out.println("\nWatering with 70: ");
    myGarden.watering(70);

    toWrite(zenGarden);
  }

  public static void toWrite(List<Plant> list) {

    for (Plant elements : list) {
      if (elements instanceof Flower) {
        System.out.println("The " + elements.color + " Flower " + elements.needsWaterToString(elements));
      } else {
        System.out.println("The " + elements.color + " Tree " + elements.needsWaterToString(elements));
      }
    }
  }
}
