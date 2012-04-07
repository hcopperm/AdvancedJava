class SubstringDemo {
  static String sourceText = "Java versus C Programming";

  
  //loops through each char of sourceText
  //once it finds the uppercase "C", prints out from that position
  //to end of string
  //also finds chars at positions 6 and 17
  //converts them to strings and prints them out
  public static void main(String[] args) {
    int letterCIndex = 0;
    int gCount;
    for (int x = 0; x < sourceText.length(); x++ ) {
      if ((sourceText.charAt(x)) == ('C')) {
        letterCIndex = x;
        break;
      }
    }

    char sixthChar = sourceText.charAt(6);
    char seventeenthChar = sourceText.charAt(17);
    System.out.println("Source text: " + sourceText);
    System.out.print("From " + letterCIndex + " to " + sourceText.length() + ": ");
    System.out.println(sourceText.substring(letterCIndex, sourceText.length()));
    System.out.println("6th char is: " + Character.toString(sixthChar) + "\n17th char is: " + Character.toString(seventeenthChar));
    System.out.println("Upper cased: " + sourceText.toUpperCase());

  }




}
