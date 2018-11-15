public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    String sentence =
        "If xou want to reallx hurt";

    System.out.println(changeLetters(sentence));
  }

  public static String changeLetters(String words) {
    if (words.indexOf('x') != -1) {
      return changeLetters(words.replaceFirst("x", "y"));
    }
    return words;
  }
}
