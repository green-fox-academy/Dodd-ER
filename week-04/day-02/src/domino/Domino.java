package domino;

public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino d) {
    if (d.getLeftSide() != this.getLeftSide()) {
      if (d.getLeftSide() < this.getLeftSide()) {
        return 1;
      } else {
        return -1;
      }
    } else if (d.getRightSide() < this.getRightSide()) {
      return 1;
    } else {
      return -1;
    }
  }
}
