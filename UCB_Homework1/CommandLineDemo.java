//Hannah Copperman
//HW problem 1.a
//Usage: java CommandLineDemo [args]
//ie: >>java CommandLineDemo these are arguments
//Sample output: 
//  Argument 1: these
//  Argument 2: are
//  Argument 3: arguments

class CommandLineDemo {
  //tries to read in args from command line
  //if args are present, prints them out on their own line with their position 
  //in arg list, and exits with code 0
  //if not, prints "Please enter command line args" and exits with code 2
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Please enter command line arguments");
      System.exit(2);
    } else {
      int arg_counter = 1;
      for (String arg: args) {
        System.out.println("Argument " + arg_counter + ": " + arg);
        arg_counter +=1;
      }
      System.exit(0);
    }
  }

}

