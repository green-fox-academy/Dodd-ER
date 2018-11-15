public class StringsAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.

    String sentence =
        "If yoxu waxntx txo realxly hurt";

    System.out.println(removeX(sentence));
  }

  public static String removeX(String words) {
    if (words.indexOf('x') != -1) {
      return removeX(words.replaceFirst("x", ""));
    }
    return words;
  }
}
