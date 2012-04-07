//OverloadDemo class defines three static vars
//a float, a double, and an int
//defines an overloaded method sqr() that takes each of those as an arg and returns
//the squared value
//also defines an overloaded method cube() that cubes each one
class OverloadDemo {
  static float floatingNum = 1.2F;
  static double doubleNum = 3.0;
  static int intNum = 5;

  static double sqr(float fNum) {
    return fNum * fNum;
  }

  static double sqr(double dNum) {
    return dNum * dNum;
  }

  static int sqr(int intNum) {
    return intNum * intNum;
  }

  static double cube(float fNum) {
    return sqr(fNum) * fNum;
  }  

  static double cube(double dNum) {
    return sqr(dNum) * dNum;
  }

  static int cube(int iNum) {
    return sqr(iNum) * iNum;
  }


  static void displaySquares() {
    System.out.println("Float, squared: " + sqr(floatingNum));
    System.out.println("Double, squared: " + sqr(doubleNum));
    System.out.println("Int, squared: " + sqr(intNum));
  }

  static void displayCubes() {
    System.out.println("Float, cubed: " + cube(floatingNum));
    System.out.println("Double, cubed: " + cube(doubleNum));
    System.out.println("Int, cubed: " + cube(intNum));
  }

  static void displayNums() {
    System.out.println("Float: " + floatingNum);
    System.out.println("Double: " + doubleNum);
    System.out.println("Int: " + intNum);

  }

  //calls static methods to display results of calling overloaded methods 
  public static void main(String[] args) {
    OverloadDemo.displayNums();
    OverloadDemo.displaySquares();
    OverloadDemo.displayCubes();
  }

}
