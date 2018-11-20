package gardenapp;

public class Plant {
  String color;
  double waterAmount;

  public Plant(String color) {
    this.color = color;
    waterAmount = 0;
  }

  public String needsWaterToString(Plant plant) {
    String answer;

    if ((plant instanceof Flower && plant.waterAmount < 5) || (plant instanceof Tree && plant.waterAmount < 10)) {
      answer = "needs water.";
    } else {
      answer = "doesn't need water.";
    }

    return answer;
  }
}
