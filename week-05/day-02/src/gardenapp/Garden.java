package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  static List<Plant> plants;

  public Garden(List<Plant> plants) {
    this.plants = plants;
  }

  public List<Plant> needsWater() {
    List<Plant> plantsWhoNeedsWater = new ArrayList<>();

    for (Plant elements : plants) {
      if (elements instanceof Flower) {
        if (elements.waterAmount < 5) {
          plantsWhoNeedsWater.add(elements);
        }
      } else {
        if (elements.waterAmount < 10) {
          plantsWhoNeedsWater.add(elements);
        }
      }
    }
    return plantsWhoNeedsWater;
  }

  public void watering(int amount) {

    if (needsWater().size() > 0) {
      int amountSlashPlant = amount / needsWater().size();

      for (Plant elements : needsWater()) {
        if (elements instanceof Flower) {
          elements.waterAmount += (amountSlashPlant * 0.75);
        } else {
          elements.waterAmount += (amountSlashPlant * 0.4);
        }
      }
    }
  }
}
