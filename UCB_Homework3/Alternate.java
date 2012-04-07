import java.io.*;

class Alternate {


  public static void main(String[] args) {
    if (args.length == 0 || args.length > 2) {
      System.out.println("Usage: java Alternate [file to read from] [file to write from]");
      System.exit(0);
    }  
    String fileToRead = args[0];
    String fileToWrite = args[1];
    try {
      BufferedReader buff = new BufferedReader(new FileReader(fileToRead));
      FileWriter outF = new FileWriter(fileToWrite);
      String currentLine = buff.readLine();
      int counter = 1;
      while (currentLine != null) {
        if ((counter%2) == 0) {
          outF.write(currentLine + "\n");
        }
        currentLine = buff.readLine();
        counter ++;
      }
      buff.close();
      outF.close();
    }
    catch (IOException exp) {
      System.out.println(exp);

    } 

  }

}
