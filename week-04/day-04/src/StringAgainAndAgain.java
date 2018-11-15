public class StringAgainAndAgain {
  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    String sentence =
        "If you want to really hurt";

    System.out.println(newStarryString(sentence));
  }

  public static String newStarryString(String words) {
    if (words.indexOf(' ') != -1) {
      return newStarryString(words.replaceFirst(" ", "*"));
    }
    return words;
  }
}
